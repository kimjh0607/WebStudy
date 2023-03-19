package weekend;

interface multi{
	int mul(int a, int b);
}

public class Kong {
	public static void main(String[] args) {
		
		multi result = (x,y)->(int)Math.pow(x,y);
		System.out.println(result.mul(2,3));
		
	}
}
