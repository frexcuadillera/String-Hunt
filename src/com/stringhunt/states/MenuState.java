package com.stringhunt.states;

import java.awt.Graphics;

import javax.swing.JOptionPane;

import com.stringhunt.Handler;
import com.stringhunt.gfx.Assets;
import com.stringhunt.ui.UIEvent;

public class MenuState extends State {
    
    private final int X_POSITION = 300;
    private final int Y_POSITION = 120;
    private final int width = 200;
    private final int height = 50;
    private final int Y_OFFSET = 60;
    private int[] hovering = {0,0,0,0,0};
    
    private UIEvent uiEvent;
    
    public MenuState(final Handler handler) {
		super(handler);
		
		uiEvent = new UIEvent(handler);
    }

    @Override
    public void tick() {	
		hovering[0] = uiEvent.isHovering(X_POSITION, Y_POSITION, width, height);
		hovering[1] = uiEvent.isHovering(X_POSITION, Y_POSITION + Y_OFFSET, width, height);
		hovering[2] = uiEvent.isHovering(X_POSITION, Y_POSITION + Y_OFFSET * 2, width, height);
		hovering[3] = uiEvent.isHovering(X_POSITION, Y_POSITION + Y_OFFSET * 3, width, height);
		hovering[4] = uiEvent.isHovering(X_POSITION, Y_POSITION + Y_OFFSET * 4, width, height);
		
		if(hovering[0] == 1 && handler.getMouseManager().isLeftPressed()) {
		    State.setState(handler.getGame().gameState);
		}
		
		if(hovering[1] == 1 && handler.getMouseManager().isLeftPressed()) {
		    State.setState(handler.getGame().tutorialState);
		}
		
		if(hovering[2] == 1 && handler.getMouseManager().isLeftPressed()) {
		    State.setState(handler.getGame().descriptionState);
		}
		
		if(hovering[3] == 1 && handler.getMouseManager().isLeftPressed()) {
		    State.setState(handler.getGame().creditsState);
		}
		
		if(hovering[4] == 1 && handler.getMouseManager().isLeftPressed()) {
	 	    
		    int quitOption = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?","String Hunt",JOptionPane.YES_NO_OPTION);
		    
		    if(quitOption == 0) {
			System.exit(0);
		    }		    
		}
    }

    @Override
    public void render(Graphics g) {
		g.drawImage(Assets.background, 0, 0, null);
		g.drawImage(Assets.btn_start[hovering[0]], X_POSITION, Y_POSITION, width, height, null);
		g.drawImage(Assets.btn_tutorial[hovering[1]], X_POSITION, Y_POSITION + Y_OFFSET, width, height, null);
		g.drawImage(Assets.btn_description[hovering[2]], X_POSITION, Y_POSITION + Y_OFFSET * 2, width, height, null);
		g.drawImage(Assets.btn_credits[hovering[3]], X_POSITION, Y_POSITION + Y_OFFSET * 3, width, height, null);
		g.drawImage(Assets.btn_quit[hovering[4]], X_POSITION, Y_POSITION + Y_OFFSET * 4, width, height, null);
    }

}
