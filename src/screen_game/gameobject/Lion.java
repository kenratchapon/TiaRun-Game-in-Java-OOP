/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen_game.gameobject;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import static screen_game.MainCharacter.x;
import static userinterface.PlayScreen.GROUNDY;
import util.Animation;
import util.Resource;

/**
 *
 * @author ADMINS
 */
public class Lion extends Dog{
    private BufferedImage imageJump, imageOver, imageSelect, imageSelected, imageBuy;
    private float y;
    private int price = 25;
    private boolean purchased = false;
    
    private Rectangle rect;
    private Animation characterRun;
    
    public Lion(){
        characterRun = new Animation(200);
        rect = new Rectangle();
        
        characterRun.addFrame(Resource.getResource("data/character/lion/lion1.png"));
        characterRun.addFrame(Resource.getResource("data/character/lion/lion2.png"));
        characterRun.addFrame(Resource.getResource("data/character/lion/lion3.png"));
        
        imageJump = Resource.getResource("data/character/lion/lion2.png");
        imageOver = Resource.getResource("data/character/lion/lion4.png");
        imageSelect = Resource.getResource("data/character/lion/lion_select.png");
        imageSelected = Resource.getResource("data/character/lion/lion_selected.png");
        imageBuy = Resource.getResource("data/character/lion/lion_buy.png");
        
        y = GROUNDY - imageJump.getHeight();  
    }
    
    @Override
    public void setBound(int y) {        
        rect.x = (int)x + 22;
        rect.y = (int)y;
        rect.width = imageJump.getWidth() - 27;
        rect.height = imageJump.getHeight();
    }
    
    @Override
    public Animation getAnimation() {
        return characterRun;
    }
    
    @Override
    public Rectangle getBound() {        
        return rect;
    }

    @Override
    public BufferedImage getImageJump() {
        return imageJump;
    }

    @Override
    public BufferedImage getImageOver() {
        return imageOver;
    }

    @Override
    public float getPosX() {
        return x;
    }

    @Override
    public float getPosY() {
        return y;
    }
    
    @Override
    public BufferedImage getImageSelect() {
        return imageSelect;
    }

    @Override
    public BufferedImage getImageSelected() {
        return imageSelected;
    }

    @Override
    public BufferedImage getImageBuy() {
        return imageBuy;
    }
    
    @Override
    public boolean isPurchased(){
        return purchased;
    }
    
    @Override
    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }
    
    @Override
    public int getPrice() {
        return price;
    }
}
