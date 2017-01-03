
public abstract class Furniture
{
	String color;
	int width;
	int height;
	int price;
	public abstract void acceptDetails();
	public abstract void displayDetails();
}
 class Chair extends Furniture
 {
	 int legs;
	 public void acceptDetails()
	 {
		 color="Blue";
		 width = 25;
		 height = 30;
		 price = 500;
		 legs=4;
	 }
	 public void displayDetails()
	 {
		 System.out.println("Details of Chair");
		 System.out.println("Color: " + color);
		 System.out.println("Width: " + width);
		 System.out.println("Height: " + height );
		 System.out.println("Price of Chair: " + price);
		 System.out.println("Legs of chair :" +legs);
     }
 }
  class Bookshelves extends Furniture
 {
	 int shelvesNo;
	 public void acceptDetails()
	 {
		 color="Brown";
		 width =500;
		 height = 1000;
		 price = 12000;
		 shelvesNo = 5;
	 }
	 public void displayDetails()
	 {
		 System.out.println("Details of Bookshelve");
		 System.out.println("Color: "+color);
		 System.out.println("Width: "+width);
		 System.out.println("Height" +height);
		 System.out.println("Price of Bookshelve: "+price);
		 System.out.println("Shelves number: "+shelvesNo);
		 
	 }
}
    class FFC
   {
	   public static void main(String args[])
	   {
        Chair obj = new Chair();
        obj.acceptDetails();
        obj.displayDetails();
        Bookshelves obj1 = new Bookshelves();
        obj1.acceptDetails();
        obj1.displayDetails();
	   }
   }
   
	
   
