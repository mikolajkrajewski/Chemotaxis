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
 public void setup()   
 {     
 	size(600,600);  
 	jediKnights = new Bacteria[20];
 	for(int i = 0; i<jediKnights.length; i++)
 	{
 		jediKnights[i] = new Bacteria(300,300);
 	}
 }   
 public void draw()   
 {    
 	background(0);
 	for(int i = 0; i<jediKnights.length; i++)
 	{
 		jediKnights[i].move();
 		jediKnights[i].show();
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
 		ellipse(myX,myY,25,25);
 	}
 	public void move()
 	{
 		myX = myX + (int)(Math.random()*7)-3;
 		myY = myY + (int)(Math.random()*7)-3;
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
