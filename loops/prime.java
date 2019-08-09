package loops;

public class prime {
	int a=13,b,c=0;
	public void loop() {
		for(b=2;b<a/2;b++) {
			if(a/b==0) {
				c=c+1;
			}
			if(c==0) {
				System.out.println("no is prime");
				break;
			} else {
				System.out.println("not prime");
			}		
		}	
	}
	public static void main(String[] args) {
		prime oo=new prime();
		oo.loop();
	}
}
