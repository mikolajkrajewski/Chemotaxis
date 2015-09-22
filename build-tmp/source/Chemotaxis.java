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
Predator jango;
 public void setup()   
 {     
   size(600,600);  
   jediKnights = new Bacteria[200];
   for(int i = 0; i<jediKnights.length; i++)
   {
     jediKnights[i] = new Bacteria((int)(Math.random()*600),(int)(Math.random()*600));
   }
   jango = new Predator(mouseX,mouseY);
 }   
 public void draw()   
 {    
   background(0);
   for(int i = 0; i<jediKnights.length; i++)
   {
     jediKnights[i].move();
     jediKnights[i].show();
   }
   jango.predMove();
   jango.predShow();
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
       myX += (int)(Math.random()*2);
     }
     else
     {
       myX += (int)(Math.random()*2)-1;
     }
     if(myY < mouseY)
     {
       myY += (int)(Math.random()*2);
     }
     else
     {
       myY += (int)(Math.random()*2)-1;
     }
   }
 }    
 class Predator
 {
   int mypX, mypY, mypColor;
   Predator(int pX, int pY)
   {
     mypX = pX;
     mypY = pY;
     mypColor = color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
   }
   public void predShow()
   {
     noStroke();
     fill(mypColor);
     ellipse(mypX,mypY,50,50);
   }
   public void predMove()
   {
     mypX = mouseX + (int)(Math.random()*7)-3;
     mypY = mouseY + (int)(Math.random()*7)-3;
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
