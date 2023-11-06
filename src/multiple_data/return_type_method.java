package multiple_data;

public class return_type_method {

	public static void main(String[] args) {
		return_type_method water = new return_type_method();
		water.mud();
		
		return_type_method.mud2();
		water.girl();
	}
public String mud() {
String a = "My name is ";	
String b = "Nasrin";
String c = a+b;
System.out.println(c);
return c;		
}
public static int mud2() {
int a = 400;
int b = 500;
int c = a+b;
System.out.println(c);
return	c;
	
	
}	
public double girl() {
	double a = 10.50;
System.out.println(a);
	return a;
}	
	
	
	
	
}
