package com.stringhunt.ui;

import com.stringhunt.Handler;

public class UIEvent {
    
    private Handler handler;
    
    public UIEvent(Handler handler) {
	this.handler = handler;
    }
    
    public int isHovering(int x, int y, int width, int height) {
	int hoverValue = 0;
	
	if(handler.getMouseManager().getMouseX() >= x && handler.getMouseManager().getMouseX() <= x + width
		&& handler.getMouseManager().getMouseY() >= y && handler.getMouseManager().getMouseY() <= y + height) {
	    hoverValue = 1;
	}else {
	    hoverValue = 0;
	}
	
	return hoverValue;
    }
    
    public int isClicked(int x, int y, int width, int height) {
	int clickValue = 0;
	
	if(handler.getMouseManager().isLeftPressed()
		&& handler.getMouseManager().getMouseX() >= x 
		&& handler.getMouseManager().getMouseX() <= x + width
		&& handler.getMouseManager().getMouseY() >= y 
		&& handler.getMouseManager().getMouseY() <= y + height) {
	    clickValue = 1;
	}else {
	    clickValue = 0;
	}
	
	return clickValue;
    }

}
