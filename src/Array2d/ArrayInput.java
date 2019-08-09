package Array2d;

import java.util.Scanner;

public class ArrayInput {
	Scanner s=new Scanner(System.in);
	int [] arr;
	int size, counter;
	public void input(){
		System.out.println("enter size");
		size=s.nextInt();
		arr=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayInput a=new ArrayInput();
		a.input();
	}

}
