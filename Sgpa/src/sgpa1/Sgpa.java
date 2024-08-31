package sgpa1;

import java.util.Scanner;

public class Sgpa{
	 int Gcredit (String Grade)
	{
		switch(Grade)
		{
		case "O" :
			return 10;
		case "A+":
			return 9;
		case "A":
			return 8;
		case "B+":
			return 7;
		case "B":
			return 6;
		case "C":
			return 5;
		case "F":
			return 4;
		default:
			System.out.println("Enter the correct grade");
		}
		return 0;
	}
	 Double Credit(String sub) {
		 if(sub.equals("EP")) {
			 return 4.0;
		 }
		 else if(sub.equals("DPSD"))
		 {
			 return 4.0;
		 }
		 else if(sub.equals("PS"))
		 {
			 return 4.0;
		 }
		 else if(sub.equals("BEEE"))
		 {
			 return 3.0;
		 }
		 else if(sub.equals("PP"))
		 {
			 return 3.0;
		 }
		 else if(sub.equals("TT"))
		 {
			 return 1.0;
		 }
		 else if(sub.equals("EE LAB"))
		 {
			 return 1.5;
		 }
		 else if(sub.equals("COM LAB"))
		 {
			 return 1.5;
		 }
		 else if(sub.equals ("PP LAB"))
		 {
			 return 1.5;
		 }
		 else {
			 System.out.println("subject mismatch");
		 }
		 return 0.0;
	 }
	 public static void main(String[] args)
	 {
		 Sgpa ob1 = new Sgpa();
		 Scanner sc = new Scanner(System.in);
		
		  
		 System.out.print("Enter the subject name:");
		 String S = sc.nextLine();
		  
		 System.out.print("Enter the grade:");
		 String G = sc.nextLine();
		 
		double CP = ob1.Credit(S);
		 int GP = ob1.Gcredit(G);
		double total1=CP*GP;
		
		System.out.println(total1);
		 
				
         sc.close();
		 
		 
	 }
	 

}