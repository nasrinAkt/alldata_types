package multiple_data;

public class starts_ends_equal_equalignorecase_method {

	public static void main(String[] args) {
starts_ends_equal_equalignorecase_method mon = new starts_ends_equal_equalignorecase_method();
	mon.mobile();	
	starts_ends_equal_equalignorecase_method.phone();	
	mon.red();
	starts_ends_equal_equalignorecase_method.yellow();
	}
public void mobile() {
String a = "nasrin akter";
boolean c = a.startsWith("nasrin");
System.out.println(c);	
		
}
public static void phone() {
String a = "nasrin akter";
boolean c = a.endsWith("akter");
System.out.println(c);	
}	
public void red() {
String a = "Nasrin Akter";
String b = "Nasrin Akter";
boolean c = a.equals(b);
System.out.println(c);	
		
}	
public static void yellow() {
String a = "I love java";
String b = "i love Java";
boolean c = a.equalsIgnoreCase(b);
System.out.println(c);
}

	
	
}
