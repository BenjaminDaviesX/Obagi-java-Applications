public class TypeCasting{
    public  static void main(String[] args){ 
	    //widening TypeCasting
	    double balance = 58585;
		System.out.printf("Your account balance is %c%f%n", '$',balance);
		
		//Narrowing TypeCasting(ASCII CODE ? = 63
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		System.out.printf("The ASCII code for ? is %d%n",asciiCode);
		
		
		
		double height = 5.8;
		int myHeight = (short)height;
		System.out.printf("My Facaulty's height is %d%n",myHeight); 
	
	}
}