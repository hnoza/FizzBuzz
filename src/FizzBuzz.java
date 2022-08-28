
public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i < 101; i++) {
			
			if((i % 3) == 0 && (i % 5) == 0) {
				
				// 3と5の両方で割り切れる場合
				System.out.println("FizzBuzz");
				
			} else if (i % 3 == 0) {
				
				// 3で割り切れる場合
				System.out.println("Fizz");
				
			} else if (i % 5 == 0) {
				
				// 5で割り切れる場合
				System.out.println("Buzz");
				
			} else {
				
				// 上記のいずれでもない場合
				System.out.println(i);
			}
		}

	}

}
