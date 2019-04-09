package com.stringhunt.entities.panels;

import java.awt.Color;
import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.entities.Entity;
import com.stringhunt.gfx.Assets;
import com.stringhunt.ui.UIEvent;

public class LetterPanel extends Entity {

    private int OFFSET = 55;
    private int[] letterGenerator;
    public static boolean[] letterClicked;
    
    private UIEvent uiEvent;

    public LetterPanel(Handler handler, int x, int y, int width, int height) {
	super(handler, x, y, width, height);
	uiEvent = new UIEvent(handler);
	letterGenerator = new int[30];
	letterClicked = new boolean[30];
    }

    @Override
    public void tick() {
	for(int g = 25; g > 0; g--) {
	    letterGenerator[g] = g;
	}
	
	for(int i = 0; i < 3; i++) {
	    for(int j = 0; j < 10; j++) {
		if(!letterClicked[(i*10)+j] && uiEvent.isClicked(x + OFFSET * j, y + OFFSET * i, 50, 50) == 1) {
		    letterClicked[(i*10)+j] = true;
		}		
	    }
	    
	}
	
	
    }

    @Override
    public void render(Graphics g) {	
	for(int i = 0; i < 3; i++) {
	    for(int j = 0; j < 10; j++) {
		if(letterClicked[(i*10)+j]) {
		    g.drawImage(Assets.btn_letters_hover[letterGenerator[(i*10)+j]], x + OFFSET * j, y + OFFSET * i, null);	
		}
		else {
		    g.drawImage(Assets.btn_letters[letterGenerator[(i*10)+j]], x + OFFSET * j, y + OFFSET * i, null);	
		}
		
	    }	    
	}	
    }
}
