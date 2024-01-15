import processing.core.*;

public class Images extends Sketch{

static PApplet pa = Sketch.pa;

PImage picture;
  int showing = 0;
  int picture_x = 0;
  int picture_y = 0;
  int initial = 0;

String[] imageNames = {"lib/question.png", "lib/2.png", "lib/3.png", "lib/4.png", "lib/5.png", "lib/6.png", "lib/7.png", "lib/8.png", "lib/9.png", "lib/2.png", "lib/3.png", "lib/4.png", "lib/5.png", "lib/6.png", "lib/7.png", "lib/8.png", "lib/9.png"};

 Images(int x, int y, int initial){
    picture_x = x;
    picture_y = y;
    this.initial = initial;
  }

   public void displayImages(){
    picture = pa.loadImage(imageNames[showing]);
    pa.image(picture, picture_x, picture_y);
  }

  public void showFront(){
   showing = initial;
 }

 public void matched(){
 picture_x = -200;
 }

 public void showBack(){
 showing = 0;//When showing is 0, that is when the picture of the card shows up. Unless the question mark picture is up
 }

}