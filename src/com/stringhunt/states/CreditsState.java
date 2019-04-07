package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.gfx.Assets;
import com.stringhunt.ui.ClickListener;
import com.stringhunt.ui.UIImageButton;
import com.stringhunt.ui.UIManager;

public class CreditsState extends State {

    private UIManager uiManager;
    
    public CreditsState(Handler handler) {
	super(handler);
	uiManager = new UIManager(handler);
	handler.getMouseManager().setUIManager(uiManager);
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
