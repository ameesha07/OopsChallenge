public class Ball {
    private int diameter;
    private int xposition;
    private int speed;

   Ball(int diameter,int speed,int xposition)
   {
       this.diameter=diameter;
       this.speed=speed;
       this.xposition=xposition;
   }

   public int getSpeed()
   {
       return  this.speed;
   }

   public void setSpeed(int speed)
   {
       this.speed=speed;
   }

   public int getDiameter()
   {
       return this.diameter;
   }

   public void setDiameter(int diameter)
   {
       this.diameter = diameter;
   }

   public int getXposition()
   {
       return this.xposition;
   }

   public void setXposition(int xposition)
   {
       this.xposition = xposition;
   }
}
