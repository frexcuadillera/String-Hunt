package com.stringhunt.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage[] btn_start;
    
    public static void init() {
	//sprite sheet declaration
	
	//load image here
	//testImage = ImageLoader.loadImage("/textures/test.jpg");
	//btn_start[0] = ImageLoader.loadImage("/textures/blue_button00.jpg");
	//btn_start[1] = ImageLoader.loadImage("/textures/blue_button01.jpg");
	
	//load spritesheet heres
	//load image first to convert as spritesheet
	//sheet = new SpriteSheet(bufferedimagename);
	
	SpriteSheet ui_sheet = new SpriteSheet(ImageLoader.loadImage("/textures/test.jpg"));	
	btn_start[0] = ui_sheet.crop(0, 0, 190, 49);
	btn_start[1] = ui_sheet.crop(0, 50, 190, 49);
    }

}
