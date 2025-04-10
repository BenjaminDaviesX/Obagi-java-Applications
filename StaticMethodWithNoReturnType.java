public  class StaticMethodWithNoReturnType{
	public static void main(String[] args){
		StaticMethodWithNoReturnType.addition();
		
	}
	
	public static void addition(){
		int num1 =50;
		int num2 = 17;
		
		int sum = num1 + num2;
		
		System.out.printf("The sum is %d%n",sum);
	}	
}	