package demo;

import java.io.*;

public class Demo1 {
	

	public static void main(String[] args) {
		File f = new File("d\\abc.text");
		System.out.println(f.exists());
		f.mkdir();
		System.out.println(f.exists());
		File f1 = new File("abc.text");
		System.out.println(f1.exists());
		
		
		System.out.println(f1.getName());
		
		System.out.println(f1.getAbsolutePath());
		
		
		
		
		
		
		
		
		
		

	}

}
