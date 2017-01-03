class ReservationDetails
{
   String trainName = "North East Express";
   int trainNo = 12457;
   String passengerName = "Diljeet Singh";
   String coachNo = "S1";
   int seatNo = 23;
   String from = "NDLS";
   String to = "Siliguri";
   void displayDetails()
   {
      System.out.println("TRAIN DETAILS");
      System.out.println("TRAIN NAME: "+ trainName);
      System.out.println("TRAIN NUMBER: "+ trainNo);
      System.out.println("PASSENGER NAME: "+ passengerName);
      System.out.println("COACH NUMBER: "+ coachNo);
      System.out.println("Seat Number: "+seatNo);
      System.out.println("Station from "+from+" to "+to);
   }
   public static void main(String arg[])
   {
     ReservationDetails obj = new ReservationDetails();
     obj.displayDetails();
   }
}   
   