
public class MergeSort {

	public static void main(String[] args) {
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		int[] finalarray = sort(array,0,array.length-1);
		for(int i=0;i<finalarray.length;i++) {
			System.out.println(finalarray[i]);
		
		}
	}
	 static void merge(int arr[], int l, int m, int r){
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    
	    static int [] sort(int array[], int l, int r){
	        
	        if (l < r) {
	            int m = l + (r - l) / 2;
	            sort(array, l, m);
	            sort(array, m + 1, r);
	            merge(array, l, m, r);
	        }
	        return array;
	    }


}
