import processing.core.*;
import java.util.Random;

public class Sketch extends PApplet {

  static PApplet pa = Sketch.pa;

Images[] sportsImages = new Images[16];
  int[] x = new int[16];
  int[] y = new int[16];
  int[] initial = new int[16];
  // int[] checkInitial = new int[2];
  int[] cardUp = new int[2];//There can only be 2 cards up at once
  boolean[] clicked = new boolean[16];

  int flipped = 0;



    public void settings() {
    pa = this;
        size(500, 600);
    }

  public void setup() {

  background(0);
   int image_x = 15;
  int image_y = 15;
  // int count = 1;  
  // size(500,600);

 for(int i = 0; i<16; i++){
   clicked[i] = false;
    y[i] = image_y;
    x[i] = image_x;
    initial[i] = i+1;//Checks every card after the question mark
  // if(count == 5){
  // count = 1;
  // }
      if(image_x<345){
    image_x += 115;
  } else if(image_x>345){
    image_x = 15;
    image_y += 150;
  }
}
    shuffle();
 for(int i = 0; i<16; i++){
  sportsImages[i] = new Images(x[i], y[i], initial[i]);
    }

for(int i = 0; i<16; i++){
      sportsImages[i].displayImages();
    }
  }




public void draw() {

  background(255);

  for(int i = 0; i<16; i++){
   sportsImages[i].displayImages();
 }

 if(mousePressed){
  flip();
 }
}

public void flip(){
for(int i = 0; i<16; i++){

  if (mouseX > x[i] && mouseX < (x[i]+105) && mouseY > y[i] && mouseY < (y[i]+140) && clicked[i] == false){
    sportsImages[i].showFront();
//  clicked[i] = true;//To tell wether that card is currently clicked or not
//    cardUp[flipped] = i;

//    flipped++;

//    if(flipped == 2){
//    flipped = 0;
//    delay(1000);


//    sportsImages[cardUp[0]].showBack();
//    sportsImages[cardUp[1]].showBack();
// 	clicked[i] = false;


//    }

//    if(initial[cardUp[0]] == initial[cardUp[1]]){
//    sportsImages[cardUp[0]].matched();
//     sportsImages[cardUp[1]].matched();
//      }

//   }
}

}

}

 public void shuffle(){
 int temp = 0;
 int random1 = 0;

Random random = new Random();

  for(int i = 0; i<16; i++){
    random1 = random.nextInt(8)+1;
  temp = initial[i];
  initial[i] = initial[random1];
  initial[random1] = temp;

  }
 }

}