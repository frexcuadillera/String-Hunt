package com.stringhunt.states;

import java.awt.Color;
import java.awt.Graphics;

import com.stringhunt.Handler;

public class MenuState extends State {
    
    public MenuState(Handler handler) {
	super(handler);
	
    }

    @Override
    public void tick() {
	//System.out.println("x: " +handler.getMouseManager().getMouseX()+ " y: " +handler.getMouseManager().getMouseY());
//	if(handler.getMouseManager().isLeftPressed()) {
//	    State.setState(handler.getGame().gameState);
//	}
	
	
	
    }

    @Override
    public void render(Graphics g) {
	g.drawString("this is menu frame", 60, 60); //temp
	g.setColor(Color.red);
	g.fillRect(handler.getMouseManager().getMouseX(), handler.getMouseManager().getMouseY(), 8, 8);
	
    }

}
