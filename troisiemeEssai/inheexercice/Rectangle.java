
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public  class Rectangle
{
   double width ;
   double height;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {this.width=1.0;
        this.height=1.0;
           }
    public Rectangle(double w , double h){
    this.width=w;
    this.height=h;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getArea()
    {
        return width*height;
    }
    public double getPerimetre()
    {return 2 * (width+height);
    }
    
    public String toString(){
       return "width : " + width +"  "+ "height :" + height +"  "+ "Area :" + getArea() +"  "+ "perimetre :" +getPerimetre();
    }

}
