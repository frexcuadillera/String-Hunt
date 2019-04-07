package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.gfx.Assets;

import com.stringhunt.ui.UIManager;

public class CreditsState extends State {
    
    public CreditsState(Handler handler) {
	super(handler);

    }

    @Override
    public void tick() {

	
    }

    @Override
    public void render(Graphics g) {
	g.drawImage(Assets.background, 0, 0, null);
	
    }

}
