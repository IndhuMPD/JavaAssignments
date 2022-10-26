package day11;

import java.io.File;

public class Exceptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int x=10,y=0;
		
		int a[] = new int[10];
		
		System.out.println("print");
		try {
		System.out.println(x/y);
		} catch(ArithmeticException e)
		{
			System.out.println(e);	
		}
		
		
		try {
			System.out.println(x/y);
			} catch(Throwable e)
			{
				System.out.println("divide by zero");
			}
			
		for (int i = 0; i < x; i++) {
			
			a[i] = i;  //0-9
		}
		
		//System.out.println(a[10]);
		
		
		String str = "print";
		System.out.println(str.length());
	}

}
