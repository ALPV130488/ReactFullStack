package exceptions;

class AgeNotValidException extends Exception {//pojo code

	private int age;
	
	public AgeNotValidException() {
		
	}

	public AgeNotValidException(String data) {
	
		System.out.println(data);
	}

//	public String toString() {
//		return "you are not eligable for vote  :" + age;
//	}
}

public class Exception6 {

	public static void validation(int age) throws AgeNotValidException {

		if (age < 18) // below 18
		{
			throw new AgeNotValidException("your are not eligible to vote");
		}

		else { // above 18

			System.out.println("you are eligable to vote");
		}
	}

	public static void main(String args[]) throws AgeNotValidException {
		
			validation(9);
		

	
		System.out.println("rest of the code...");
	}
}
