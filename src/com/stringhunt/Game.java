package com.stringhunt;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.stringhunt.display.Display;
import com.stringhunt.gfx.Assets;
import com.stringhunt.input.*;
import com.stringhunt.states.*;
import com.stringhunt.ui.*;

public class Game implements Runnable{

    
    private Display display;
    public int width, height;
    public String title;
    
    private boolean running = false;
    private Thread thread;
    private Handler handler;
    
    private BufferStrategy bs;
    private Graphics g;
    
    //States
    public State gameState;
    public State menuState;
    public State tutorialState;
    public State descriptionState;
    public State creditsState;
    
    //input
    private KeyManager keyManager;
    private MouseManager mouseManager;
       
    //game constructor
    public Game(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;
		keyManager = new KeyManager();
		mouseManager = new MouseManager();	
    }
    
    //initialize here
    private void init() {
		display = new Display(title, width, height);
		display.getFrame().addKeyListener(keyManager);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);
		Assets.init();
		
		handler = new Handler(this);
			
		//initialize states
		gameState = new GameState(handler);
		menuState = new MenuState(handler);
		tutorialState = new TutorialState(handler);
		descriptionState = new DescriptionState(handler);
		creditsState = new CreditsState(handler);
		
		//set menu as state on startup
		State.setState(menuState);
		
	    }
	    
	    //tick and render
	    
	    private void tick() {
		keyManager.tick();
		
		if(State.getState() != null) {
		    State.getState().tick();
		}		
    }
    
    private void render() {
		bs = display.getCanvas().getBufferStrategy();
		
		if(bs == null) {
		    display.getCanvas().createBufferStrategy(3);
		    return;
		}
		
		g = bs.getDrawGraphics();
		
		//clear screen
		
		g.clearRect(0, 0, width, height);
		
		if(State.getState() != null) {
		    State.getState().render(g);
		}
		
		bs.show();
		g.dispose();
    }
    
    //game loop------------------------------
    
    public void run() {
	
		init();
		
		int fps = 60;
		double timePerTick = 100000000 / fps;
		double delta = 0;
		long now;
		long lastTime = System.nanoTime();
		long timer = 0;
		int ticks = 0;
		
		while(running) {
		    
		    now = System.nanoTime();
		    delta += (now - lastTime) / timePerTick;
		    timer += now - lastTime;
		    lastTime = now;
		    
		    if (delta >= 1) {
			tick();
			render();
			ticks++;
			delta--;
		    }
		    
		    if(timer >= 100000000) {
			//System.out.println("Ticks and Frames: " + ticks);
			ticks = 0;
			timer = 0;
		    }
		    
		}
		
		stop();
    }
    
    // input manager------------------------------
    
    public KeyManager getKeyManager() {
		return keyManager;
    }
    
    public MouseManager getMouseManager() {
		return mouseManager;
    }
    
    
    
    //threading----------------------------------
    
    public synchronized void start() {
		if(running) {
		    return;
		}	   
		
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	    
	public synchronized void stop() {
		if(!running)
		    return;
		
		running = false;
		
		try {
		    thread.join();
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
    }
}