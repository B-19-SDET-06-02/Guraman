package Arrays;

import java.util.Scanner;

public class BubbleSort {
	int i,j,k,counter,n,w,z,even;
	int f=3,pos;
	boolean flag=false;
	int[] num= new int[5];
	
	Scanner s= new Scanner(System.in);
	public void enternumber() {
		System.out.println("Enter 5 numbers");
		for(counter=0;counter<5;counter++) {
			num[counter]=s.nextInt();
		}
	}
	
	public void bubblesort() {
		for(i=0;i<num.length;i++) {
			for(j=0;j<num.length-1;j++) {
				if(num[j]>num[j+1]) {
					k=num[j+1];
					num[j+1]=num[j];
					num[j]=k;
				}
			}
		}
		for(i=0;i<num.length;i++) {
			System.out.println("Bubble Sort");
			System.out.print(num[i]+" ");
		}
		w = num[0];
		z=num.length-1;
		System.out.println("Smallest number is: "+w);
		System.out.println("Smallest number is: "+z);
		//System.out.println(w);
	}
	
	public void descending() {
		for(i=0;i<num.length;i++) {
			for(j=0;j<num.length-1;j++) {
				if(num[j]<num[j+1]) {
					k=num[j+1];
					num[j+1]=num[j];
					num[j]=k;
				}
			}
		}
		for(i=0;i<num.length;i++) {
			System.out.println("Descending order");
			System.out.print(num[i]+" ");
		}
	}
	

	public void findnum() {
		for(i=0;i<num.length;i++) {
			if(f==num[i]) {
				pos=num[i];
				flag=true;
			} 
		}
		if (flag) {
			System.out.println("Number found at position: "+pos);
		} else {
			System.out.println("num not found");
		}
	}
	
	public void even() {
		for(i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				System.out.print(num[i]+ " ");
			} 
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort obj=new BubbleSort();
		obj.enternumber();
		//obj.bubblesort();
		//obj.descending();
		//obj.findnum();
		obj.even();
	}

}
