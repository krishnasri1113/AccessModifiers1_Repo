package package2;

import package1.vehicle;

public class bike  extends vehicle{
	public static void main(String[] args) {
		bike b=new bike();
	     b.protectedvehiclename="honda"	;
	     System.out.println(b.protectedvehiclename);
	     b.run();
		
	}
      
}
