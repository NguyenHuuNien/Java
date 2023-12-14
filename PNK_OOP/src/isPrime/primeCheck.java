package isPrime;

public class primeCheck {
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		else if(n<4) return true;
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 25;
		System.out.print(isPrime(n));
	}

}
