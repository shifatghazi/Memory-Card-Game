public class Sketch extends PApplet {

Images[] sportsImages = new Images[16];
  int[] x = new int[16];
  int[] y = new int[16];
  int[] initial = new int[16];
  int[] checkInitial = new int[2];
  int[] cardUp = new int[2];
  boolean[] clicked = new boolean[8];
  PImage flip;
  int flipped = 0;
  int win = 0;


  void setup() {
background(0);
   int image_x = 15;
  int image_y = 15;
  int count = 1;  
  size(500,600);

 for(int i = 0; i<8; i++){
    clicked[i] = false;
    y[i] = image_y;
    x[i] = image_x;
    initial[i] = i+1;
  if(count == 5){
  count = 1;
  }
      if(image_x<345){
    image_x += 115;
  } else if(image_x>345){
    image_x = 15;
    image_y += 150;
  }
}
    shuffle();
 for(int i = 0; i<8; i++){
  sportsImages[i] = new Images(x[i], y[i], initial[i]);
    }

for(int i = 0; i<8; i++){
      sportsImages[i].displayImages();
    }


  }




void draw() {

  background(255);

  for(int i = 0; i<8; i++){
   sportsImages[i].displayImages();
 }
 if(mousePressed){
  flip();
 }
}

void flip(){
for(int i = 0; i<8; i++){

  if (mouseX > x[i] && mouseX < (x[i]+105) && mouseY > y[i] && mouseY < (y[i]+140)){
    sportsImages[i].showFront();
  }
}

}

 void shuffle(){
 int temp = 0;
 int random = 0;

  for(int i = 0; i<8; i++){
    random = int(random(0,8));
  temp = initial[i];
  initial[i] = initial[random];
  initial[random] = temp;

  }
 }