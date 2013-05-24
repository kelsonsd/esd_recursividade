public class Fibonacci {
	public static int fibonacci(int n){
		if(n<2)return n;
		else return fibonacci(n-2)+fibonacci(n-1);
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(fibonacci(n));
	}
}
