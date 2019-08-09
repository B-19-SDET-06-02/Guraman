package loops;

public class Patterns {
	
	int i,j,k,num=100;
	public void Loop() {
		/*1
		22
		333
		4444*/
		for(i=1;i<=5;++i){
			for(j=1;j<=i;++j) {
				System.out.print(i+" ");
				i=i++;
			}
			System.out.println();
		}
	
	}
	
	public void Loop1() {
		/*1
		12
		123
		1234
		12345*/
		for(i=1;i<=5;++i){
			for(j=1;j<=i;++j) {
				System.out.print(j + " ");
				
			}    
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patterns oo=new Patterns();
		oo.Loop();
	}

}
