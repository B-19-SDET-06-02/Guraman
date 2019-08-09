package Array2d;

import java.util.Scanner;

public class Addition {
	Scanner s=new Scanner(System.in);
	int [][] arr1;
	int[] [] arr2;
	int[] [] arr3;

	int size11,size12, size21,size22;
	public void input(){
		System.out.println("enter size");
		size11=s.nextInt();
		size12=s.nextInt();

		arr1=new int[size11][size12];
		System.out.println("enter elements");
		for(int i=0;i<size11;i++){
			for(int j=0;j<size12;j++)
			{
				arr1[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<size11;i++)
		{
			for(int j=0;j<size12;j++){
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
			
		}
		
		System.out.println("for second array");
		
		System.out.println("enter size");
		arr2=new int[size11][size12];
		System.out.println("enter elements");
		for(int i=0;i<size11;i++){
			for(int j=0;j<size12;j++)
			{
				arr2[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<size21;i++)
		{
			for(int j=0;j<size22;j++){
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
			
		}
		arr3=new int[size11][size12];
		for(int i=0;i<size11;i++){
			for(int j=0;j<size12;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition oo=new Addition();
		oo.input();

	}

}
