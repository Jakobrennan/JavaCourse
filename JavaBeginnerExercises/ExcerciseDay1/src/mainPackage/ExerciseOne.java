/**
 * Below are all the Java SE exercises provided by the book. The single line comments are the titles of the challenges
 */
package mainPackage;

/**
 * @author Jakob Brennan
 *
 */
public class ExerciseOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hello World!
		System.out.println("Hello World!");
		
		line();
		
		//Assignment
		String HW = "Hello World!";
		System.out.println(HW);
		
		line();
		
		//Parameters
		toConsole("Hello World! (again)");
		
		line();
		
		//Return Types
		outPut();
		
		line();
		
		//Parameters/Operators
		System.out.println(addition(3, 5));
		System.out.println(addition(10000, 876238));
		
		line();
		
		//Conditionals
		System.out.println(addition(8, 10, false));
		
		line();
		
		//conditionals 2
		System.out.println(addition(0, 5));
		System.out.println(addition(12, 0));
		
		line();
		
		//Iteration
		for(int i = 0; i <= 10; i++) {
			System.out.println(addition(i, i+i));
		}
		
		for(int i = 0; i <= 10; i++) {
			//boolean extra = (i % 2 == 0);
			System.out.println(addition(i, i+i, (i % 2 == 0)));
		}
		
		line();
		
		//Arrays
		int[] additionValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};//new int[10];
		for(int i = 0; i < 5; i++) {
			System.out.println(addition(additionValues[i], additionValues[i + 5]));
		}
		
		line();
		
		//iteration/arrays
		for(int i = 0; i < additionValues.length; i++) {
			System.out.println(additionValues[i]);
		}
		
		line();
		
		//iteration/arrays 2
		int[] pushInto = new int[10];
		for(int i = 0; i < 10; i++) {
			pushInto[i] = i;
			System.out.println(pushInto[i]);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(pushInto[i] * 10);
		}
	}
	
	public static void toConsole(String output) {
		System.out.println(output);
	}
	
	public static void outPut() {
		System.out.println("Hello World! for the 4th time");
	}
	
	public static int addition(int firstInt, int secondInt) {
		return firstInt + secondInt;
	}
	
	public static int addition(int firstInt, int secondInt, boolean multiplier) {
		
		if(firstInt == 0 || secondInt == 0) {
			if(firstInt == 0) {
				return secondInt;
			} else {
				return firstInt;
			}
		};
		
		if (multiplier) {
			return firstInt + secondInt;
		} else {
			return firstInt * secondInt;
		}
	}
	
	public static void line() {
		System.out.println("----------------------------------");
	}
}
