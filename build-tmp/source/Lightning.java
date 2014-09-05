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

public class Lightning extends PApplet {

int startX= 0;
int endX=50;
int startY=150;
int endY=40; 
public void setup()
{
	frameRate(700);
	size(300,300);
	background(0);
}
public void draw()
{
	strokeWeight(1);
	stroke(random(0, 255),random(0, 255),random(0, 255));
	endX= startX + (int)(Math.random()*10-10);
	endY= startY + (int)(Math.random()*10);
	line(startX, startY, endX,endY); 
	startX=endX;
	startY=endY;

}
public void keyPressed(){
	if (keyPressed && key=='c')
		background(0);
}

public void mousePressed(){
	startX= (int)(Math.random()*300);
	startY=0;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
