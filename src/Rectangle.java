
public class Rectangle {
	double length;
	double breadth;
	public Rectangle(double l,double b)
	{
		length = l;
		breadth = b;
	}
	public boolean equals(Object obj)
	{
		Rectangle rec = (Rectangle) obj;
		if(this.length == rec.length && this.breadth == rec.length)
		{
			return true;
		}else{
			return false;
		}
	}
	public static void main(String []arg)
	{
		Rectangle obj1 = new Rectangle(20.8,15.5);
		Rectangle obj2 = new Rectangle(20.8,15.5);
		if(obj1.equals(obj2))
		{
			System.out.println("obj1 and obj2 are equal");
		}
		else{
			System.out.println("Obj1 and obj2 are not equal");
		}
		
		}

}
