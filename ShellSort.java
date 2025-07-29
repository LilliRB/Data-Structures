
public class ShellSort {

	public static void main(String[] args) {
		int[] array = {10,9,8,7,6,5,4,3,2,1};
		int[] finalarray = Shell(array);
		for(int i=0;i<finalarray.length;i++) {
			System.out.println(finalarray[i]);
		}

	}
	public static int [] Shell(int[] array) {
		int n = array.length;
		for (int gap = n/2;gap>0; gap = gap/2){
			for (int i=gap;i<n;i++){
			int key = array[i];
			int j = i-1;
			while (j>=0 && array[j]>key){
			array[j+1] = array[j];
			j = j-1;
			}
			array[j+1] = key;
			int temp = array[i];
			j=i;
			while (j>=gap && array[j-gap]>temp){
			array [j] = array [j-gap];
			j-=gap; 
			}
			array [j] = temp;
			}
			}
		return array;

}
}
