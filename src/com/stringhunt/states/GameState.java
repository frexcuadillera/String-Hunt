package com.stringhunt.states;

import java.awt.Color;
import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.entities.creatures.Player;

public class GameState extends State {
    
    
    //declare game entities here
    private Player player;
    
    public GameState(Handler handler) {
	super(handler);
	
	
	//player = new Player(xpos,ypos, width,height);
	player = new Player(handler, 100, 100, 50, 50);
	
    }

    @Override
    public void tick() {
	player.tick();
	
    }

    @Override
    public void render(Graphics g) {
	g.setColor(Color.black);
	g.fillRect(0, 0, 800, 225);
	g.setColor(Color.BLUE);
	g.fillRect(0, 225, 800, 225);
	player.render(g);
	
    }
    
    

}
