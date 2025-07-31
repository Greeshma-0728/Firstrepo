package Stringprogram;

public class StringExample {

	public static void main(String[] args) {
		String s="Hello";
		System.out.println(s);
		String g=new String("hi");
		System.out.println(g);
		//length()-it return length of the string
		System.out.println(s.length());
		//charAt()-return character based on index
		System.out.println(s.charAt(3));
		//concat()-add two string
		System.out.println(s.concat(g));
		//contains-check word present in string
		String v="Hello World";
		System.out.println(v.contains("o"));
		System.out.println(s.contains(g));
		//toUppercase()-to convert capital letter to small letter
		System.out.println(s.toUpperCase());
		//toLowerCase()-to capital letter to small letter
		System.out.println(s.toLowerCase());
		//equals()
		String f="java";
		String c="java";
		String h="Java";
		String k="selenium";
		System.out.println(f.equals(c));
		System.out.println(f.equals(h));
		System.out.println(f.equals(k));
		//equalsIsIgnorecase()
		System.out.println(f.equalsIgnoreCase(h));
		System.out.println(f==c);
		String p=new String("java");
		System.out.println(f==p);//for different memory location(compares memory location)
		System.out.println(f.equals(p));//true returns because content same (compares content/values)
		//isempty-to check whether the string is empty or not
		System.out.println(f.isEmpty());
		String z="";
		System.out.println(z.isEmpty());
		//trim()-to remove white space
		String i="I can take";
		System.out.println(i.trim().replaceAll(" ",""));
		String u=" method";
		System.out.println(u.trim());
		//substring()-extract the string based on index
		System.out.println(s.substring(0,5));
		//valueof()-to convert any datatype to string
		int q=555;
		System.out.println(String.valueOf(q));
		
		
	}

}
