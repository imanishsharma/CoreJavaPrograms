class GroceryDetails
{
 
  int weight;
  GroceryDetails()
  {
  
    weight = 5;
 
  }
    void addWeight()
  {
    weight+=6;
  System.out.println(weight);
}
   void weightRemove()
  {
   weight-=4;
   System.out.println(weight);
  }
  void checkWeight()
  {
   System.out.println(weight);
  }
  public static void main(String arg[])
  {
    GroceryDetails g = new GroceryDetails();
    System.out.println("The current weight is");
    g.checkWeight();
    System.out.println("The weight after add is:");
    g.addWeight();
    System.out.println("The weight  after remove is:");
    g.weightRemove();
  }
}
  
 