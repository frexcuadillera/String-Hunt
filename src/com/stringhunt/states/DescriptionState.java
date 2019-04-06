package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;

public class DescriptionState extends State {

    public DescriptionState(Handler handler) {
	super(handler);
	// TODO Auto-generated constructor stub
    }

    @Override
    public void tick() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void render(Graphics g) {
	g.drawString("this is description frame", 60, 60);
	
    }

}
