package Insertionsort;



import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the elements in array");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Array before sorting");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+"|");
		}
		
		Insertionsort(arr);
		System.out.println("");
		System.out.println("Array after sorting");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.print(arr[i]+"|");
		 }
	  }
	  public static void Insertionsort(int arr[]) {
	    int j,item;
	    for(int i=1;i<=arr.length-1;i++){
	    	item=arr[i];
	    	j=i-1;
	    	while(j>=0 && arr[j]>item){
	    		arr[j+1]=arr[j];
	    		j--;
	    	}
	    	arr[j+1]=item;
	    }
	 }      
}
