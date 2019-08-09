package loops;

public class Primeseries {
	int a,b,c;
	public void loop() {
		for(a=0;a<=100;a++) {
			c=0;
			for(b=1;b<=a;b++) {
				if(a%b==0)
				{
					c++;
				}
			}
			if(c==2) {
				System.out.println("prime: "+a);
			}	
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primeseries oo=new Primeseries();
		oo.loop();
	}
}
