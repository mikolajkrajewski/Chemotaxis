Bacteria [] jediKnights;
 void setup()   
 {     
 	size(600,600);  
 	jediKnights = new Bacteria[20];
 	for(int i = 0; i<jediKnights.length; i++)
 	{
 		jediKnights[i] = new Bacteria(300,300);
 	}
 }   
 void draw()   
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
 	void show()
 	{
 		strokeWeight(5);
 		stroke(myColor);
 		noFill();
 		ellipse(myX,myY,25,25);
 	}
 	void move()
 	{
 		myX = myX + (int)(Math.random()*7)-3;
 		myY = myY + (int)(Math.random()*7)-3;
 	}
 }    