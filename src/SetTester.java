import java.util.Arrays;

public class SetTester {

	public static void main(String[] args) {

		Set s1 = new Set(6);
		Set s2 = new Set(6);
		Set s3 = new Set(6);
		
		
		

		s1.add("hat");
		s1.add("shoes");
		s1.add("shirt");
		
		s3.add("hat");
		s3.add("shoes");
		s3.add("shirt");
		
		s2.add("cat");
		s2.add("drink");
		s2.add("fun");
		
	
		
		
		System.out.println(s2.union1(s1));

		//System.out.println(s1.intersection(s3));
	
	
		System.out.println(" ---------The cuurent elements in set 1---------------" );
		System.out.println(s1);
		
		System.out.println(" ---------It will print out hat---------------" );
		System.out.println(( s1.getFirst()));

		System.out.println(" ---------It will print out true---------------" );
		System.out.println(s1.contains("dog"));

		System.out.println(" ---------It will remove dog---------------" );
		System.out.println(s1.remove("dog"));
		
		System.out.println(" ---------It will print out 3 for the count_of _object---------------" );
		System.out.println(s2.count_of_objects());


	
		


	}

}
