package BasicPgm;

public class occuranceOfLetter {

	public static void main(String[] args) {
		String s1="Banana";
		while(s1.length()!=0)
		{
			char c=s1.charAt(0);
			String s2= s1.replace(c+"","");
			
			int count=s1.length()-s2.length();
			System.out.println(c+"="+count);
			s1=s2;
		}
	}

}
