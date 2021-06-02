

package circle;

/**
 *This class +++Insert Description Here+++
 * @author Simple Patel
 */
public class Circle {
    private  double radius;
    
    Circle(){
        radius = 0.0;
    }
    public Circle(double Radius){
        this.radius = radius;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius) throws IllegalArgumentException{
        if(radius <= 0){
            throw new IllegalArgumentException("Radius can not be negative or zero");
        }
        else{            
        this.radius = radius;
        }
    }   
    public double getCircleArea(double radius){
        return 3.14 * radius * radius;
    }
    public double getCircumference(double radius){
        return 2 * 3.14 * radius;
    }
    @Override
    public String toString(){
        return "Circle Radius is:" + this.getRadius() + "\nCircle Area is: " 
                + this.getCircleArea(radius)+ "\n Circle Circumference is: "+ this.getCircumference(radius);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3= new Circle();
        c1.setRadius(4.0);
        c2.setRadius(6.0);
//        c3.setRadius(0);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
                
        
    }

}
