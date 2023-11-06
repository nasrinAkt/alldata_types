package multiple_data;

public class parameter_method {

	public static void main(String[] args) {
		parameter_method cup = new parameter_method();
		cup.bottle(200, 100.50);
		cup.paper("my first name is ", "Nasrin");
		parameter_method.ball('n');
	}
public void bottle(int a, double b) {
System.out.println(a);	
System.out.println(b);	
	
}
public void paper(String a, String b) {
String c = a+b;	
System.out.println(c);	
	
	
}
public static void ball(char a) {

	System.out.println(a);
}	
	
	
}
