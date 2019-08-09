package String;

public class Replace {
	String s1="Guramandeep Singh";
	String s2[]={"Guramandeep","Singh"};
	public void check(){
		//int count=s1.length();
		for(int i=0;i<2;i++){
			if(s1.contains(s2[i]))
			{
				s1=s1.replace(s2[i],"***");
			}
			
		}
		System.out.println(s1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Replace obj=new Replace();
		obj.check();
	}

}
