///this is a new file

float sunX, sunY;
float horizon;
float x, y;
float xAL, yAL;     //position of AL
float xGold, yGold;  // position of the gold nugget


void setup()
{
   size(500, 600);
   horizon= height/2;
  
}

void reset()
{
  sunX= 1;
  sunY=75;
}


void draw()
{
  background (#06bbdb);   //background
  fill( 255,255,0 );   
  ellipse( 50, 50, 40,40 );   //sun
  fill (#009900);
  rect( 0,horizon, width, height/2);    //grass
  fill (#db0606);
  rect (200,225,75,75);   //house
  fill (#86592d);
  triangle(180,245, 240,185, 295, 245);   //roof
        fill(#50431F);
  triangle( 142,horizon, 128,horizon, 135,horizon-50 );  //trunk
 fill( 100,200,100 );
   ellipse( 135, 255, 40, 40); //leaves
  
  fill(#e6ccb3);  
  rect(355,260,10,25); //head
  fill(#420300);
  rect(350,270,20,20); //torso
  fill(#000000);
  line(355,290,355,300);  //left leg
  fill(#000000);
  line(365,290,365,300);  //right leg
  line(350,270,340,275);  //left arm
  line(370,270,380,275);   //right arm
  
    fill(#999999);   
  text( "AL", 352,280 );
}
