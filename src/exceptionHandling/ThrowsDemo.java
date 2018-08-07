package exceptionHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDemo {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, AWTException {
		
		Thread.sleep(2000);
		FileInputStream fs = new  FileInputStream("");
		Robot a = new Robot();

	}

}
