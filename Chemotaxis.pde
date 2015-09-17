Bacteria [] jediKnights;
int r,g,b;
 void setup()   
 {     
 	size(300,300);  
 	jediKnights = new Bacteria[10];
 	for(int i = 0; i<jediKnights.length; i++)
 	{
 		jediKnights[i] = new Bacteria(150,150);
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
 	int myX, myY;
 	Bacteria(int x, int y)
 	{
 		myX = x;
 		myY = y;
 		//r = (int)(Math.random()*256);
 		//b = (int)(Math.random()*256);
 		//g = (int)(Math.random()*256);
 	}
 	void show()
 	{
 		strokeWeight(5);
 		stroke((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
 		noFill();
 		ellipse(myX,myY,20,20);
 	}
 	void move()
 	{
 		myX = myX + (int)(Math.random()*5)-2;
 		myY = myY + (int)(Math.random()*5)-2;
 	}
 }    