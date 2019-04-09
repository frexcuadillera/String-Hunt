package com.stringhunt.entities.panels;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.entities.Entity;
import com.stringhunt.gfx.Assets;
import com.stringhunt.states.State;
import com.stringhunt.ui.UIEvent;

public class BoardPanel extends Entity {
    	
    	private final int x;
    	private final int y;
    	private final int width;
    	private final int height;
        private final int X_OFFSET = 280;
    	private int hovering[] = {0,0,0};
      	
    	private Handler handler;
    	private UIEvent uiEvent;
   
    	
    public BoardPanel(Handler handler, int x, int y, int width, int height) {
	super(handler, x, y, width, height);
	this.handler = handler;
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	
	uiEvent = new UIEvent(handler);
    }

    @Override
    public void tick() {
	hovering[0] = uiEvent.isHovering(x, y, width, height);
	hovering[1] = uiEvent.isHovering(x + X_OFFSET, y, width, height);
	hovering[2] = uiEvent.isHovering(x + X_OFFSET * 2, y, width, height);
	
	if(hovering[0] == 1 && handler.getMouseManager().isLeftPressed()) {
	    for(int i = 0; i < 30; i++) {
		LetterPanel.letterClicked[i] = false;
	    }
	    
	    LetterPanel.letterOnScreenCount = 0;
	}
	
	if(hovering[1] == 1 && handler.getMouseManager().isLeftPressed()) {
	   System.out.println("attack pressed");
	}
	
	if(hovering[2] == 1 && handler.getMouseManager().isLeftPressed()) {
	    System.out.println("menu pressed");
	    //do pause event and menu options here
	    State.setState(handler.getGame().menuState); //temp
	}
	
    }
    

    @Override
    public void render(Graphics g) {
	g.drawImage(Assets.btn_reset[hovering[0]], x, y, width, height, null);
	g.drawImage(Assets.btn_attack[hovering[1]], x + X_OFFSET, y, width, height, null);
	g.drawImage(Assets.btn_menu[hovering[2]], x + X_OFFSET * 2, y, width, height, null);
	
    }

}
    
