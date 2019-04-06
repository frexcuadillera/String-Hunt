package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;

public class CreditsState extends State {

    public CreditsState(Handler handler) {
	super(handler);
	// TODO Auto-generated constructor stub
    }

    @Override
    public void tick() {
	// TODO Auto-generated method stub
	
    }

    @Override
    public void render(Graphics g) {
	g.drawString("this is credits frame", 60, 60); //temp
	
    }

}
