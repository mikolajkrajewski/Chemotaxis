Bacteria [] jediKnights;
Predator jango;
 void setup()   
 {     
   size(600,600);  
   jediKnights = new Bacteria[200];
   for(int i = 0; i<jediKnights.length; i++)
   {
     jediKnights[i] = new Bacteria((int)(Math.random()*600),(int)(Math.random()*600));
   }
   jango = new Predator(mouseX,mouseY);
 }   
 void draw()   
 {    
   background(0);
   if(mousePressed == true)
   {
     for(int i = 0; i<jediKnights.length; i++)
     {
       jediKnights[i].move();
       jediKnights[i].show();
     }
     jango.predMove();
     jango.predShow();
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
   void show()
   {
     strokeWeight(5);
     stroke(myColor);
     noFill();
     ellipse(myX,myY,20,20);
   }
   void move()
   {
     if(myX < mouseX)
     {
       myX += (int)(Math.random()*4);
     }
     else
     {
       myX += (int)(Math.random()*5)-4;
     }
     if(myY < mouseY)
     {
       myY += (int)(Math.random()*4);
     }
     else
     {
       myY += (int)(Math.random()*5)-4;
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
   void predShow()
   {
     noStroke();
     fill(mypColor);
     ellipse(mypX,mypY,50,50);
   }
   void predMove()
   {
     mypX = mouseX + (int)(Math.random()*7)-3;
     mypY = mouseY + (int)(Math.random()*7)-3;
   }
 }