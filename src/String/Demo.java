package String;

public class Demo {
	String s1="Guramandeep Singh";
	String s2[];
	 //int count=s1.length();
	String rev="", rev2="";
	public void check(){
		/*for(int i=count;i>0;i--){
			rev+=s1.charAt(i);
			System.out.println(rev);
		}
		System.out.println(rev);*/
		s2=s1.split(" ");
		int count1=s2[0].length();
		int count2=s2[1].length();
		for(int i=count1-1;i>=0;i--){
			rev+=s2[0].charAt( i);
			
		}
		
		
		for(int j=count2-1;j>=0;j--){
			rev2+=s2[1].charAt(j);
		}
		
		System.out.println(rev2+" "+rev);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj=new Demo();
		obj.check();
		
	}

}
