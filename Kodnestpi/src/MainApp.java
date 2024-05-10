import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter element of data");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter element of array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		 KodNestSearchSort sort=new KodNestSearchSort();
		while(true) {
			System.out.println("Enter your Choice");
			System.out.println("Press1----->Searching");
			System.out.println("Press2----->Sorting");
			System.out.println("Press3----->Finding min and max");
			System.out.println("Press any other for---> Tata byee byeee");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:System.out.println("Linear Search-->1 or Binary Search-->2");
			int choice1=scan.nextInt();
			if(choice==1) {
				System.out.println("enter key to search");
				int key=scan.nextInt();
				int res=sort.linearSearch(arr, key);
				System.out.println("Linear search");
				if(res>=0) {
					System.out.print("key is found @"+res);
				}
				else {
					System.out.print("key is not found");
				}
				System.out.println();
			}
			else if(choice1==2) {
				System.out.println("enter key to search");
				int key=scan.nextInt();
				int res2=sort.binarySearch(arr, key);
				System.out.println("Binary Search array after sorting");
				for(int i=0;i<=arr.length-1;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
				if(res2!=-1) {
					System.out.println("key found at array @"+res2);
				}
				else {
					System.out.println("key not found at array");
				}
				System.out.println();
			}
			else {
				System.out.println("please check again");
			}
			break;
			case 2:System.out.println("BUBBLE SORT-->1");
			System.out.println("SELECTION SORT-->2");
			System.out.println("INSERTION SORT-->3");
			int choice2=scan.nextInt();
			if(choice2==1) {
				System.out.println("FOR DSC SORT-->1");
				System.out.println("FOR ASC SORT-->2");
				int choice3=scan.nextInt();
				if(choice3==1) {
					sort.bubblesortDescending(arr);
					System.out.println("bubble sort descending order shorted array");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
					System.out.println();
				}
				if(choice3==2) {
					sort.bubblesortAscending(arr);
					System.out.println("bubble sort ascending order shorted array");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
					System.out.println();
				}
				else {
					System.out.println("please check again");
				}
			}
			if(choice2==2) {
				System.out.println("FOR DSC SORT-->1");
				System.out.println("FOR ASC SORT-->2");
				int choice4=scan.nextInt();
				if(choice4==1) {
					sort.selectionSortDescending(arr);
					System.out.println("selection sort descending order shorted array");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
					System.out.println();
				}
				if(choice4==2) {
					System.out.println("selection sort ascending order shorted array");
					for(int i=0;i<=arr.length-1;i++) {
						System.out.print(arr[i]+" ");
					}
					System.out.println();
				}
				else {
					System.out.println("please check again");
				}
			}
			if(choice2==3) {
			System.out.println("FOR DSC SORT-->1");
			System.out.println("FOR ASC SORT-->2");
			int choice5=scan.nextInt();
			if(choice5==1) {
				sort.insertionSortDescending(arr);
				System.out.println("insertion sort descending order shorted array");
				for(int i=0;i<=arr.length-1;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			if(choice5==2) {
				sort.insertionSortAscending(arr);
				System.out.println("insertion sort ascending order shorted array");
				for(int i=0;i<=arr.length-1;i++) {
					System.out.print(arr[i]+" ");
				}
				System.out.println();
			}
			else {
				System.out.println("please check again");
			}
			}
			break;
			case 3:System.out.println("MAX Search-->1  or MIN Search-->2");
			int choice6=scan.nextInt();
			if(choice6==1) {
				sort.findMax(arr);
				System.out.println(arr[arr.length-1]+"is Maximum array");
			}
			if(choice6==2) {
				sort.findMinimum(arr);
				System.out.println(arr[0]+"is Minimum array");
			}
			else {
				System.out.println("please check again");
			}
			break;
			default:System.out.println("TATA BYE BYE");
			return;
		}
		}
	}

}