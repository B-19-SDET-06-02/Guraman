package String;

public class Vowels {
	String s1="Guramandeep Singh";
	int a,e,i,o,u;
	public void check(){
		int count=s1.length();
		for(int j=count-1;j>=0;j--){
			char vow=s1.charAt(j);
			if(vow=='a')
				a++;
			if(vow=='e')
				e++;
			if(vow=='i')
				i++;
			if(vow=='o')
				o++;
			if(vow=='u')
				u++;
			
		}	
		System.out.println("A is occuring: "+a);
		System.out.println("E is occuring: "+e);
		System.out.println("I is occuring: "+i);
		System.out.println("O is occuring: "+o);
		System.out.println("U is occuring: "+u);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowels obj=new Vowels();
		obj.check();
	}

}
