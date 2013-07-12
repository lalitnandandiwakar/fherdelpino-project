public class SystemArguments extends Object/*implements MiInterface*/{
	
	static public void main(String... args) {
		
		int array[] = new int[10];
		for (int i=0; i<10;i++) {
			array[i]=i;
			
		}
		imprime(array);
		String s;
	}
	
	static public void imprime(int... is) {
		System.out.println(is);
	}
}