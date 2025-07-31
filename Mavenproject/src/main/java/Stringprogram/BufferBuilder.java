package Stringprogram;

public class BufferBuilder {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("World");
		System.out.println(sb);
		StringBuilder sd=new StringBuilder("Hello");
		System.out.println(sd);
		//insert- insert a particular string based on index
		System.out.println(sb.insert(0,"Hello"));
		//append-add the new value to string
		System.out.println(sb.append("My"));
		//replace-replace a particular value based on index
		System.out.println(sb.replace(0, 5,"W"));
		//REVERSE-to reverse the string
		System.out.println(sb.reverse());
		//delete-delete elements based on index
		System.out.println(sb.delete(0, 3));
		
		

	}

}
