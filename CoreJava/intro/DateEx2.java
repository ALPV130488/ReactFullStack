package intro;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class DateEx2 {
	
	public static void main(String[] args) {
		
//		LocalDate date = LocalDate.now();
//		
//		System.out.println(date);
//		
//		System.out.println(date.getDayOfYear());
//		
//		System.out.println(date.isLeapYear());
//		
//		LocalTime time = LocalTime.now();
//		
//		System.out.println(time);
		
//AgeCalculator:-
//		
//		LocalDate birthdate = LocalDate.of(2001,8,01);
//		
//		LocalDate currentdate = LocalDate.now();
//		
//		Period p = Period.between(birthdate, currentdate);
//		
//		System.out.printf("Your age is :- %d years ,%d months ,%d days",p.getYears(),p.getMonths(),p.getDays());

//ZonalDate&Time checking:-
		
		ZoneId zone = ZoneId.of("America/Chicago");
		
		Set set = zone.getAvailableZoneIds();
			
//		for(Object obj :set) {
//			System.out.println(obj);
//		}
		
		ZonedDateTime zt = ZonedDateTime.now(zone);
		
		System.out.println(zt);
		
		
		
		
		
	}

}
