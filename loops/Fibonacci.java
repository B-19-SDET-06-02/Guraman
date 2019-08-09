package loops;

public class Fibonacci {
	int i=0,j=1,k=0,num=100;
	public void Loop() {
		while(k<num) {
			System.out.println(i);
			k=i+j;
			i=j;
			j=k;
			k=k+1;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci oo=new Fibonacci();
		oo.Loop();


	}

}
