package CoreJava;

public class StringPractice {

	public static void main(String[] args) {
		
		char[] ch= {'s','u','m','a'};
		System.out.println(ch);
		String s=new String(ch);
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		s.toLowerCase();
		
		
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		
		String str1="Josh";
		System.out.println(str1);
		String str2=new String("My dear");
		System.out.println(str2);
		String str3=str1+str2;
		
		System.out.println(str3);
		str1="josh"+"hi";
		System.out.println(str1);
		str2=str2+"bye";
		System.out.println(str2);
		// Strings are immutable
		//str2=str2.reverse();
		
		
		
		StringBuffer sb=new StringBuffer("apple");
		//String str5="apple";
		StringBuffer str6=sb.reverse();	
		System.out.println(str6);
		sb.append('c');
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		
	}

}