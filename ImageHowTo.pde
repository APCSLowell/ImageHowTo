PImage b;
void setup()
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
void draw()
{
	tint(255,255,255,200);
	image(b, random(width-284), random(height-219),284,169);
}
