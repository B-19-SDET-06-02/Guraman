package Test07Aug;

public class Palindrome {
	String s1="Guramandeep Singh";
	String rev="";
	int len = s1.length();
	public void check(){
		for(int i=len;i>0;i--){
			rev+=s1.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);
		if(s1.equals(rev)){
			System.out.println("String is Palindrome: "+s1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome obj=new Palindrome();
		obj.check();
	}

}
