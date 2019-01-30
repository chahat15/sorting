package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = {10,3,4,9,7,15,6,22,8,11,2,65};
		int lenght = arr.length;
		for (int i = 0; i < lenght-1; i++) {
            for (int j = 0; j < lenght-i-1; j++) {
                if (arr[j] > arr[j+1])
                {
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
			}
		}
	}
}