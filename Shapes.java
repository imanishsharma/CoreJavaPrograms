
public abstract class Shapes 
{   double a;
    abstract void area();
	abstract void displayArea();
}
class Triangle extends Shapes
{
  double b=100.0;
  double h=50.0;
   public void area()
  {
	 a = (b*h)/2; 
  }
   public void displayArea()
   {
	   System.out.println("Area of triangle is : "+a);
   }
   
}
class Rectangle extends Shapes
{
	double w= 100.0;
	double l=200;
	public void area()
	{
		a = w*l;
	}
	public void displayArea()
	{
    System.out.println("Area of rectangle is : "+a);
	}
}
class Circle extends Shapes
{
	double pi= 3.14;
	double r=20.0;
	public void area()
	{
		a = pi*r*r;
	}
	public void displayArea()
	{
    System.out.println("Area of circle is : "+a);
	}
}
class Square extends Shapes
{
	double s= 100.0;
	public void area()
	{
		a = s*s;
	}
	public void displayArea()
	{
    System.out.println("Area of Square is : "+a);
	}
}
class AreaofShapes
{
	public static void main(String args[])
	{
		Triangle t = new Triangle();
		t.area();
		t.displayArea();
		Rectangle r = new Rectangle();
		r.area();
		r.displayArea();
		Circle c = new Circle();
		c.area();
		c.displayArea();
		Square s = new Square();
		s.area();
		s.displayArea();
	}
}
