package com.stringhunt.gfx;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Assets {
    
    public static BufferedImage background;
    public static BufferedImage[] btn_start;
    public static BufferedImage[] btn_tutorial;
    public static BufferedImage[] btn_description;
    public static BufferedImage[] btn_credits;
    public static BufferedImage[] btn_quit;
    public static BufferedImage[] btn_back;
    
    //game assets
    public static BufferedImage[] btn_attack;
    public static BufferedImage[] btn_menu;
    public static BufferedImage[] btn_reset; //test
    
    //
    public static BufferedImage[] btn_letters;
    public static BufferedImage[] btn_letters_hover;
    
    public static SpriteSheet enemy_sheet;
    
    public static BufferedImage player;
    
    public static void init() {
	//buffered image array
	
	//menu assets
	btn_start = new BufferedImage[2];
	btn_tutorial = new BufferedImage[2];
	btn_description = new BufferedImage[2];
	btn_credits = new BufferedImage[2];
	btn_quit = new BufferedImage[2];
	btn_back = new BufferedImage[2];
	
	//game assets
	btn_reset = new BufferedImage[2]; //test
	btn_attack = new BufferedImage[2];
	btn_menu = new BufferedImage[2];
	
	//letters
	btn_letters = new BufferedImage[26];
	btn_letters_hover = new BufferedImage[26];
	
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
	btn_description[0] = ImageLoader.loadImage("/ui/button_description_0.png");
	btn_description[1] = ImageLoader.loadImage("/ui/button_description_1.png");
	btn_credits[0] = ImageLoader.loadImage("/ui/button_credits_0.png");
	btn_credits[1] = ImageLoader.loadImage("/ui/button_credits_1.png");
	btn_quit[0] = ImageLoader.loadImage("/ui/button_quit_0.png");
	btn_quit[1] = ImageLoader.loadImage("/ui/button_quit_1.png");
	btn_back[0] = ImageLoader.loadImage("/ui/button_back_0.png");
	btn_back[1] = ImageLoader.loadImage("/ui/button_back_1.png");
	
	//game assets
	btn_reset[0] = ImageLoader.loadImage("/ui/button_reset_0.png");
	btn_reset[1] = ImageLoader.loadImage("/ui/button_reset_1.png");
	btn_attack[0] = ImageLoader.loadImage("/ui/button_attack_0.png");
	btn_attack[1] = ImageLoader.loadImage("/ui/button_attack_1.png");
	btn_menu[0] = ImageLoader.loadImage("/ui/button_menu_0.png");
	btn_menu[1] = ImageLoader.loadImage("/ui/button_menu_1.png");

	//letters
	btn_letters[0] = ImageLoader.loadImage("/letters/A.png");
	btn_letters[1] = ImageLoader.loadImage("/letters/B.png");
	btn_letters[2] = ImageLoader.loadImage("/letters/C.png");
	btn_letters[3] = ImageLoader.loadImage("/letters/D.png");
	btn_letters[4] = ImageLoader.loadImage("/letters/E.png");
	btn_letters[5] = ImageLoader.loadImage("/letters/F.png");
	btn_letters[6] = ImageLoader.loadImage("/letters/G.png");
	btn_letters[7] = ImageLoader.loadImage("/letters/H.png");
	btn_letters[8] = ImageLoader.loadImage("/letters/I.png");
	btn_letters[9] = ImageLoader.loadImage("/letters/J.png");
	btn_letters[10] = ImageLoader.loadImage("/letters/K.png");
	btn_letters[11] = ImageLoader.loadImage("/letters/L.png");
	btn_letters[12] = ImageLoader.loadImage("/letters/M.png");
	btn_letters[13] = ImageLoader.loadImage("/letters/N.png");
	btn_letters[14] = ImageLoader.loadImage("/letters/O.png");
	btn_letters[15] = ImageLoader.loadImage("/letters/P.png");
	btn_letters[16] = ImageLoader.loadImage("/letters/QU.png");
	btn_letters[17] = ImageLoader.loadImage("/letters/R.png");
	btn_letters[18] = ImageLoader.loadImage("/letters/S.png");
	btn_letters[19] = ImageLoader.loadImage("/letters/T.png");
	btn_letters[20] = ImageLoader.loadImage("/letters/U.png");
	btn_letters[21] = ImageLoader.loadImage("/letters/V.png");
	btn_letters[22] = ImageLoader.loadImage("/letters/W.png");
	btn_letters[23] = ImageLoader.loadImage("/letters/X.png");
	btn_letters[24] = ImageLoader.loadImage("/letters/Y.png");
	btn_letters[25] = ImageLoader.loadImage("/letters/Z.png");
	
	//letter hover
	btn_letters_hover[0] = ImageLoader.loadImage("/letters_hover/A.png");
	btn_letters_hover[1] = ImageLoader.loadImage("/letters_hover/B.png");
	btn_letters_hover[2] = ImageLoader.loadImage("/letters_hover/C.png");
	btn_letters_hover[3] = ImageLoader.loadImage("/letters_hover/D.png");
	btn_letters_hover[4] = ImageLoader.loadImage("/letters_hover/E.png");
	btn_letters_hover[5] = ImageLoader.loadImage("/letters_hover/F.png");
	btn_letters_hover[6] = ImageLoader.loadImage("/letters_hover/G.png");
	btn_letters_hover[7] = ImageLoader.loadImage("/letters_hover/H.png");
	btn_letters_hover[8] = ImageLoader.loadImage("/letters_hover/I.png");
	btn_letters_hover[9] = ImageLoader.loadImage("/letters_hover/J.png");
	btn_letters_hover[10] = ImageLoader.loadImage("/letters_hover/K.png");
	btn_letters_hover[11] = ImageLoader.loadImage("/letters_hover/L.png");
	btn_letters_hover[12] = ImageLoader.loadImage("/letters_hover/M.png");
	btn_letters_hover[13] = ImageLoader.loadImage("/letters_hover/N.png");
	btn_letters_hover[14] = ImageLoader.loadImage("/letters_hover/O.png");
	btn_letters_hover[15] = ImageLoader.loadImage("/letters_hover/P.png");
	btn_letters_hover[16] = ImageLoader.loadImage("/letters_hover/QU.png");
	btn_letters_hover[17] = ImageLoader.loadImage("/letters_hover/R.png");
	btn_letters_hover[18] = ImageLoader.loadImage("/letters_hover/S.png");
	btn_letters_hover[19] = ImageLoader.loadImage("/letters_hover/T.png");
	btn_letters_hover[20] = ImageLoader.loadImage("/letters_hover/U.png");
	btn_letters_hover[21] = ImageLoader.loadImage("/letters_hover/V.png");
	btn_letters_hover[22] = ImageLoader.loadImage("/letters_hover/W.png");
	btn_letters_hover[23] = ImageLoader.loadImage("/letters_hover/X.png");
	btn_letters_hover[24] = ImageLoader.loadImage("/letters_hover/Y.png");
	btn_letters_hover[25] = ImageLoader.loadImage("/letters_hover/Z.png");
	//player assets
	
	
	//load spritesheet heres
	//load image first to convert as spritesheet
	
	//SpriteSheet ui_sheet = new SpriteSheet(ImageLoader.loadImage("/sheets/blueSheet.png"));	
	//btn_start[0] = ui_sheet.crop(0, 0, 190, 49);
	//btn_start[1] = ui_sheet.crop(0, 50, 190, 49);
    }

}
