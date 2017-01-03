
public class Directions 
{
	public enum CompassDirections{NORTH,SOUTH,EAST,WEST,NORTHEAST,SOUTHEAST,SOUTHWEST,NORTHWEST}
	public static void main(String args[])
	{
		CompassDirections obj =  CompassDirections.NORTHEAST;
		System.out.println(CompassDirections.NORTHEAST);
		System.out.println(obj.ordinal());
		CompassDirections obj1 = CompassDirections.WEST;
		System.out.println(CompassDirections.WEST);
		System.out.println(obj1.ordinal());
		
	}
  
}
