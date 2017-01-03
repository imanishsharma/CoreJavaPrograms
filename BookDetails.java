class Books
{
   String authorName;
   String title;
   int price;
   int pages;
   public Books(String authorName, String title,int price,int pages)
  {
	this.authorName=authorName;
        this.title=title;  
        this.price =price;
        this.pages =pages;   

  }
}
   class SoftwareVersion extends Books
   {
     String version;
     String sftName;
     public SoftwareVersion(String authorName,String title,int price,int pages,String version,String sftName)
     {
      super(authorName,title,price,pages);
      this.version = version;
      this.sftName = sftName;
      
     }
      
     void softwareBook()
     {
     System.out.println("Author Name:"+ authorName);
     System.out.println("Title:" + title);
     System.out.println("Price:" + price);
     System.out.println("Version:" + version);
     System.out.println("Software name:"+ sftName);
     System.out.println("Pages:"+ pages);
     } 
  }
   class Hardware extends Books
   {
     String publisher;
     String category;
     public Hardware(String authorName, String title,int price,int pages,String publisher,String category )
     {
     super(authorName,title,price,pages);
     this.publisher = publisher;
     this.category = category;
     }     
     void hardwareBook()
     {
     System.out.println("Author Name:"+ authorName);
     System.out.println("Title:" + title);
     System.out.println("Price:" + price);
     
     System.out.println("Pages:" + pages);
     System.out.println("Category:" + category);
     System.out.println("Publisher:" + publisher);
     } 
   } 
 
   class BookDetails{
    public static void main(String arg[])
   {
     SoftwareVersion obj = new SoftwareVersion("petrick","Software Book",300,120,"2015","Ms Office");
     obj.softwareBook();
     Hardware obj1 = new Hardware("john","hardware",400,200,"wrox","Network");
     obj1.hardwareBook();
   }
}   