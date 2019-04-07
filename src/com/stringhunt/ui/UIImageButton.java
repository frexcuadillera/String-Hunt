// test class not used

package com.stringhunt.ui;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.awt.event.MouseEvent;

import com.stringhunt.Handler;

public class UIImageButton {
    
    private int x;
    private int y;
    private int width;
    private int height;
    private BufferedImage[] image;
    private int imageMode;
    private boolean hovering;
    private Rectangle bounds;
    private Handler handler;
    
    public UIImageButton(Handler handler) {
	this.handler = handler;
    }
    
    public void addUIImageButton(int x, int y, int width, int height, BufferedImage[] image) {
	this.x = x;
	this.y = y;
	this.width = width;
	this.height = height;
	
	bounds = new Rectangle(x, y, width, height);
	
	if(handler.getMouseManager().isLeftPressed() && hovering) {
	    imageMode = 1;
	}
    }
    
    public void tick() {}
    
    public void render(Graphics g) {
	g.drawImage(image[imageMode], x, y, null);
    }
    
    public void onMouseMove(MouseEvent e){
	if(bounds.contains(e.getX(), e.getY())) {
	    hovering = true;
	}		
	else {	
	    hovering = false;
	}			
    }

}
