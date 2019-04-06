package com.stringhunt.states;

import java.awt.Graphics;

import com.stringhunt.Handler;
import com.stringhunt.entities.creatures.Player;
import com.stringhunt.gfx.Assets;

public class GameState extends State {
    
    
    //declare game entities here
    private Player player;
    
    public GameState(Handler handler) {
	super(handler);
	
	
	//player = new Player(xpos,ypos, width,height);
	player = new Player(handler, 100, 100, 50, 50);
	
    }

    @Override
    public void tick() {
	player.tick();
	
    }

    @Override
    public void render(Graphics g) {
	player.render(g);
	
    }
    
    

}
