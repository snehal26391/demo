package exceptionHandling;

public class ExceptionHandling {
	public static void main(String[]args) {
		
		
		try {
		
		String a = null;
		System.out.println(a.length()); 
		
		}
		catch(Exception e) {
			
	e.printStackTrace();
	System.out.println(e.getMessage());
	System.out.println("This /by error");
		}
		
		finally {
			System.out.println("This is finally block");
		}
			String b = "Snehal";
			
			System.out.println(b.length());
		}	
		
		
		
		
		
	}
	
	

