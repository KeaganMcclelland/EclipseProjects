import java.util.Scanner;

public class tut {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Choose Calculator: (Gravity, Science) ");
        String choice = sc.nextLine();
        
        
        switch(choice) {
            case "Gravity":
            case "gravity":	
            		System.out.print("Enter Acceleration:  ");
                		double a = sc.nextDouble(); // acceleration
                
                System.out.print("Enter Time:  ");
                	double t = sc.nextDouble(); // time
                
                System.out.print("Enter Initial Velocity:  ");
                	double vi = sc.nextDouble(); // Initial Velocity
                
                System.out.print("Enter Initial Position:  ");
                	double xi = sc.nextDouble();  // Initial Position
                
                double result = (vi * t + xi) + (0.5*a*t*t);
                
                
                System.out.println("Gravity Result: " + result + "m"); 
                	break;
                
            case "Science":
            case "science":
            		System.out.print("Enter a Number: ");
                		double N = sc.nextDouble();
                
                int exponent = 0;
                	double mantissa = N;
                
                if (N == 0) {
                    mantissa = 0;
                    	exponent = 0;
                } else {
                      while (Math.abs(mantissa) >= 10) {
                        mantissa /= 10;
                        	exponent++;
                    }
                    while (Math.abs(mantissa) < 1) {
                        mantissa *= 10;
                        	exponent--;
                    }
                }
                
                System.out.println("Scientific Notation: " + mantissa + " × 10^" + exponent);
                	break;                                                    
                
            	default:            	
            		System.out.println("Invalid choice. Please enter Gravity or Science.");
            			break;
        }
        
        
        sc.close();
    }   
}
