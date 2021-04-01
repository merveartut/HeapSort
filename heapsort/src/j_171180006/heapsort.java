package j_171180006;

public class heapsort {
	
	public  void minheap(int[]array,int length,int i) {
		
		int root = i; // k�k ayn� zamanda en k���k de�er
		int left = (i*2)+1; // left child indeksini hesaplar		 
		int right= (i*2)+2; // right child indeksini hesaplar
		
		if(left<length && array[left]<array[root]) {
				root = left;
		}
		
		 if (right<length && array[right]<array[root]) {
				root = right;
		}
		if (root != i) {		// en k���k de�erin indeksi i den farkl� ise 
			int temp = array[i];
			array[i]= array[root];  // daha k���k olan de�er ile k�k de�eri de�i�tirilir
			array[root]= temp;
		
			minheap (array,length,root); // yeni heap yap�s� i�in tekrar kontrol yap�l�r
		}
		
	}

	public void maxheap(int []array,int length,int i) {
		
		int root = i; // k�k ayn� zamanda en b�y�k de�er
		int left = (i*2)+1; // left child indeksini hesaplar		 
		int right= (i*2)+2; // right child indeksini hesaplar
		
		if(left<length && array[left]>array[i]) {
				root = left;
		}
		
		 if (right<length && array[right]>array[root]) {
				root = right;
		}
		if (root != i) {		// en b�y�k de�erin indeksi i den farkl� ise 
			int temp = array[i];
			array[i]= array[root];  // daha b�y�k olan de�er ile k�k de�eri de�i�tirilir
			array[root]= temp;
		
			maxheap (array,length,root); // yeni heap yap�s� i�in tekrar kontrol yap�l�r
		}
		
		
	}
	
	public void convertmax(int []array,int n) {
		
		for(int i=(n-2)/2;i>=0;i--) { // t�m subtreeler kontrol edilerek minheap ten maxheape donusturulur
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
			array[0]= array[j];     //en bastaki en kucuk eleman en sona gelir ve devre d��� kal�r kalan dizi tekrar kontrol edilir
			array[j]=x;
			
			minheap(array, j,0);
		}
		
		
		}
	
	public void  delete(int []array,int n) {
		
		
		int last = array[8];   
	
		array[7]= last;  // ��kar�lacak eleman sona at�l�r devre d�s� b�rak�l�r
		
		
		
	}

	public void print(int []array,int n) {
		System.out.println();
		for(int c=0;c<n;c++) {
			System.out.print(array[c]+" ");
		}
		}




}
