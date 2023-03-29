package assignment;

public class driverLicense {
	int age;
	boolean G1;
	boolean G2;
	boolean G;
	void license() 
	{
		if(age>=16) 
		{
			if(age<17) 
			{
				if(G1==false)
				{
					System.out.println("You can get G1");
				}
				else
				{
					System.out.println("Wait till age 17 to get G2");
				}
		    }
			else if(age>=17) 
			{
				if(G1==false)
				{
		    	System.out.println("You can get G1");
		    	}
				else  
				{
					if(age<18) 
					{
		    	     System.out.println("you can get G2");
		    	    }
		    	    else 
				    {
						if(G2==false)
						{
							 System.out.println("you an get G2");
						}
						else 
						{
							System.out.println("You can get G");
						}
		            }
		    	}
		    	
		    }
		}
		else 
		{
    		System.out.println("You are not eligible for License");
    	}
	}
}
		






