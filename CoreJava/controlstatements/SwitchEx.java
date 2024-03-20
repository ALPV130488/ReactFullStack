package controlstatements;

public class SwitchEx {

	public static void main(String[] args) {
		
		float om = 560f;
		
		float mm = 600f;
		
		float percentage = ((om/mm)*100);
		
		System.out.println("percentage is:-"+percentage);
		
		int gpa = (int) ((percentage/10)%10);
		
		System.out.println("gpa is:-"+gpa);
		
		System.out.print("grade is:-");
		
		switch(gpa) {
		
		case 9 :{
			System.out.println("distinction");
			break;
		}
		
		case 8:{
			System.out.println("excellent");
			break;
			
		}
		
		case 7:{
			System.out.println("very good");
			break;
		}
		case 6:{
			System.out.println(" good");
			break;
		}
		case 5:{
			System.out.println("Average");
			break;
		}
		case 4:{
			System.out.println("improve well");
			break;
		}
		default:{
			System.out.println("fail");
			break;
		}
		
		}
		
		
		
	}
}
