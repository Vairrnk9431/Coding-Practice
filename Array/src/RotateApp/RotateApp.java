package RotateApp;

public class RotateApp {
	public static void rotateclockwise(int arr[],int k){
		for(int j=1;j<=k;j++) {
			int temp=arr[arr.length-1];
			for(int i=arr.length-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		System.out.println("After clockwise rotation");
		 for(int i=0;i<=arr.length-1;i++) {
        	 System.out.print(arr[i]+" ");
         }
	}
	public static void rotateanticlockwise(int k,int arr[]){
	 for(int j=1;j<=k;j++) {
		    int temp=arr[0];
		    for(int i=1;i<=arr.length-1;i++) {
		    	arr[i-1]=arr[i];  	
		    }
		    arr[arr.length-1]=temp;
		 }
	 System.out.println("After Anticlockwise rotation");
	 for(int i=0;i<=arr.length-1;i++) {
    	 System.out.print(arr[i]+" ");
     }
	 
	 }
	
	 
}
