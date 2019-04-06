package com.stringhunt.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;

import com.stringhunt.Handler;

public class Player extends Creature {
    
    private Handler handler;

    public Player(Handler handler, float x, float y, int width, int height) {
	super(x, y, width, height);
	this.handler = handler;
    }

    @Override
    public void tick() {
	
	//temp movement test
	
	if(handler.getKeyManager().up)
	    y -= 3;
	if(handler.getKeyManager().down)
	    y += 3;
	if(handler.getKeyManager().left)
	    x -= 3;
	if(handler.getKeyManager().right)
	    x += 3;
	
    }

    @Override
    public void render(Graphics g) {
	
	//g.drawImage(Assets.player, 50, 50, null);
	
	//test player movement around screen
	g.setColor(Color.BLACK);
	g.fillRect((int)x, (int) y, 50, 50);
	
    }    
    
}
