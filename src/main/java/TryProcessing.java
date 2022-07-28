import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH= 600;
    public static final int HEIGHT = 600;
    public static final int DIAMETER = 20;

    Ball ball1= new Ball(DIAMETER,1,0);
    Ball ball2= new Ball(DIAMETER,2,0);
    Ball ball3= new Ball(DIAMETER,3,0);
    Ball ball4= new Ball(DIAMETER,4,0);

    public static void main(String[] args)
    {
        PApplet.main("TryProcessing", args);
    }

    public void settings()
    {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    public void draw()
    {
        ellipse(ball1.getXposition(),HEIGHT/5, ball1.getDiameter(),ball1.getDiameter());
        ellipse(ball2.getXposition(),2*HEIGHT/5, ball2.getDiameter(),ball2.getDiameter());
        ellipse(ball3.getXposition(),3*HEIGHT/5, ball3.getDiameter(),ball3.getDiameter());
        ellipse(ball4.getXposition(),4*HEIGHT/5, ball4.getDiameter(),ball4.getDiameter());

        ball1.setXposition(ball1.getXposition()+ ball1.getSpeed());
        ball2.setXposition(ball2.getXposition()+ ball2.getSpeed());
        ball3.setXposition(ball3.getXposition()+ ball3.getSpeed());
        ball4.setXposition(ball4.getXposition()+ ball4.getSpeed());
    }

    public void setupWhiteBackground() {
        background(255);
    }
}
