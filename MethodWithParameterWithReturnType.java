class MethodWithParameterWithReturnType
{
	public static void main (String []args)
	{
		System.out.println("*****Before*****");
		int result = findSum(10,20);
		System.out.println(result);
		System.out.println("=====>Ended<=====");
		System.out.println("*****After*****");
	}
	static int findSum(int a , int b)
	{
		System.out.println("=====>Started<=====");
		int sum=0;
		sum = a+b;
		return (sum);
	}
}