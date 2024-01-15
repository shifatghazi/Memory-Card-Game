public class Images extends Sketch{


PImage picture;
  int showing = 0;
  int picture_x = 0;
  int picture_y = 0;
  int initial = 0;

String[] imageNames = {"question.png", "2.png", "3.png", "4.png", "5.png", "6.png", "7.png", "8.png", "9.png"};

 Images(int x, int y, int initial){
    picture_x = x;
    picture_y = y;
    this.initial = initial;
  }

   void displayImages(){
    picture = pa.loadImage(imageNames[showing]);
    pa.image(picture, picture_x, picture_y);
  }

  public void showFront(){
   showing = initial;
 }

}