package io.github.tingreavinash.java_concepts.Collection;

public class ArrayOperation {

	public static void main(String[] args) {

		int[] a = new int[50];
		int size;
		
		a = new int[] {1,4,2,6,7};
		
		/*System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		
		size = sc.nextInt();
		
		System.out.println("Enter elements:");
		for (int i = 0; i<size ; i++) {
			a[i] = sc.nextInt();
		}*/
		
		System.out.println("Array elements are : ");

		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
