import java.io.IOException;

public class MainBasic {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		
		//Basic
		
		//Task 1 Hello World!
		System.out.println("Task1 Hello World!");
		
		//Task 2 Assignment
		String helloWorld = "Task2 Hello World!";
		System.out.println(helloWorld);
		
		//Task 3 Parameters
		HelloWorld();
		
		//Task 4 Return Types
		String hello = T4HelloWorld();
		System.out.println(hello);
		
		//Task 5 Parameters/Operators
		int a = 5;
		int b = 4;
		
		int result = T5Parameters(a,b);
		System.out.println("Task5 " + result);
		
		//Task 6 Conditionals
		
		int c = 2;
		int d = 3;
		Boolean bool = false;
		
		int T6result = T6Conditionals(c,d, bool);
		System.out.println("Task6 " + T6result);
		
		//Task 7 Conditionals 2

		int e = 1;
		int f = 2;
		Boolean bool2 = true;
		
		int T7result = T7Conditionals2(e,f, bool2);
		System.out.println("Task7 " + T7result);
		
		//Task 8 Iteration
 
		int g = 1;
		Boolean bool3 = true;
		
		for(int h = 0; h < 10; h++)
		{
		 int T8result = T7Conditionals2(g,h, bool3);
		 System.out.println("Task8 " + T8result);
		}
		
		//Task 9 Arrays
		
		int k = 1;
		int[] arrayOfInts = {0,1,2,3,4,5,6,7,8,9};
		
		for(int l = 0; l < 10; l++)
		{
			int T9result = T7Conditionals2(k,arrayOfInts[l], bool3);
			System.out.println("Task9 " + T9result);
		}
		
		//Task 10 Iterations/Arrays
		
		for(int m = 0; m < arrayOfInts.length; m++)
		{
			System.out.println("Task10 " + arrayOfInts[m]);
		}
		
		//Task 11 Iteration/Arrays 2
		
		int[] arrayOfInts2 = new int[10];
		for(int q = 0; q < arrayOfInts2.length; q++)
		{
			arrayOfInts2[q] = q + 1;
			System.out.println("Task11 " + arrayOfInts2[q]);
		}
		for(int x = 0; x < arrayOfInts2.length; x++)
		{
			int result3 = arrayOfInts2[x] * 10;
			System.out.println("Task11 Part2 " + result3);
		}
		
		//Go To Intermediate Tasks
		Intermediate Inter = new Intermediate();
		Inter.IntermediateTasks();
		
		
	}
	
		//Task 3 Method
		public static void HelloWorld ()
		{
			System.out.println("Task3 Hello World!");
			
		}
		
		
		//Task 4 Method
		public static String T4HelloWorld()
		{
			String helloWorld = "Task4 Hello World!";
			return helloWorld;
			
		}
		
		//Task 5 Method
		public static int T5Parameters(int a, int b)
		{
			int result = a + b;
			return result;
		}
		
		//Task 6 Method
		public static int T6Conditionals(int a, int b, Boolean bool)
		{
			int T6result = 0;
			if (bool)
			{
			T6result = a + b;	
			}
			else if (!bool)
			{
			T6result = a * b;		
			}
			return T6result;
		}
		
		//Task 7 Method
				public static int T7Conditionals2(int a, int b, Boolean bool)
				{
					if (a == 0)
					{
						return b;
					}
					if (b == 0)
					{
						return a;
					}
					
					int T6result = 0;
					if (bool)
					{
					T6result = a + b;	
					}
					else if (!bool)
					{
					T6result = a * b;		
					}
					return T6result;
				}
		
}
