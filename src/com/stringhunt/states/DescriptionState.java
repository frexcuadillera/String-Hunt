package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.gfx.Assets;
import com.stringhunt.ui.UIEvent;

public class DescriptionState extends State {
    
    private final int backX = 20;
    private final int backY = 380;
    private final int backWidth = 200;
    private final int backHeight = 50;
    
    private int backHover = 0;
    
    private UIEvent uiEvent;
    public DescriptionState(Handler handler) {
	super(handler);
	uiEvent = new UIEvent(handler);
    }

    @Override
    public void tick() {
	
	backHover = uiEvent.isHovering(backX, backY, backWidth, backHeight);

	if(backHover == 1 && handler.getMouseManager().isLeftPressed()) {
	    State.setState(handler.getGame().menuState);
	}
	
    }

    @Override
    public void render(Graphics g) {
	g.drawImage(Assets.background, 0, 0, null);
	g.drawImage(Assets.btn_back[backHover], backX, backY, backWidth, backHeight, null);
	
    }

}
