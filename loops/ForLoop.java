package loops;

public class ForLoop {
	int i=4,fact=1;
	public void loop() {
		for(int a=1;a<=i-1;a++) {
			fact*=(a+1);
					
		}
		
		System.out.println(fact);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop oo=new ForLoop();
		oo.loop();

	}

}