
public class QuickSort {

	public static void main(String[] args) {
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		int[] finalarray = sort(array,0,array.length-1);
		for(int i=0;i<finalarray.length;i++) {
			System.out.println(finalarray[i]);
		
		}
	}
	public static int partition(int [] a,int low, int high) {
		        int pivot = a[high]; 
		        int i = (low-1);
		        for (int j=low; j<high; j++)
		        {
		            if (a[j] <= pivot)
		            {
		                i++;

		                int temp = a[i];
		                a[i] = a[j];
		                a[j] = temp;
		            }
		        }

		        int temp = a[i+1];
		        a[i+1] = a[high];
		        a[high] = temp;

		        return i+1;
	}
	public static int[ ]sort(int [] array, int l, int h){
		 if (l < h)
	        {
	            int p = partition(array, l, h);
	            sort(array, l, p-1);
	            sort(array, p+1, h);
	        }
		 return array;
	}

}
