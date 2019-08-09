package Array2d;

public class Pattern {
	
	int i,j,k,l,m;
	public void formation(){
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("second pattern");
		for(i=0;i<5;i++) {
			for(j=4-i;j>0;j--){
				System.out.print(" ");
				
			}
			for(k=0;k<=i;k++){
				System.out.print("*");	
			}
			
			System.out.println();
		}
		System.out.println("third pattern");
		for(i=0;i<5;i++) {
			for(j=5-i;j>1;j--){
				System.out.print(" ");
				
			}
			for(j=0;j<=i;j++){
				System.out.print("* ");	
			}
			
			System.out.println();
		}
		
		System.out.println("fourth pattern");
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++){
				System.out.print(" ");
				
			}
			
			for(j=0;j<=2*i;j++){
				System.out.print("* ");	
			}
		
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=new Pattern();
		p.formation();
	}

}
