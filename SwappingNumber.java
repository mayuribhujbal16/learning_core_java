package loops;

public class SwappingNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("Using 3rd variable");
		System.out.println("After swapping value of a " +a);
		System.out.println("After swapping value of b " +b);
		
		System.out.println();
		System.out.println("Without using 3rd variable");
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping value of a " +a);
		System.out.println("After swapping value of b " +b);

	}

}
