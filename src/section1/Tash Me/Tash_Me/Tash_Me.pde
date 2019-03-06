PImage mustache;
  PImage Mickey;
  
void setup() {
  Mickey = loadImage("Mickey.jpg");
  size(1000, 1000);
  Mickey.resize(width,height);
  mustache = loadImage("mustache.png");
  mustache.resize(800,200);
}
void draw() {
background(Mickey);
image(mustache,385,690);
}