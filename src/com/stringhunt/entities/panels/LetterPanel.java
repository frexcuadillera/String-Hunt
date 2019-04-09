package com.stringhunt.entities.panels;

import java.awt.Color;
import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.entities.Entity;
import com.stringhunt.gfx.Assets;
import com.stringhunt.logic.WordGenerator;
import com.stringhunt.ui.UIEvent;

public class LetterPanel extends Entity {

    private int OFFSET = 55;
    public static int letterOnScreenCount;
    private int[] letterGenerator;
    public static boolean[] letterClicked;
    private String wordToAttack;
    
    private WordGenerator wordGenerator;
    private UIEvent uiEvent;

    public LetterPanel(Handler handler, int x, int y, int width, int height) {
	super(handler, x, y, width, height);
	uiEvent = new UIEvent(handler);
	letterGenerator = new int[30];
	letterClicked = new boolean[30];
	
	for(int i = 0; i < 30; i++) {
	    letterClicked[i] = false;
	}
    }

    @Override
    public void tick() {
	
	//test assign letters
	for(int g = 25; g > 0; g--) {
	    letterGenerator[g] = g;
	}
	letterGenerator[26] = 0;
	letterGenerator[27] = 1;
	letterGenerator[28] = 2;
	letterGenerator[29] = 3;
	
	//clicked event letter
	for(int i = 0; i < 3; i++) {
	    for(int j = 0; j < 10; j++) {
		if(!letterClicked[(i*10)+j] && uiEvent.isClicked(x + OFFSET * j, y + OFFSET * i, 50, 50) == 1) {
		    letterClicked[(i*10)+j] = true;
		}		
	    }
	    
	}
	
	letterOnScreenCount = 0;
	for(int i = 0; i < 30; i++) {
	    if(letterClicked[i]){
		letterOnScreenCount++;
	    }
	}
	
	for(int i = 0; i < 3; i++) {
	    for(int j = 0; j < 10; j++) {
		if(!letterClicked[(i*10)+j] && uiEvent.isClicked(x + OFFSET * j, y + OFFSET * i, 50, 50) == 1) {
		    letterClicked[(i*10)+j] = true;
		    break;
		}		
	    }
	    
	}

	
	System.out.println(letterOnScreenCount);

    }

    @Override
    public void render(Graphics g) {	

	g.drawImage(Assets.btn_letters[letterGenerator[0]], x + OFFSET * 0, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[1]], x + OFFSET * 1, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[2]], x + OFFSET * 2, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[3]], x + OFFSET * 3, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[4]], x + OFFSET * 4, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[5]], x + OFFSET * 5, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[6]], x + OFFSET * 6, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[7]], x + OFFSET * 7, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[8]], x + OFFSET * 8, y, null);
	g.drawImage(Assets.btn_letters[letterGenerator[9]], x + OFFSET * 9, y, null);
	
	g.drawImage(Assets.btn_letters[letterGenerator[10]], x + OFFSET * 0, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[11]], x + OFFSET * 1, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[12]], x + OFFSET * 2, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[13]], x + OFFSET * 3, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[14]], x + OFFSET * 4, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[15]], x + OFFSET * 5, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[16]], x + OFFSET * 6, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[17]], x + OFFSET * 7, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[18]], x + OFFSET * 8, y + OFFSET * 1, null);
	g.drawImage(Assets.btn_letters[letterGenerator[19]], x + OFFSET * 9, y + OFFSET * 1, null);
	
	g.drawImage(Assets.btn_letters[letterGenerator[20]], x + OFFSET * 0, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[21]], x + OFFSET * 1, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[22]], x + OFFSET * 2, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[23]], x + OFFSET * 3, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[24]], x + OFFSET * 4, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[25]], x + OFFSET * 5, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[26]], x + OFFSET * 6, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[27]], x + OFFSET * 7, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[28]], x + OFFSET * 8, y + OFFSET * 2, null);
	g.drawImage(Assets.btn_letters[letterGenerator[29]], x + OFFSET * 9, y + OFFSET * 2, null);
	
	for(int i = 0; i < 3; i++) {
	    for(int j = 0; j < 10; j++) {
		if(letterClicked[(i*10)+j]) {
		    g.drawImage(Assets.btn_letters_hover[letterGenerator[(i*10)+j]], x + OFFSET * j, y + OFFSET * i, null);
		}		
	    }
	    
	}
			
    }
}
