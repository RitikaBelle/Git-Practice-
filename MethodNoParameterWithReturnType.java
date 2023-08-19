class MethodNoParameterWithReturnType
{
	public static void main (String []args)
	{
		System.out.println("*****Before*****");
		int result = findSum();
		System.out.println(result);
		System.out.println("=====>Ended<=====");
		System.out.println("*****After*****");
	}
	static int findSum()
	{
		System.out.println("=====>Started<=====");
		int a=10 , b=20 , sum=0;
		sum = a+b;
		return (sum);
	}
}