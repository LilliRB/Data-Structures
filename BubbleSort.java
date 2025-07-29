
public class BubbleSort {

	public static void main(String[] args) {
	int[] array = {10,9,8,7,6,5,4,3,2,1};
	int[] finalarray = Bubble(array);
	for(int i=0;i<finalarray.length;i++) {
		System.out.println(finalarray[i]);
	}
	}
	public static int[] Bubble(int[]array) {
	boolean swapped = true; 
	int n = array.length;
	while(swapped == true){
	swapped = false;
	for(int i = 1;i<n;i++){
	if(array[i-1]>array[i]){
	int temp = array[i-1];
	array[i-1] = array[i];
	array[i] = temp;
	swapped = true;
	}
	}
	n = n-1;
	}
	return array;
	}

}
