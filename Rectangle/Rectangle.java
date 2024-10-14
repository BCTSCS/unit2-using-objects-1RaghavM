import greenfoot.*;

public class Rectangle extends Actor {
      private int width;
      private int height;
      private Rectangle partner;
      
      public Rectangle(int w, int h){
        setWidth(w,h);
        getImage().scale(width*10, height*10);
    }
    
     public Rectangle(int s){
        setWidth(s);
        getImage().scale(width*10, height*10);
    }
    
     public Rectangle(){
        partner = new Rectangle(10,5);
        System.out.println("Width: "+width+" Height: "+height+" Partner: "+partner);
        getImage().scale(width*10, height*10);
    }
    
    public void setWidth(){
        width = 10;
        height = 10;
    }
    
    public void setWidth(int size){
        width = size;
        height = size;
    }
    
    public void setWidth(int w, int h){
        width = w;
        height = h;
    }
    
    public static void main(String[] args){
      
    
      
  }
  public String toString(){
    return "Rectangle width: "+width+ " Height: "+height;
    }
}