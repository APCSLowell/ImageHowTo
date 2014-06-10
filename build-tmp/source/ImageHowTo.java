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

public class ImageHowTo extends PApplet {

PImage b;
public void setup()
{
	size(450,350);
	b = loadImage("http://i.imgur.com/l2TxLo8.png");
	frameRate(1);
	background(0);
	fill(255);
	textAlign(CENTER);
	textSize(24);
	text("This picture is in the program",225,320);
}
public void draw()
{
	tint(255,255,255,200);
	image(b, random(width-284), random(height-219),284,169);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "ImageHowTo" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
