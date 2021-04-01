package j_171180006;

public class heapsort {
	
	public  void minheap(int[]array,int length,int i) {
		
		int root = i; // kök aynı zamanda en küçük değer
		int left = (i*2)+1; // left child indeksini hesaplar		 
		int right= (i*2)+2; // right child indeksini hesaplar
		
		if(left<length && array[left]<array[root]) {
				root = left;
		}
		
		 if (right<length && array[right]<array[root]) {
				root = right;
		}
		if (root != i) {		// en küçük değerin indeksi i den farklı ise 
			int temp = array[i];
			array[i]= array[root];  // daha küçük olan değer ile kök değeri değiştirilir
			array[root]= temp;
		
			minheap (array,length,root); // yeni heap yapısı için tekrar kontrol yapılır
		}
		
	}

	public void maxheap(int []array,int length,int i) {
		
		int root = i; // kök aynı zamanda en büyük değer
		int left = (i*2)+1; // left child indeksini hesaplar		 
		int right= (i*2)+2; // right child indeksini hesaplar
		
		if(left<length && array[left]>array[i]) {
				root = left;
		}
		
		 if (right<length && array[right]>array[root]) {
				root = right;
		}
		if (root != i) {		// en büyük değerin indeksi i den farklı ise 
			int temp = array[i];
			array[i]= array[root];  // daha büyük olan değer ile kök değeri değiştirilir
			array[root]= temp;
		
			maxheap (array,length,root); // yeni heap yapısı için tekrar kontrol yapılır
		}
		
		
	}
	
	public void convertmax(int []array,int n) {
		
		for(int i=(n-2)/2;i>=0;i--) { // tüm subtreeler kontrol edilerek minheap ten maxheape donusturulur
			maxheap(array,n,i);
		}
	}
	public  void Sort(int []array) {
		
		int n = array.length;
		
		for(int i= n/2-1; i>=0;i--) {  // subtree ler kontrol edilir
			minheap(array, n,i);
		}
		
		for (int j= n-1; j>=0;j--) {
			
			int x = array[0];
			array[0]= array[j];     //en bastaki en kucuk eleman en sona gelir ve devre dışı kalır kalan dizi tekrar kontrol edilir
			array[j]=x;
			
			minheap(array, j,0);
		}
		
		
		}
	
	public void  delete(int []array,int n) {
		
		
		int last = array[8];   
	
		array[7]= last;  // çıkarılacak eleman sona atılır devre dısı bırakılır
		
		
		
	}

	public void print(int []array,int n) {
		System.out.println();
		for(int c=0;c<n;c++) {
			System.out.print(array[c]+" ");
		}
		}




}
