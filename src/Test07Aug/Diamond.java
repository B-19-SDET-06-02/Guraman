package Test07Aug;

public class Diamond {
	int i,j,k,l=1;
	public void check(){
		for(i=1;i<=5;i++){
			for(j=2;j>=i;j--){
				System.out.println(" ");
			}
			for(k=1;k<=l;k++){
				System.out.println("*");
				
			}
			l=l+2;
			
		}
		for(i=1;i<=2;i++){
			for(j=1;j<=i;j++){
				System.out.println(" ");
			}
			for(k=3;k>l;k--){
				System.out.println("*");
			}
			l=l+2;
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diamond obj=new Diamond();
		obj.check();
	}

}
