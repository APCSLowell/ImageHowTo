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
	size(450,310);
	b = loadImage("http://i.imgur.com/l2TxLo8.png");
	frameRate(1);
	background(0);

}
public void draw()
{
	stroke(0,0,0,80);
	fill(0,0,0,80);
	rect(0,0,width,height);
	image(b, random(width-284), random(height-169),284,169);
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
