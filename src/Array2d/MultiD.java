package Array2d;

import java.util.Scanner;

public class MultiD {

	Scanner s=new Scanner(System.in);
	int [][] arr;
	int size1,size2, counter;
	public void input(){
		System.out.println("enter size");
		size1=s.nextInt();
		size2=s.nextInt();

		arr=new int[size1][size2];
		System.out.println("enter elements");
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<size1;i++)
		{
			for(int j=0;j<size2;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiD a=new MultiD();
		a.input();
	}


}
