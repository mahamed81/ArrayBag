	import java.lang.Number;
	
	import java.lang.reflect.Method;
import java.util.Arrays;
	

	public class Array_Tester {

		public static void main(String[] args) throws Exception{
			
			BagInterface<String> b1 = new ArrayBag<String>(5);
			BagInterface<String> b2 = new ArrayBag<String>(5);
			BagInterface<String> b3 = new ArrayBag<String>(5);
			BagInterface<Integer> b4 = new ArrayBag<Integer>(5);
			BagInterface<Integer> b5 = new ArrayBag<Integer>(5);
			
			b4.add(1);
			b4.add(2);
			b4.add(3);
			b4.add(4);
			
			b5.add(1);
			b5.add(2);
			b5.add(3);
			b5.add(4);
		hello how are doing
			
			System.out.println(b4.equals(b5));
		
//			System.out.println(b4.getCurrentSize());
//			System.out.println(b5.getCurrentSize());
			
			
			
			b1.add("hello");
			b1.add("hello");
			b1.add("yellow");
			b1.add("green");
			b1.add("green");
			
			b2.add("glow");
			b2.add("hair");
			b2.add("green");
			
			b3.add("hello");
			b3.add("hello");
			b3.add("yellow");
			b3.add("green");
			b3.add("green");
			
			
	
		//	System.out.println(b3.equals(b1));
			
			
			System.out.println("--------- The entries in b1 -----------");
			System.out.println(Arrays.toString(b1.toArray()));
			
			
			System.out.println("-----------It prints false -------------");
			System.out.println(b1.isEmpty());
			
			
			System.out.println("------------It prints 1 -----------------");
			System.out.println(b1.getCurrentSize());
			
			
			System.out.println("------------It prints 2 -----------------");
			System.out.println(b1.getFrequencyOf("hello"));
			
			
			System.out.println("------------It prints false -----------------");
			System.out.println(b1.contains("you" ));
			
			System.out.println("------------It prints null -----------------");
			b1.clear();
			System.out.println(b1);
			
			System.out.println("------------It prints greeen -----------------");
			System.out.println(b2.remove());
			
			System.out.println("------------It prints true -----------------");
			System.out.println(b2.add("woow"));
			
			System.out.println("------------It prints true -----------------");
			System.out.println(b2.contains("hair"));
			
			
			System.out.println("------------Replaces hair with yooow -----------------");
			System.out.println(b2.replace("hair","yooow"));
			
			System.out.println(Arrays.toString(b2.toArray()));
			
			
			System.out.println(Arrays.toString(b3.toArray()));
			
			System.out.println("------------Removes all the greens -----------------");
			
			System.out.println(b3.removeEvery("green"));
			
			System.out.println(Arrays.toString(b3.toArray()));
			
			
			
			
		}

	}




