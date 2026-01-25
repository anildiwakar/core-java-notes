package strings;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Java";
		s2=s2+"script";
		String s3=new String("Java");
		String s4=new String("Java");
		String s5="JAVA";
		String s6 = "C";
		String s7="Java";
		String s8="Script";
		String s9="school";
		String s10="SCHOOL";
		String s11="     test    ";
		String s12 = " ";

		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s4); // used to compare references
		System.out.println(s3.equals(s4)); // used to compare values
		System.out.println(s1.length()); // returns length of the string
		System.out.println(s1.charAt(1)); // return character at particular index
		System.out.println(s1.equalsIgnoreCase(s5)); // used to compare values ignoring case
		System.out.println(s6.compareTo(s7));   // if this returns <0 frist string less then second string
		System.out.println(s7.contains("va")); // it will check weather particular char sequence is present or not
		System.out.println(s7.indexOf("a")); // it will return index of first matching character
		System.out.println(s7.lastIndexOf("a"));
		System.out.println(s7.startsWith("Ja"));
		System.out.println(s7.endsWith("ja"));
		System.out.println(s7.concat(s8));
		System.out.println(s7.replace('a', 'e'));
		System.out.println(s8.replace("pt", "pted"));
		System.out.println(s9.substring(2));
		System.out.println(s9.substring(2,5));
		System.out.println(s9.toUpperCase());
		System.out.println(s10.toLowerCase());
		System.out.println(s11.length());
		s11=s11.trim();
		System.out.println(s11.length());
		System.out.println(s12.isEmpty());
		System.out.println(s12.isBlank());
		
		// J a v a s c r i  p  t
		// 0 1 2 3 4 5 6 7 8 9 10 11 12
		//StringBuffer sb= new StringBuffer("Java");
		StringBuilder sbe= new StringBuilder("Java");
		sbe=sbe.append("script");
		sbe.insert(4, "abc");
		sbe.delete(4, 6);
		sbe.deleteCharAt(4);
		sbe.replace(4,6,"ab");
		sbe.setCharAt(4, 's');
		sbe.setCharAt(5, 'c');
		
		
		
		//System.out.println(sb);
		System.out.println(sbe);
		System.out.println(sbe.reverse());










		


	}

}
