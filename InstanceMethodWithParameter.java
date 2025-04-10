public class InstanceMethodWithParameter {
    public static void main(String[] args){
		InstanceMethodWithParameter imwp = new InstanceMethodWithParameter();
		int result = imwp.addition(50,17);
		
		System.out.printf("The sum is %d%n", result);
	}
	//instance method with a return type and two parameters.
	public int addition(int num1 ,int num2){ 
	    int sum = num1 + num2;
		
		return sum; 
	} 
}