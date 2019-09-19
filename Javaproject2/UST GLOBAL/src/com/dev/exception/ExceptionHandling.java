package com.dev.exception;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		try {
			s();
			System.out.println("No Exception for s()");
			d();
			System.out.println("No exception for divide()");
			
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Exception caught in catch block");
			System.err.println("getMessage(): +e.getMessage()");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Exception caught in catch block");
			System.err.println("getMessage(): +e.getMessage()");

		}finally {
			System.out.println("Finally Block");
		
		}
	}
	
		
		public static void s()
		{
			StringBuffer sb = new StringBuffer(-1);
		}
		public static void d() throws Exception{
			int a=1;
			int b=0;
			int c=a/b;
		}
}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	
		

	}

}
