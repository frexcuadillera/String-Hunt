package com.stringhunt.entities.creatures;

import com.stringhunt.entities.Entity;

public abstract class Creature extends Entity {
    
    //public static final int DEFAULT_HEALTH = 10;
    //public static final int DEFAULT_CREATURE_WIDTH = 64,
    //DEFAULT_CREATURE_HEIGHT = 64;
    
    //public static final float DEFAULT_SPEED = 3.0f;
        
    protected int health; //temp
    //protected float speed;
    
    
    public Creature(float x, float y, int width, int height) {
	super(x, y, width, height);
		
	//health = DEFAULT_HEALTH; //temp
	//speed = DEFAULT_SPEED;
    }
    
    
    
}
