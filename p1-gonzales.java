float horizon;
float sunX=0, sunY=50;
float goldX, goldY;


void setup()
{
  size(500, 400);
  horizon= height/2;
}



void draw()
{
 scene();
 tree();
 house();
 sun();
 creature();
 clouds();
 name();
 gold();

}

void scene() {
  noStroke();
  background (#06bbdb);   //background
  fill (#009900);
  rect( 0, horizon+100, width, height/2);    //grass
  }
  
void house() { 
  fill (#db0606);
  rect (200, 225, 75, 75);   //house
  fill (#86592d);
  triangle(180, 245, 240, 185, 295, 245);   //roof
  fill(#7b6d56);
  rect(240,265, 20,35);  //door
  fill(#f2fa00);
  ellipse(240, 225, 25, 25); //top window
  rect( 210, 265, 20,20); //bottom window
   fill(#000000);
  stroke(1);  //stroke for lines
  line(240,212.5, 240,237.5); //top window lines
  line(227.5, 225, 252.5, 225);  //top window lines
  line(220, 265, 220, 285);  //bottom window lines
  line(210, 275, 230, 275);  //bottom window lines
}

void tree() {
  fill(#50431F);
  triangle( 142, horizon+100, 128, horizon+100, 135, horizon+50 );  //trunk
  fill( 100, 200, 100 );
  ellipse( 135, 255, 40, 40); //leaves
}
 
 
void clouds() {
  noStroke(); // white
  fill(#FFFFFF);
  ellipse(100,100,40,40);  //left cloud
  ellipse(115,120,40,40);
  ellipse(90,115,40,40);
  ellipse(135,100,40,40);
  ellipse(145,115,40,40);


  ellipse(390,80,40,40);   //right cloud
  ellipse(370,100,40,40);
  ellipse(360,90,40,40);
  ellipse(400,100,40,40);
  ellipse(420,85,40,40);

}

void sun() {  
  noStroke();
  fill( 255, 255, 0 );   
  ellipse( sunX, sunY, 40, 40 );   //sun 
 
 if (sunX >width) {
   sunX= 0;
 }  
  sunX = sunX+1;
  
}
void creature() {
  
  noStroke();
  fill(#e6ccb3);  
  rect(mouseX+5, mouseY-10, 10, 10); //head
  fill(#420300);
  rect(mouseX, mouseY, 20, 20); //torso
   stroke(1);  //stroke for lines
  
  fill(#000000);
  line(mouseX+3, mouseY+19, mouseX+3, mouseY+30);  //left leg
  line(mouseX+17, mouseY+19, mouseX+17, mouseY+30);  //right leg
  line(mouseX, mouseY, mouseX-10, mouseY+5);  //left arm
  line(mouseX+20, mouseY, mouseX+30, mouseY+5);   //right arm
}

void name() {
  fill(#999999);   
  text( "AL", mouseX+5, mouseY+10 );
  noStroke();
}

void gold() {
 
  fill(#FCBD35);
  ellipse(goldX,goldY, 30,30);
 goldX= random(0,500);
 goldY= random(0,400);

 
 if (goldX,goldY,mouseX,mouseY) < 50;
 
  
}
