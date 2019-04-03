package com.stringhunt.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
    
    private boolean[] keys;
    public boolean up, down, left, right; //temp
    
    public KeyManager() {
	keys = new boolean[256];
    }
    
    public void tick() {
	
	/* temp */
	up = keys[KeyEvent.VK_W];
	down = keys[KeyEvent.VK_S];
	left = keys[KeyEvent.VK_A];
	right = keys[KeyEvent.VK_D];
    }

    @Override
    public void keyPressed(KeyEvent e) {
	
	keys[e.getKeyCode()] = true;
	System.out.println("Pressed! " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
	keys[e.getKeyCode()] = false;
	
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
    }
    

}
