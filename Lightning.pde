int startX= 0;
int endX=50;
int startY=150;
int endY=40; 
void setup()
{
	frameRate(700);
	size(300,300);
	background(0);
}
void draw()
{
	strokeWeight(1);
	stroke(random(0, 255),random(0, 255),random(0, 255));
	endX= startX + (int)(Math.random()*10-5);
	endY= startY + (int)(Math.random()*10);
	line(startX, startY, endX,endY); 
	startX=endX;
	startY=endY;

}
void keyPressed(){
	if (keyPressed && key=='c')
		background(0);
}

void mousePressed(){
	startX= (int)(Math.random()*300);
	startY=0;
}