package BubblesortNewclass;

public class Bubblesort {
	public void bubbleSort(int arr[]) {
		for (int i = 0; i<=arr.length-2; i++) {
            for (int j = 0; j<=arr.length-2-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
	}

}
