public class LP81
{
public static void main (String args[])
{
Circle circle = new Circle("red","large",new int[]{0,0},5);
circle draw();
System.out.println("Area:"+circle.calculateArea());
System.out.println("perimeter:"+circle.calculatorPerimeter());
Square square = new square("blue","medium",new int[]{5,5},4};
square.draw();
System.out.println("Area:"+square.calculatorArea());
System.out.println("Perimeter:"+square.calculatorPerimeter());
 

Triangle triangle = new Triangle("green",small",new int[]{-3,-3},6,4, new double[]{5,5,6});
triangle.draw();
System.out.println("Area:"+triangle.calculatorArea());
System.out.println("Perimeter:"+triangle.calculatorPerimeter());
}
}