public class Fatorial {	
	public static long fatorial(long n) {
		if(n==0)return 1;
		else return n*fatorial(n-1);				
	}
	
	public static void main(String[] args) {
		long n = Integer.parseInt(args[0]);
		System.out.println(fatorial(n));		
	}
}
