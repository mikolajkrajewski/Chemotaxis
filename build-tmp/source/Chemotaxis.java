import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria [] jediKnights;
Food jango;
public void setup()   
 {     
   size(600,600);  
   jediKnights = new Bacteria[100];
   for(int i = 0; i<jediKnights.length; i++)
   {
     jediKnights[i] = new Bacteria((int)(Math.random()*600),(int)(Math.random()*600));
   }
   jango = new Food(mouseX,mouseY);
   frameRate(960);
 }   
 public void draw()   
 {    
   background(0);
   if(mousePressed == true)
   {
     for(int i = 0; i<jediKnights.length; i++)
     {
       jediKnights[i].move();
       jediKnights[i].show();
     }
     jango.foodMove();
     jango.foodShow();
   }
   else
   {
     fill(255);
     textAlign(CENTER);
     textSize(25);
     text("Click the mouse for a scare.",300,275);
     text("Hold the mouse if you're brave.",300,300);
     text("The goal is the not get caught.",300,325);
   }
 }  
 class Bacteria    
 {     
   int myX, myY, myColor;
   Bacteria(int x, int y)
   {
     myX = x;
     myY = y;
     myColor = color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
   }
   public void show()
   {
     strokeWeight(5);
     stroke(myColor);
     noFill();
     ellipse(myX,myY,20,20);
   }
   public void move()
   {
     if(myX < mouseX)
     {
       myX += (int)(Math.random()*3);
     }
     else
     {
       myX += (int)(Math.random()*3)-2;
     }
     if(myY < mouseY)
     {
       myY += (int)(Math.random()*3);
     }
     else
     {
       myY += (int)(Math.random()*3)-2;
     }
   }
 }    
 class Food
 {
   int myfX, myfY, myfColor;
   Food(int pX, int pY)
   {
     myfX = pX;
     myfY = pY;
     myfColor = color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
   }
   public void foodShow()
   {
     noStroke();
     fill(myfColor);
     ellipse(myfX,myfY,50,50);
   }
   public void foodMove()
   {
     myfX = mouseX + (int)(Math.random()*7)-3;
     myfY = mouseY + (int)(Math.random()*7)-3;
   }
 }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
