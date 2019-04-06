package com.stringhunt.gfx;

import java.awt.image.BufferedImage;

public class Assets {
    
    public static BufferedImage background;
    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_tutorial; 
    public static BufferedImage[] btn_credits;
    public static BufferedImage[] btn_quit;
    
    public static SpriteSheet enemy_sheet;
    
    public static BufferedImage player;
    
    public static void init() {
	//buffered image array
	btn_start = new BufferedImage[2];
	btn_tutorial = new BufferedImage[2];
	btn_credits = new BufferedImage[2];
	btn_quit = new BufferedImage[2];
	
	
	//spritesheets
	//enemy_sheet = new SpriteSheet(ImageLoader.loadImage("/test/test_sprite.png"));
	
	
	//load image here
	//testImage = ImageLoader.loadImage("/textures/test.jpg");
	
	
	// main menu assets
	background = ImageLoader.loadImage("/ui/background.jpg");
	btn_start[0] = ImageLoader.loadImage("/ui/button_start_0.png");
	btn_start[1] = ImageLoader.loadImage("/ui/button_start_1.png");
	btn_tutorial[0] = ImageLoader.loadImage("/ui/button_tutorial_0.png");
	btn_tutorial[1] = ImageLoader.loadImage("/ui/button_tutorial_1.png");	
	btn_credits[0] = ImageLoader.loadImage("/ui/button_credits_0.png");
	btn_credits[1] = ImageLoader.loadImage("/ui/button_credits_1.png");
	btn_quit[0] = ImageLoader.loadImage("/ui/button_quit_0.png");
	btn_quit[1] = ImageLoader.loadImage("/ui/button_quit_1.png");
	
	//player assets
	
	
	//load spritesheet heres
	//load image first to convert as spritesheet
	
	//SpriteSheet ui_sheet = new SpriteSheet(ImageLoader.loadImage("/sheets/blueSheet.png"));	
	//btn_start[0] = ui_sheet.crop(0, 0, 190, 49);
	//btn_start[1] = ui_sheet.crop(0, 50, 190, 49);
    }

}
