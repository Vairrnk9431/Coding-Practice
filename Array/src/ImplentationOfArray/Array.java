package ImplentationOfArray;

import java.util.Scanner;

public class Array {
	private int arr[]=null;
	private Scanner scan=new Scanner(System.in);
	public Array(int n) {
		arr=new int[n];	
	}
	public void insert() {
		System.out.println("Enter the position from 0 to"+(arr.length));
		int pos=scan.nextInt();
		System.out.println("Enter an integer element to insert into position");
		int elem=scan.nextInt();
		arr[pos]=elem;
			
		}
	public void delete() {
		System.out.println("Enter the position from where to delete");
		int pos=scan.nextInt();
		arr[pos]=0;
		
	}
	public void display() {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	}


