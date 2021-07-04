package Homework;


public class Hoemwork {

	public static void main(String[] args) {
		
		//1A.
		int[] ages = new int[8];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		int passVariable = findNewAge(ages);
		System.out.println("1A. " + passVariable);
		
		//1B.
		int[] newAges = new int[ages.length + 1];
		newAges[0] = 3;
		newAges[1] = 9;
		newAges[2] = 23;
		newAges[3] = 64;
		newAges[4] = 2;
		newAges[5] = 8;
		newAges[6] = 28;
		newAges[7] = 93;
		newAges[8] = 4;
		

		
		
		int newPassVariable = findNewAge(newAges);; 
		System.out.println("1B. " + newPassVariable);
		
		//1C.
		int sum = 0;
		for(int i = 0; i < (newAges.length); i++) {
			sum += newAges[i];
			
		}
		int average = sum/(newAges.length);
		System.out.println("1C. " + average);
		
		//2.
		String[] names = new String[6];
		 names[0] = "Sam";
		 names[1] = "Tommy";
		 names[2] = "Tim";
		 names[3] = "Sally";
		 names[4] = "Buck";
		 names[5] = "Bob";
		 
		 //2A.
		 double counter = 0;
		 for (int i = 0; i < names.length; i++ ) {
			counter += names[i].length();
			
		 }
		 double averages = counter/names.length;
		 	System.out.println("2A. " + averages);
		 	
		 	//2b.
		 	String listOfNames = "";
		 	for (int i = 0; i < names.length; i++) {
		 		 listOfNames += names[i] + " ";		
		 	}
		 	System.out.println("2B. " + listOfNames);
		 	
		 	//3 & 4
		 	System.out.println("3. Use array[arr.length - 1] to access the last element of an array");
		 	System.out.println("4. Use array[0] to access the first element of an array");
		 	
		 	//5.
		 	int[] nameLengths = new int[names.length];
		 	
		 	for (int i = 0; i < names.length; i++) {
		 		nameLengths[i] = names[i].length();
		 	}
		 		System.out.println("5. Look in the code, Line 77 :)");
		 	//6.
		 	int sum2 = 0;
		 	for (int i = 0; i < nameLengths.length; i++) {
		 		sum2 += nameLengths[i];
		 	}
		 	System.out.println("6. " + sum2);
		 	
		 	//7.
		 	String test7 = multiwords("hello", 3);
		 	System.out.println("7. " + test7);
		 	
		 	//8.
		 	String test8 = fullName("Tanner", "Dodd");
		 	System.out.println("8. " + test8);
		 	
		 	//9. 
		 	boolean test9 = hunderedPlus(ages);
		 	System.out.println("9. " + test9);
		 	
		 	//10.
		 	double[] array10 = {4.4, 101.39, 666.666, 1.0, 1995.41};
		 	double test10 = averageArray(array10);
		 	System.out.println("10. " + test10);
		 	
		 	//11.
		 	double[] array11 = {9.8, 89.9, 2021.74, 555.555, 1.0};
		 	boolean test11 = compareArray(array10, array11);
		 	System.out.println("11. " + test11);
		 	
		 	//12.
		 	boolean isHotOutside = true;
		 	double moneyInPocket = 15;
		 	boolean test12 = willBuyDrink(isHotOutside, moneyInPocket);
		 	System.out.println("12. " + test12);
		 	
		 	//13A & B. method report2Arrays takes the sum of 2 arrays, adds them together and finds the average, then reports that average 
		 	//along with one of 3 select phrases about the size of the array. 
		 	String arrayReport = report2Arrays(array10, array11);
		 	System.out.println("13B. " + arrayReport);
		 	
	   }  
		
		
		public static int findNewAge(int[] ages) {
			//1.
			int newAge = ages[0] - (ages[ages.length - 1]);	
					
			return newAge; 
		}

		
		public static String multiwords(String word, int n) {
			//7.
			String words = "";
			for (int i = 0; i < n; i++) {
				words += word;
			}
			
			return words; 
		}
		
		public static String fullName (String firstName, String lastName) {
			//8.
			String fullestName = firstName + " " + lastName;
			
			return fullestName;
		}
		
		public static boolean hunderedPlus (int[] array) {
				//9.
			int sum = 0;
				for (int i = 0; i < array.length; i++) {
					sum += array[i];
			}
				return sum > 100; 
						
		}
		
		public static double averageArray(double[] array) {
			//10.
			double sum = 0;
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			double average = sum/array.length;
			
			return average;
		}
		
		public static boolean compareArray(double[] array, double[] array2) {
			//11.
			double sum = 0;
			double sum2 = 0;
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			double average = sum/array.length;
			
			for(int j = 0; j < array2.length; j++) {
				sum2 += array2[j];
			}
			double average2 = sum2/array2.length;
			
			return average > average2;
		}
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			//12.
			if (isHotOutside == true && moneyInPocket >= 10.5) {
				return true;
			} else {
				return false;
			}
		}
		
		public static String report2Arrays(double[] array, double[] array2) {
			//13.
			double sum = 0;
			double sum2 = 0;
			
			for(int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			
			for(int j = 0; j< array2.length; j++) {
				sum2 += array2[j];
			}
			
			double average = (sum + sum2)/(array.length + array2.length);
			System.out.println("13A. The Average of the two arrays is: " + average);
			
			if (average < 450) {
				return "Those are rookie numbers, you gotta pump those numbers up!";
			} else if (450 < average && average < 900) {
				return "Those numbers ain't bad, but there's still room to grow!";
			} else {
				return "Holey Smokes! Those are some high numbers! Way to go!";
			}
			
		}
		
}


