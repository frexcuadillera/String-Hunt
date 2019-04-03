package com.stringhunt.entities.creatures;

import java.awt.Color;
import java.awt.Graphics;

import com.stringhunt.Game;

public class Player extends Creature {
    
    private Game game;

    public Player(Game game, float x, float y, int width, int height) {
	super(x, y, width, height);
	this.game = game;
    }

    @Override
    public void tick() {
	
	//temp movement test
	
	if(game.getKeyManager().up)
	    y -= 3;
	if(game.getKeyManager().down)
	    y += 3;
	if(game.getKeyManager().left)
	    x -= 3;
	if(game.getKeyManager().right)
	    x += 3;
	
    }

    @Override
    public void render(Graphics g) {
	
	//g.drawImage(Assets.player, 50, 50, null);
	
	//test player movement around screen
	g.setColor(Color.BLACK);
	g.fillRect((int)x, (int) y, 50, 50);
	
    }    
    
}
