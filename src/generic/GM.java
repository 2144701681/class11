package generic;

public class GM {

	public static void main(String[] args) {
		
		String[] names = {"James","Jane","Tom","Ron"};
		Boolean[] values = {true,false,false,false,true};
		
		Integer[] nums = {34,546,7457,23,6546};
		
			printArray(names);
			printArray(values);
			printArray(nums);
			
			
			
			
	//below the example is Generic method instead of 3 method we can using work by 1 method 
			//before return type we need to put <> inside examole below
			//this E is own data type we can use different name instead E
			//this is the generic method
	}
	public static<E> void printArray(E[] abc) {
		for(E item:abc) {
			System.out.println(item);

	}
	}
}
//below 3 type of method are polymorphism or overload method bcz same name differnt data types
	//instead to write 3 method we can use 1 method thats called Generic method ex on top
	
	/*  public static void printArray(String[] abc) {
		for(String item:abc) {
			System.out.println(item);
		}	
		}
		public static void printArray(int[] abc) {
			for(int item:abc) {
				System.out.println(item);
	}
		}	public static void printArray(boolean[] abc) {
				for(boolean item:abc) {
					System.out.println(item);

}
}
		
	}
*/	
