public class CoolProject extends World{
    public int red;
    public int blue;
    public int green;

    public void go() {

        plane.isTrail = true;
        plane.pausetime = 0;
        plane.trailWidth = 10;
        red   = plane.howMuchRed();
        green = plane.howMuchGreen();
        blue  = plane.howMuchBlue();


        plane.loadBackGround("45798.png");
        plane.showBackGround();
        plane.setColor(red,green,blue);
        for(int y=1; y<800; y=y+1){
            for(int x=1; x<1000; x=x+1){
                plane.teleport(x,y);

                red   = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue  = plane.howMuchBlue();

                plane.setPixelColor(red, green, blue);
                if(red ==224&&green==212&&blue==124){
                    plane.setPixelColor(x/4,x/7,y/4);
                }
            }
        }

        plane.setColor(200,200,0);
        plane.teleport(200,250);
        circle(4,4,100,170);
        plane.turn(270);
        plane.move(75);
        circle(10,1,100,0);
        plane.turn(45);
        plane.isTrail = false;
        plane.move(75);
        circle(4,4,70,134);
        plane.turn(270);
        plane.isTrail = true;
        plane.move(75);
        circle(10,1,100,0);
        plane.teleport(210,390);
        circle(3,3,92,90);
        plane.isTrail = false;
        circle(3,3,72,180);
        plane.isTrail = true;
        circle(5,5,50,45);
        plane.isTrail = false;
        circle(5,5,40,161);
        plane.isTrail = true;
        circle(6,6,43,45);
        plane.teleport(185,310);
        circle(10,1,80,0);
        plane.startingAngle(10);
        plane.isTrail = false;
        plane.move(40);
        plane.isTrail = true;
        circle(10,1,80,0);
        plane.teleport(168,350);
        circle(3,2,40,45);
        plane.teleport(900,900);
        for(int z=1;z<20;z=z+1){
            apple();
            plane.teleport(z*43,(int)(Math.random()*150));
        }


    }

public void apple(){
        plane.setColor(250,0,0);
        plane.trailWidth = 15;
        circle(15,1,80,0);
        plane.setColor(0,250,0);
        plane.trailWidth = 5;
        circle(1,1,10,270);

}
public void circle(int turn,int move,int per,int start){
        plane.startingAngle(start);
        for (int x = 1;x<per;x=x+1){
            plane.move(move);
            plane.turn(turn);

        }
}
}
