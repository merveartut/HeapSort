package j_171180006;

public class Test {

	public static void main(String []args) {
		
		int []array= {3,7,8,11,13,10,17,19,23};
		int n = array.length; 
		  
       
		heapsort h = new heapsort();
		h.Sort(array);
		System.out.println("ilk sıralanmış hali:");
		h.print(array, n);
		h.delete(array, n);
		  
		System.out.println();
		h.Sort(array);
		System.out.println("silindikten sonraki hali:");
		h.print(array, n-1);
		int []minheap= {5, 7, 11, 8, 10, 22, 12, 14, 20, 11};
		int l= minheap.length;
	  System.out.println();
		System.out.println("2.soru ");
		System.out.println("minheap hali:");
		h.print(minheap, l);
		h.convertmax(minheap,l);
	System.out.println();
		System.out.println("maxheap hali:");
		h.print(minheap, l);
	
	}
}
