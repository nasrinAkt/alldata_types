package multiple_data;


public class polymorphism_method_overloading {

	public static void main(String[] args) {
		
		polymorphism_method_overloading moon = new polymorphism_method_overloading();
		moon.nice(500);
		moon.nice(500, 500);
		
	}
public void nice(int a) {
System.out.println(a);
	
	
}
	
public void nice(int a, int b) {
int c = a+b;
System.out.println(c);
	
	
}	
	
	
	
}
