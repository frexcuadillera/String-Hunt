package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.gfx.Assets;
import com.stringhunt.ui.ClickListener;
import com.stringhunt.ui.UIImageButton;
import com.stringhunt.ui.UIManager;

public class MenuState extends State {
    
    private UIManager uiManager;
    private final float X_POSITION = 300;
    private final float Y_POSITION = 120;
    private final float Y_OFFSET = 60;
    
    public MenuState(Handler handler) {
	super(handler);
	uiManager = new UIManager(handler);
	handler.getMouseManager().setUIManager(uiManager);
		
	uiManager.addObject(new UIImageButton(X_POSITION, Y_POSITION, 200, 50, Assets.btn_start, new ClickListener() {	    
	    @Override
	    public void onClick() {
		State.setState(handler.getGame().gameState);
	    }
	    
	}));
	
	uiManager.addObject(new UIImageButton(X_POSITION, Y_POSITION + Y_OFFSET, 200, 50, Assets.btn_tutorial, new ClickListener() {	    
	    @Override
	    public void onClick() {
		State.setState(handler.getGame().tutorialState);
	    }
	    
	}));
	
	uiManager.addObject(new UIImageButton(X_POSITION, Y_POSITION + (Y_OFFSET * 2), 200, 50, Assets.btn_credits, new ClickListener() {	    
	    @Override
	    public void onClick() {
		State.setState(handler.getGame().creditsState);
	    }
	    
	}));
	
	uiManager.addObject(new UIImageButton(X_POSITION, Y_POSITION + (Y_OFFSET * 3), 200, 50, Assets.btn_quit, new ClickListener() {	    
	    @Override
	    public void onClick() {
		System.out.println("Quit button pressed");
	    }
	    
	}));
	
    }

    @Override
    public void tick() {
	uiManager.tick();
    }

    @Override
    public void render(Graphics g) {
	g.drawImage(Assets.background, 0, 0, null);
	uiManager.render(g);
    }

}
