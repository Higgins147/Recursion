
public class Recursion {

	public static void main(String[] args) {
		
	int b = 3;
	int n = 5;
		
	System.out.println(b + " to the power of " + n + " done simply is " + simple(b, n));
	System.out.println(b + " to the power of " + n + " done smartly is " + smart(b, n));
	
	}
	
	static int simple(int b, int n){
		
		if(n == 0){
			return 1;
		}
		return b * simple(b, n-1);
	}
	
	static int smart(int b, int n){
		
		if(n == 0){
			return 1;
		}
		if(n % 2 == 0){
			return smart(b, n/2) * smart(b, n/2);
		}
		else{
			return b * smart(b, n/2) * smart(b, n/2);
		}
	}
}
