import java.util.Scanner;
public class KodNestSearchSort {
	Scanner scan=new Scanner(System.in);
	int linearSearch(int arr[],int key) {
		for(int i=0;i<=arr.length-1;i++) {
			if(key==arr[i]) {
				return i;
			}
		}
		return -1;
	}
	int binarySearch(int arr[],int key) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int low=0;
		int high=arr.length-1;
		for(int i=0;i<arr.length-1;i++) {
			int mid=(low+high)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key>arr[mid]) {
				low=mid+1;
				high=high;
			}
			else {
				high=mid-1;
				low=low;
			}
		}
		return -1;
	}
	void bubblesortAscending(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void bubblesortDescending(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void selectionSortAscending(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]<min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}
	void selectionSortDescending(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<=arr.length-1;j++) {
				if(arr[j]>min) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
		}
	}
	void insertionSortAscending(int arr[]) {
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
	void insertionSortDescending(int arr[]) {
		for(int i=1;i<=arr.length-1;i++) {
			int item=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]<item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
	int findMinimum(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[0];
	}
	int findMax(int arr[]) {
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=0;j<=arr.length-2;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr[arr.length-1];
	}
}