abstract class Movies
    {
      abstract void StartMovie();
      abstract void StopMovie();
    }
 class DearZindagi extends Movies
    {
      public void StartMovie()
      {
      System.out.println("Starts DearZindagi...");
      }
      public void StopMovie()
      {
      System.out.println("Stop DearZindagi...");
      }
    } 
 class Dangal extends Movies
    {
      public void StartMovie()
      {
       System.out.println("Starts Dangal...");
      }
      public void StopMovie()
      {
      System.out.println("Stop Dangal...");
      }
    }
 class MovieStatus 
 {
  public static void main(String arg[])
  {
    DearZindagi m = new DearZindagi();
    m.StartMovie();
    m.StopMovie();
    Dangal n = new Dangal();
    n.StartMovie();
    n.StopMovie();
  }
 }  