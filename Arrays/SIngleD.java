package Arrays;
import java.util.Scanner;
public class SIngleD {
	Scanner s = new Scanner(System.in);
	int entry,n;
	int[] rollno= new int[5];
	int[] avg= new int[5];
	int[] total= new int[5];
	int[] per= new int[5];
	String[] name= new String[5];
	int[] eng= new int[5];
	int[] punjabi= new int[5];
	int[] sci= new int[5];
	
	public void rollno() {
		System.out.println("enter  roll no");
		System.out.println("enter  names");
		System.out.println("enter  eng marks");
		System.out.println("enter  punjabi marks");
		System.out.println("enter  sci marks");
		
		for(entry=0;entry<1;entry++) {
			rollno[entry]=s.nextInt();
			//s.next();
			name[entry]=s.next();
			eng[entry]=s.nextInt();
			punjabi[entry]=s.nextInt();		
			sci[entry]=s.nextInt();
		}
		System.out.println("next entry");		
	}
	
	public void total() {
		for(entry=0;entry<1;entry++) {
			total[entry]=eng[entry]+punjabi[entry]+sci[entry];
		}
	}
	
	
	public void percentage() {
		for(entry=0;entry<1;entry++) {
			per[entry]=total[entry]*100/300;
		}
	}
	public void average() {
		for(entry=0;entry<1;entry++) {
			avg[entry]=total[entry]/3;
		}
	}
	
	public void result() {
		System.out.println("Roll no \t Name \t Eng \t Punjabi \t Sci \t Total \t Avg \t percentage");
		for(entry=0;entry<1;entry++) {
			System.out.println(rollno[entry] + " \t " + name[entry] +" \t " + eng[entry] + " \t "+ punjabi[entry] +" \t " + sci[entry] + " \t " + total[entry] +" \t "+ avg[entry] + " \t " + per[entry]);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SIngleD obj=new SIngleD();
		obj.rollno();
		obj.total();
		obj.average();
		obj.percentage();
		obj.result();
	}

}
