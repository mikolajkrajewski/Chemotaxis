Bacteria [] jediKnights;
Predator jango;
 void setup()   
 {     
 	size(600,600);  
 	jediKnights = new Bacteria[100];
 	for(int i = 0; i<jediKnights.length; i++)
 	{
 		jediKnights[i] = new Bacteria((int)(Math.random()*500)+50,(int)(Math.random()*500)+50);
 	}
 	jango = new Predator(mouseX,mouseY);
 }   
 void draw()   
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
 	void show()
 	{
 		strokeWeight(5);
 		stroke(myColor);
 		noFill();
 		ellipse(myX,myY,20,20);
 	}
 	void move()
 	{
 		myX = myX + (int)(Math.random()*7)-3;
 		myY = myY + (int)(Math.random()*7)-3;
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