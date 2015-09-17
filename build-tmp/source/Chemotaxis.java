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
int r,g,b;
 public void setup()   
 {     
 	size(300,300);  
 	jediKnights = new Bacteria[10];
 	for(int i = 0; i<jediKnights.length; i++)
 	{
 		jediKnights[i] = new Bacteria(150,150);
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
 	int myX, myY;
 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		//r = (int)(Math.random()*256);
 		//b = (int)(Math.random()*256);
 		//g = (int)(Math.random()*256);
 	}
 	public void show()
 	{
 		strokeWeight(5);
 		stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
 		noFill();
 		ellipse(myX,myY,20,20);
 	}
 	public void move()
 	{
 		myX = myX + (int)(Math.random()*5)-2;
 		myY = myY + (int)(Math.random()*5)-2;
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
