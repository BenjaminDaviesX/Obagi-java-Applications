public  class StaticMethodWithReturnType{
	public static void main(String[] args){
        int result = addition();

		System.out.printf("The sum is %d%n",result);
	}
	public static int addition(){
		int num1 = 50;
		int num2 = 17;
		
		
		int sum = num1 + num2;
		
		return sum;
	}
}