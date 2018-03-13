PImage mustache;
  PImage friend;
void setup() {
friend = loadImage("doggo.jpeg");
 size(800,600);
 friend.resize(800,600);
 mustache = loadImage("mustache.png");
 mustache.resize(400, 300);
}
void draw() {
  background(friend);
  image(mustache, 200, 150);
  
}