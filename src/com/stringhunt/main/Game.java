package com.stringhunt.main;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable{

    private static final long serialVersionUID = -2685933291249646808L;
    
    public static final int WIDTH = 1000, HEIGHT = WIDTH / 16 * 9;
    private Thread thread;
    private boolean running = false;
    
    private Handler handler;
    private Menu menu;
    
    public enum STATE{
	Menu,
	Game,
	Description,
	Tutorial,
	Credits
    };
    
    public STATE gameState = STATE.Menu;
    
    public Game() {
	new Window(WIDTH, HEIGHT, "String Hunt", this);
	
	handler = new Handler();
	menu = new Menu();
    }
    
    public synchronized void start() {
	thread = new Thread(this);
	thread.start();
	running = true;
    }
    
    public synchronized void stop() {
	try {
	    thread.join();
	    running = false;
	}catch(Exception e){
	    e.printStackTrace();
	}
    }
    
    public void run() {
	long lastTime = System.nanoTime();
	double amountOfTicks = 60.0;
	double ns = 1000000000 / amountOfTicks;
	double delta = 0;
	long timer = System.currentTimeMillis();
	int frames = 0;
	
	while(running) {
	    long now = System.nanoTime();
	    delta += (now - lastTime) / ns;
	    lastTime = now;
	    
	    while(delta >= 1) {
		tick();
		delta--;
	    }
	    
	    if(running) {
		render();
	    }
		
	    frames++;
	    
	    if(System.currentTimeMillis() - timer > 1000) {
		timer += 1000;
		System.out.println("FPS: " +frames);
		frames = 0;
	    }
	}
	
	stop();
    }
    
    private void tick() {
	handler.tick();
	
	// tick states here
	
	if(gameState == STATE.Menu) {
	    menu.tick();
	}
	
    }
        
    private void render() {
	BufferStrategy bs = this.getBufferStrategy();
	
	if(bs == null) {
	    this.createBufferStrategy(3);
	    return;
	}
	
	Graphics g = bs.getDrawGraphics();
	
	handler.render(g);
	
	//render game state here
	
	if(gameState == STATE.Menu) {
	    menu.render(g);
	}
	
	
	g.dispose();
	bs.show();
	
    }

    public static void main(String[] args) {
	new Game();
    }

}
