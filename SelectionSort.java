
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		int[] finalarray = Selection(array);
		for(int i=0;i<finalarray.length;i++) {
			System.out.println(finalarray[i]);
		}

	}
	public static int[] Selection(int[]array) {
		int n = array.length; 
		for(int i=0;i<n;i++){
		int min_index = i;
		for(int j=i+1;j<n;j++){
		if(array[j]<array[min_index]){
		min_index = j;
		}
		}
		int temp = array[min_index];
		array[min_index] = array[i];
		array[i] = temp;
		}
		return array;

	}
}
