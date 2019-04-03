package com.stringhunt.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    private static final int width = 50, height = 50;
    
    public static BufferedImage img1, img2;
    
    public static void init() {
	//sprite sheet declaration
	
	//load image here
	//testImage = ImageLoader.loadImage("/textures/test.jpg");
	
	//load spritesheet here
	//load image first to convert as spritesheet
	//sheet = new SpriteSheet(bufferedimagename);
	//sheet = new SpriteSheet(testImage);
	
	SpriteSheet sheet  = new SpriteSheet(ImageLoader.loadImage("/textures/test.jpg"));
	
	img1 = sheet.crop(0, 0, width, height);
	img2 = sheet.crop(50, 50, width, height);
    }

}
