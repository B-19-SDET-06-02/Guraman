package loops;

public class tabukar {
	int a=2,b,c;
	public void loop() {
		for(b=1;b<=10;b++) {
			c=a*b;
			System.out.println(a+" * "+b+" = "+c);
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tabukar oo=new tabukar();
		oo.loop();

	}

}
