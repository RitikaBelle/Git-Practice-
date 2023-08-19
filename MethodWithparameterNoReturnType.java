class MethodWithparameterNoReturnType
{
	public static void main (String []args)
	{
		System.out.println("*****Before*****");
 		findSum(10,20);
		System.out.println("=====>Ended<=====");
		System.out.println("*****After*****");
	}
	static void findSum(int a , int b)
	{
		System.out.println("=====>Started<=====");
		int sum = 0;
 		sum = a+b;
		System.out.println(sum);
	}
}