package cal;

import java.util.Scanner;
public class calc {
public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);
	        double a, b, c = 0.0;

	        System.out.print("Enter the first number \n");
	        a = in.nextDouble();
	        System.out.print("And enter second  \n");
	        b = in.nextDouble();
	        System.out.print("Choose the operation  " +
	              "\n1.Addition" +
	        		"\n2.Subtraction" +
	        		"\n3.Multiplication" +
	        		"\n4.Division" +
	        		
	        		"\n#Please enter the number of operation \n");
	        double somethin = in.nextDouble();
	        double addition = 1;
	        double subtraction = 2;
	        double multiplication = 3;
	        double division = 4 ;
	      
	        if (somethin == addition) {
	        	c = a + b;  
	        	System.out.println(a + " + " + b + " = " + c);  }
	        else if (somethin == subtraction)  {
	        	c = a - b;  
	        	System.out.println(a + " - " + b + " = " + c);	}
	        else if (somethin == multiplication)	{
	        	c = a * b;   
	        	System.out.println(a + " * " + b + " = " + c);	}
	        else if (somethin == division)   {
	        	c = a / b;  
	        	System.out.println(a + " / " + b + " = " + c);	}
	       
	        	
	        
	        }
	    }
	




