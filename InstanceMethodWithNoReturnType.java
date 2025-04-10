public class InstanceMethodWithNoReturnType{
    public static void main(String[] args) {
		InstanceMethodWithNoReturnType imnwrt = new InstanceMethodWithNoReturnType();
		imnwrt.addition();// using the class instance name 
	}
	
	public void addition(){ //after acess modifier you dont see static means its an instance method without a return type
		int num1 = 50; 
		int num2 = 17;
		
		
		int sum = num1 + num2;
		System.out.printf("The sum is %d%n",sum);
	}
		
}