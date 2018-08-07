package exceptionHandling;

import java.util.InputMismatchException;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int c= 10/0;
			System.out.println("Div result is " +c);
		}catch(ArithmeticException e) {
		  System.out.println("Exception Message " +e.getMessage());
				
	     	}
		catch (InputMismatchException e) {
			System.out.println("Pls enter only integer values");
		}
		catch (Exception e) {
			System.out.println("Something went wrong");
		}
		finally {
			System.out.println("Finally block");
		}
		System.out.println("End");
		}
	}


