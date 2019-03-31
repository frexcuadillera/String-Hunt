package com.stringhunt.main;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends MouseAdapter {
    
    public void mousePressed(MouseEvent e) {
	
    }
    
    public void mouseReleased(MouseEvent e) {
	
    }
    
    public void tick() {
	
    }
    
    public void render(Graphics g) {
	g.drawString("menu", 100, 200);
	g.drawRect(80, 180, 120, 120);
    }
}
