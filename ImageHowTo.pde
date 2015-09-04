PImage b;
void setup()
{
	size(450,310);
	b = loadImage("images/aAHK0LA.png");
	frameRate(1);
	background(0);

}
void draw()
{
	stroke(0,0,0,80);
	fill(0,0,0,80);
	rect(0,0,width,height);
	image(b, random(width-189), random(height-186),189,186);
}
