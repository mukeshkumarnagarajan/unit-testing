
public class Maths {

		
		public int add(int a, int b) {
			if (a == 0) {
				System.out.println("A is Zero");
			}
			if (a == 5) {
				throw new RuntimeException();
			}
			
			return a + b;
		}


}
