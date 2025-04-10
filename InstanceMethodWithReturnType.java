public class InstanceMethodWithReturnType{
    public static void main(String[] args) {
		InstanceMethodWithReturnType imwrt = new InstanceMethodWithReturnType();
		int result = imwrt.addition();
		System.out.printf("The sum is %d%n",result);
	}
      // instance method int shows it will return an integer 
	public int addition(){  
	    int num1 = 50;
		int num2 = 17;
		
		int sum = num1 + num2;
		
		return sum;
		
	}
}	

// Static method  are methods that belong to the class rather than instances of the class