package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Game;

public class MenuState extends State {
    
    public MenuState(Game game) {
	super(game);
	
    }

    @Override
    public void tick() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void render(Graphics g) {
	g.drawString("this is menu frame", 60, 60); //temp
	
    }

}
