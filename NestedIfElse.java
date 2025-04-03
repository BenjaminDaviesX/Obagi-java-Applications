import java.util.Scanner;

public class NestedIfElse{
    public static void main(String[] args){  
	    Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine(); 
		
		System.out.print("Enter Mark: ");
		int mark = input.nextInt();
		
		if (mark > 100){
			System.out.println("Mark can not be greater than 100");
		}
        else{		cd documents
		
		if (mark >= 80){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
	        System.out.printf("Your grade is %c%n",'A'); 
		
		}
		else if (mark >= 70){	
            System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
	        System.out.printf("Your grade is %c%n",'B');
		}
		else if (mark >= 60){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
	        System.out.printf("Your grade is %c%n",'C');
			
		}
		else if (mark >= 50){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
	        System.out.printf("Your grade is %c%n",'D');
			
		}
		else if (mark >= 40){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
	        System.out.printf("Your grade is %c%n",'E');
			
		}
		else if (mark >= 40){
			System.out.printf("Your name is %s%n",name);
			System.out.printf("Your mark is %d%n",mark);
	        System.out.printf("Your grade is %c%n",'F');
		}
	  }	
	}
}