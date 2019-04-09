package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.entities.panels.*;
import com.stringhunt.gfx.Assets;

public class GameState extends State {
    
    
    //declare game entities here
    private BoardPanel boardPanel;
    private LetterPanel letterPanel;
    private ScenePanel scenePanel;
    
    public GameState(Handler handler) {
	super(handler);
	
	//declare entities x,y,w,h
	//player = new Player(xpos,ypos, width,height);
	//player = new Player(handler, 100, 100, 50, 50);
	boardPanel = new BoardPanel(handler, 20,380,200,50);
	letterPanel = new LetterPanel(handler, 50,180,700,100);
	scenePanel = new ScenePanel(handler, 100,100, 100, 100);
    }

    @Override
    public void tick() {
	boardPanel.tick();
	letterPanel.tick();
	scenePanel.tick();
    }

    @Override
    public void render(Graphics g) {
	//g.drawImage(Assets.background, 0, 0, null);
	boardPanel.render(g);
	letterPanel.render(g);
	scenePanel.render(g);	
    }
}
