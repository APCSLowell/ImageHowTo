PImage b;
void setup()
{
	size(450,310);
	b = loadImage("http://i.imgur.com/oiDCBHq.png");
	frameRate(1);
	background(100);
	fill(255);
}
void draw()
{
	image(b, random(width-284), random(height-169),284,169);
}
