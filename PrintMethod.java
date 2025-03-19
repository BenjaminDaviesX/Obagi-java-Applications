public class PrintMethod{
	public static void main (String[] args){
		// using the print method in java
		System.out.print("\"Learning Java is Fun\"\n"); 
		System.out.print(" Hey, come and learn Java with me");
		
		//using the println method()
		System.out.println();		
		System.out.println("I want to tell you that Java is different from javascript");
		System.out.println("\t this is the indented text");
		
		//using the printf
		System.out.printf("My name is %s and I love %s. Good day everyone%n","Benjamin","Java");
		System.out.printf("I am %d years old%n",25);
		System.out.printf("I bought Java JDK with %f naira%n",159.345);
		System.out.printf("I bought Java JDK with %c%.2f %n",'$',159.345);
		
		boolean isJavaFun = true;
		System.out.printf("is Java fun? %b",isJavaFun);
	}
	
} 