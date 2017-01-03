import java.util.*;
public class Request 
{
ArrayDeque<String> pool;
public  Request()
{
	pool = new ArrayDeque<String>();
}
public void initRequest(String i, String p)
{
	String id =i;
	String prb =p;
	String rqt ="Employee ID:" + id +"\nProblem: " +prb;
	pool.add(rqt);
	
}
public void dispReqyest()
{
	System.out.println("Request pool");
	if (pool.isEmpty() == true)
	{
		System.out.println("Currently no request in the pool");
		
	}else {
		for(String s: pool)
		{
		 System.out.println(s);
		}
	}
}
public void attdRequest()
{
	String status;
	if(pool.isEmpty()==true)
	{
		System.out.println("Currently there is no request in the pool...");
	}else {
		System.out.println("You need to resolve the following problem...");
		System.out.println(pool.getFirst());
		status ="R";
		if(status.toUpperCase().equals("R"))
		{
			System.out.println("The following problem has been resolved...");
			System.out.println(pool.getFirst());
		pool.remove();
	} else if (status.toUpperCase().equals("p"))
		{
			System.out.println("Please resolve the problem ASAP");
		}else{
			status ="N";
		}
	}
}
public static void main(String[] args)
{
	Request rq = new Request();
	rq.initRequest("3243","System is not working...");
	rq.initRequest("3764","Internet is not working...");
	rq.dispReqyest();
	rq.attdRequest();
}
}