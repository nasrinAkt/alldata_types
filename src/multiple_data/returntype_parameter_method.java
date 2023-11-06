package multiple_data;

public class returntype_parameter_method {

	public static void main(String[] args) {
		
		returntype_parameter_method flower = new returntype_parameter_method ();
		flower.lime(1000, 2000);
	
		returntype_parameter_method.song("My full name is ", "Nasrin Akter"); 
		
		
	}
public int lime(int a, int b) {
int c = a+b;
System.out.println(c);
return c;
	
}
public static String song(String a, String b) {
String c = a+b;
System.out.println(c);
return c;
	
	
}
	
	
	
	
	
	
	
	
}
