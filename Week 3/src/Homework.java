public class Homework {
	
   public static void main() {
	   
   //1.
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
	System.out.println(passVariable);
	
	
	int[] newAges = new int[ages.length + 1];
	newAges[8] = 4;
	
	int newPassVariable = findNewAge(newAges);
	System.out.println(newPassVariable);
	
	//2.
	int sum = 0;
	for(int i = 0; i < newAges; i++) {
		sum += newAges[i];
		
	}
	int average = sum/(newAges.length + 1);
	System.out.println(average);
	
	int counter;
	String[] names = new String[6];
	 names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	 
	 for (int i = 0; i < names.length; ) {
		 counter += names[i].length;
	 	
	 }
	 int averages = counter/names.length;
	 	System.out.println(averages);
	 	
	 	//2b.
	 	
	 	//3. access the last element in an array by the command array.length -1
	 	//4. access the first element in ana rray by the command array[0]
	 	
   }  
	
	
	public static int findNewAge(int[] ages) {
		//1.
		int newAge = ages[0] - ages.length -1;	
				
		return newAge; 
	}

	

}




