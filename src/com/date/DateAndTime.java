package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateAndTime {
	public static void main(String[] args) {
		System.out.println();
	        System.out.println(" get current date");
	        System.out.println();
		//get current date
		 Date d = new Date();
		 System.out.println("crurrent date: "+d.toString());
		 Calendar now = Calendar.getInstance();
		    System.out.println();
		    System.out.println("Current full date and time is : " + (now.get(Calendar.MONTH) + 1) + "-"
		        + now.get(Calendar.DATE) + "-" + now.get(Calendar.YEAR) + " "
		        + now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":"
		        + now.get(Calendar.SECOND) + "." + now.get(Calendar.MILLISECOND));
			System.out.println();
			 System.out.println();
			 
			// get the current timestamp.
			 Instant timestamp = Instant.now(); 
			 System.out.println("\nCurrent Timestamp: " + timestamp+"\n"); 
		 
		  System.out.println("=====================================");
	        System.out.println(" Write a Java program to create a Date object using the Calendar class.");
	        System.out.println();
		// Write a Java program to create a Date object using the Calendar class.
		 int year = 2016;
	     int month = 0; // January
	     int date = 1;

	     Calendar cal = Calendar.getInstance();
	     // Sets the given calendar field value and the time value
	     // (millisecond offset from the Epoch) of this Calendar undefined.
	     cal.clear();
	     System.out.println();
	     cal.set(Calendar.YEAR, year);
	     cal.set(Calendar.MONTH, month);
	     cal.set(Calendar.DATE, date);

	     System.out.println(cal.getTime());
	     System.out.println();
	     
	     System.out.println("=====================================");
	        System.out.println(" Write a Java program to get current day, month and year from Date object.");
	        System.out.println();
	  // Write a Java program to get current day, month and year from Date object.
	     // Create a Date object
	        Date currentDate = new Date();

	        // Create a Calendar instance and set it to the current date
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(currentDate);

	        // Extract day, month, and year
	        int currentday = calendar.get(Calendar.DAY_OF_MONTH);
	        int currentmonth = calendar.get(Calendar.MONTH) + 1; // Month is zero-based, so add 1
	        int currentyear = calendar.get(Calendar.YEAR);

	        // Display the components
	        System.out.println("get from Calendar   Day: " + currentday+"   Month: " + currentmonth+"  Year: " + currentyear);
	       
	        
	        //==============================================================================================
	     
	        // Create a Date object
	        Date currentDate1 = new Date();

	        // Convert Date to LocalDate
	        LocalDate localDate = currentDate1.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

	        // Extract day, month, and year
	        int day = localDate.getDayOfMonth();
	        int month1 = localDate.getMonthValue();
	        int year1 = localDate.getYear();
	        

	        // Display the components
	        System.out.println("get from LocalDate   Day: " + day+" Month: " + month1+" Year: " + year1);
	        
	        
	        
	        
	        System.out.println("=====================================");
	        System.out.println("get dayname from date");
	        System.out.println();
	        /////get dayname from date
	        // Create a SimpleDateFormat object with the day name pattern
	        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
	        //we can also use  to specify a particular locale
	        //SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);

	        // Format the date to get the day name
	        String dayName = dateFormat.format(currentDate);

	        // Display the day name
	        System.out.println("Day Name: " + dayName);
	        
	        
	        
	        
	        System.out.println("=====================================");
	        System.out.println("get AM OR PM FROM DATE");
	        System.out.println();
	     ////get AM OR PM FROM DATE
	        
	     // Create a SimpleDateFormat object with AM/PM format
	        SimpleDateFormat dateFormat1 = new SimpleDateFormat("a");

	        // Format the date to get AM/PM
	        String amPm = dateFormat1.format(currentDate);

	        // Display AM/PM
	        System.out.println("Current AM/PM: " + amPm);
	        
	     // Get current time using LocalTime
	        LocalTime currentTime = LocalTime.now();

	        // Get AM/PM designation
	        String amPm1 = currentTime.getHour() < 12 ? "AM" : "PM";

	        // Display AM/PM
	        System.out.println("Current AM/PM: " + amPm1);
	     
	        System.out.println("=====================================");
	        System.out.println("get time from DATE");
	        System.out.println();
	        //////get time from DATE
	        
	        // Create a SimpleDateFormat object with the hour, minute, and second patterns
	        SimpleDateFormat dateFormat11 = new SimpleDateFormat("HH:mm:ss");

	        // Format the date to get hour, minute, and second
	        String time = dateFormat11.format(currentDate);

	        // Display hour, minute, and second
	        System.out.println("Time: " + time);
	        
	        
	        ////==========================================
	        
	        LocalTime currentTime1 = LocalTime.now();

	        // Get hour, minute, and second
	        int hour = currentTime1.getHour();
	        int minute = currentTime1.getMinute();
	        int second = currentTime1.getSecond();

	        // Display hour, minute, and second
	        System.out.println("Hour: " + hour);
	        System.out.println("Minute: " + minute);
	        System.out.println("Second: " + second);
	        
	        
	        //////////////////////////////////////////////////////////////////
	        System.out.println("=====================================");
	        System.out.println("Dates in different format");
	        System.out.println();
	        //Dates in different format
	        // Create a Date object
	        Date currentDate11 = new Date();

	        // Example 1: Full date and time
	        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
	        System.out.println("Format 1: " + format1.format(currentDate11));

	        // Example 2: Short date
	        SimpleDateFormat format2 = new SimpleDateFormat("MM/dd/yyyy");
	        System.out.println("Format 2: " + format2.format(currentDate11));

	        // Example 3: Day of the week
	        SimpleDateFormat format3 = new SimpleDateFormat("EEEE");
	        System.out.println("Format 3: " + format3.format(currentDate11));
	        //=======================================================================
	        
	        // Get current date and time using LocalDateTime
	        LocalDateTime currentDateTime = LocalDateTime.now();

	        // Example 1: Full date and time
	        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");
	        System.out.println("Format 1: " + currentDateTime.format(formatter1));
	       // System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
	        //System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
//	        DateTimeFormatter formatterZonedDateTime =
//	                DateTimeFormatter.ofPattern("E MMM yyyy HH:mm:ss.SSSZ");
//	      
//	        DateTimeFormatter formatterOffsetTime =
//	                DateTimeFormatter.ofPattern("HH:mm:ss,Z");
	      //Parse examples
//			LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
//					DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
//			System.out.println("Default format after parsing = "+dt+"\n");
	        

	        // Example 2: Short date
	        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        System.out.println("Format 2: " + currentDateTime.format(formatter2));

	        // Example 3: Day of the week
	        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE");
	        System.out.println("Format 3: " + currentDateTime.format(formatter3));
	     
	        System.out.println("=====================================");
	        System.out.println("get another country time zone");
	        System.out.println();
	        ///get another country time zone
	        
	     // Specify the time zone of the desired country
	        String targetTimeZone = "Asia/Kolkata"; // Example: New York time zone

	        // Get the current time in the specified time zone
	        ZonedDateTime currentTimeInTargetZone = ZonedDateTime.now(ZoneId.of(targetTimeZone));

	        // Format the time
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a z");
	        String formattedTime = currentTimeInTargetZone.format(formatter);

	        // Display the time in the specified time zone
	        System.out.println("Current time in " + targetTimeZone + ": " + formattedTime);
	        
	        //using Calendar get time zone of another country
	        Calendar calNewYork = Calendar.getInstance();
	        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	   	    System.out.println(); 
	         System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
	           + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
	   		   System.out.println(); 
	        
	        
	        
	        
	        
	        
	     // Get and display information of current date from the calendar:
	        // Create a default calendar
	        System.out.println("=====================================");
	        System.out.println("Get and display information of current date from the calendar");
	        Calendar cal1 = Calendar.getInstance();
	       // Get and display information of current date from the calendar:
		    System.out.println();
	        System.out.println("Year: " + cal1.get(Calendar.YEAR));
	        System.out.println("Month: " + cal1.get(Calendar.MONTH));
	        System.out.println("Day: " + cal1.get(Calendar.DATE));
	        System.out.println("Hour: " + cal1.get(Calendar.HOUR));
	        System.out.println("Minute: " + cal1.get(Calendar.MINUTE));
		    System.out.println();
		    
		    //Write a Java program to get the maximum value of the year, month, week, and date from the current date of a default calendar.
		    System.out.println("=====================================");
	        System.out.println("Write a Java program to get the maximum value of the year, month, week, and date from the current date of a default calendar.");
	        System.out.println();
	        
	        System.out.println("\nCurrent Date and Time:" + cal.getTime());		
			int actualMaxYear = cal.getActualMaximum(Calendar.YEAR);
			int actualMaxMonth = cal.getActualMaximum(Calendar.MONTH);
			int actualMaxWeek = cal.getActualMaximum(Calendar.WEEK_OF_YEAR);
			int actualMaxDate = cal.getActualMaximum(Calendar.DATE);
			
			System.out.println("Actual Maximum Year: "+actualMaxYear);
			System.out.println("Actual Maximum Month: "+actualMaxMonth);
			System.out.println("Actual Maximum Week of Year: "+actualMaxWeek);
			System.out.println("Actual Maximum Date and last day of month: "+actualMaxDate+"\n");
			
			cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
	        System.out.println("last date of current month:"+cal.getTime());
			System.out.println();
			
			 //Write a Java program to get the minimum value of the year, month, week, and date from the current date of a default calendar.
		    System.out.println("=====================================");
	        System.out.println("Write a Java program to get the minimum value of the year, month, week, and date from the current date of a default calendar.");
	        System.out.println();
			
			System.out.println("\nCurrent Date and Time:" + cal.getTime());		
			int actualMinYear = cal.getActualMinimum(Calendar.YEAR);
			int actualMinMonth = cal.getActualMinimum(Calendar.MONTH);
			int actualMinWeek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
			int actualMinDate = cal.getActualMinimum(Calendar.DATE);
			
			System.out.println("Actual Minimum Year: "+actualMinYear);
			System.out.println("Actual Minimum Month: "+actualMinMonth);
			System.out.println("Actual Minimum Week of Year: "+actualMinWeek);
			System.out.println("Actual Minimum Date: "+actualMinDate+"\n");
			System.out.println();
			
			//calculate the first and last day of each week.
			System.out.println("=====================================");
	        System.out.println("calculate the first and last day of each week.");
	        System.out.println();
	        // Set the calendar to monday of the current week
	        cal1.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

	           System.out.println();
	        // Print dates of the current week starting on Monday
	           SimpleDateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
	          System.out.println(df.format(cal1.getTime()));
	           for (int i = 0; i <6; i++) {
	        	   cal1.add(Calendar.DATE, 1);
	              }
	           System.out.println(df.format(cal1.getTime()));
	   		System.out.println();
	   		
	   		
	   		//get the first and last day of a month.
	   		System.out.println("=====================================");
	        System.out.println("get the first and last dayname of a month.");
	        System.out.println();
	        YearMonth ym = YearMonth.of(cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH));
	   	 String firstDay = ym.atDay(1).getDayOfWeek().name();
	   	 String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
	   	 System.out.println();
	   	 System.out.println(firstDay);
	    	 System.out.println(lastDay);
	   	 System.out.println();
	   //number of days in a month.
	   		System.out.println("=====================================");
	        System.out.println("getnumber of days in a month.");
	        System.out.println();
	   	 int days = cal1.getActualMaximum(Calendar.DAY_OF_MONTH);
		   System.out.println();
	       System.out.println("Number of days of the current month : " + days); 
		   System.out.println(); 
		   
		   
		   //add and remove hours,seconds and minutes to the current time using Localtime.
		   System.out.println("=====================================");
	        System.out.println("add and remove hours,seconds and minutes to the current time.");
	        System.out.println();
	        LocalTime time1 = LocalTime.now(); 
	        // adding four hours
	        LocalTime afterhours = time1.plusHours(4);
	        LocalTime beforehours=time1.minusHours(5);
	        LocalTime afetrsecond=time1.plusSeconds(8);
	        LocalTime beforesecond=time1.minusSeconds(8);
	        LocalTime afetrminutes=time1.plusMinutes(8);
	        LocalTime beforeminutes=time1.minusMinutes(8);
	        System.out.println();
	        System.out.println("CurrentTime : " + time1);
	        System.out.println("Time after 4 hours : " + afterhours);
	        System.out.println("Time before 5 hours : " + beforehours);
	        System.out.println("Time after 8 Seconds : " + afetrsecond);
	        System.out.println("Time before 8 Seconds : " + beforesecond);
	        System.out.println("Time after 8 minutes : " + afetrminutes);
	        System.out.println("Time before 8 minutes : " + beforeminutes);
	        System.out.println();
	        
	        //=====================================================================
	        
	        //add and remove days,weeks,months and years to the current time using LocalDate.
	        System.out.println("=====================================");
	        System.out.println("add and remove days,weeks,months and years to the current time using LocalDate.");
	        System.out.println();
	        String customDateString = "2023-01-01";
	        //Parse the custom date string to LocalDate
	        DateTimeFormatter formatter11 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate customDate = LocalDate.parse(customDateString, formatter11);
	        // Calculate the date after 5 days
	        LocalDate dateAfter5Days = customDate.plusDays(5);
	        LocalDate dateBefore5Days = customDate.minusDays(5);
	        LocalDate dateAfter5Months = customDate.plusMonths(5);
	        LocalDate dateBefore5Months = customDate.minusMonths(5);
	        LocalDate dateAfter5Years = customDate.plusYears(5);
	        LocalDate dateBefore5Years = customDate.minusYears(5);
	        LocalDate dateAfter5weeeks = customDate.plusWeeks(5);
	        LocalDate dateBefore5weeks = customDate.minusWeeks(5);
		   //=========================================================================
	      //add and remove days to the current time using Calendar.
	        System.out.println("=====================================");
	        System.out.println("add and remove days to the current time using Calendar.");
	        System.out.println();
	        String customDateString12 = "2023-01-01";
	        // Parse the custom date string to Date
	        SimpleDateFormat dateFormat12 = new SimpleDateFormat("yyyy-MM-dd");
	        Date customDate12;
	        try {
	            customDate12 = dateFormat12.parse(customDateString12);
	        } catch (ParseException e) {
	            e.printStackTrace();
	            return;
	        }
	        // Create a Calendar instance and set it to the custom date
	        Calendar calendar12 = Calendar.getInstance();
	        calendar12.setTime(customDate12);
	        // Add 5 days to the custom date
	        calendar12.add(Calendar.DAY_OF_MONTH, 5);
	        // Get the result as a Date object
	        Date dateAfter5Days12 = calendar.getTime();
	        // Format and print the result
	        String result12 = dateFormat.format(dateAfter5Days12);
	        System.out.println("Date after 5 days: " + result12);
	        
	        //]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]]
	        System.out.println("=====================================");
	        System.out.println("add and remove years,weeks to the current time using Calendar.");
	        System.out.println();
	        Calendar cal11 = Calendar.getInstance();
	        Date cdate = cal11.getTime();
	        // get next year
	        cal11.add(Calendar.YEAR, 1); 
	        Date nyear = cal11.getTime();
	        //get previous year
	        cal11.add(Calendar.YEAR, -2); 
	        Date pyear = cal11.getTime();
	        System.out.println("\nCurrent Date : " + cdate);
	        System.out.println("\nDate before 1 year : " + pyear);
	        System.out.println("\nDate after 1 year  : " + nyear+"\n");  	
	        
	      //two weeks
	        int noOfDays = 14; 
	        Calendar cal111 = Calendar.getInstance();
	        Date cdate1 = cal111.getTime();
	        cal111.add(Calendar.DAY_OF_YEAR, noOfDays);
	        Date date1 = cal111.getTime();
	        System.out.println("\nCurrent Date: " + cdate1+"\n");  
	        System.out.println("Day after two weeks: " + date1+"\n");  	
	        
	        
	        
	        
		   
		   //check leap year 
	        System.out.println("=====================================");
	        System.out.println("check leap year.");
	        System.out.println();
	        int year45 = 2016;
	        System.out.println();        
	        if((year45 % 400 == 0) || ((year45 % 4 == 0) && (year45 % 100 != 0)))
	                System.out.println("Year " + year45 + " is a leap year");
	        else
	                System.out.println("Year " + year45 + " is not a leap year");
	                System.out.println();
	                
	             // get year and months between two dates
	                System.out.println("=====================================");
	    	        System.out.println("get year and months between two dates.");
	    	        System.out.println();
	           	 LocalDate today = LocalDate.now();    
	             LocalDate userday = LocalDate.of(2015, Month.MAY, 15); 
	             Period diff = Period.between(userday, today); 
	                
	           System.out.println("Difference between "+ userday +" and "+ today +": "+ diff.getYears() +" Year(s) and "+ diff.getMonths() +" Month()s\n");
	           	
	           //get the current time in all time zones.
	           System.out.println("=====================================");
   	           System.out.println("get the current time in all time zones.");
   	           System.out.println();
	           ZoneId.SHORT_IDS.keySet().
	           stream().forEach( 
	           zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
	           
	           //get the number of months left in the year.
	           System.out.println("=====================================");
   	           System.out.println("get the number of months left in the year.");
   	           System.out.println();
	           LocalDate today1 = LocalDate.now(); 
	           LocalDate lastDayOfYear = today1.with(TemporalAdjusters.lastDayOfYear());
	           Period period = today1.until(lastDayOfYear);
	           System.out.println();
	           System.out.println("Months remaining in the year: "+period.getMonths());	
	           System.out.println();
	           
	           
	           //get length of year
	         //Current year	
	           System.out.println("=====================================");
   	           System.out.println("get length of year.");
   	           System.out.println();
	      	 Year yr = Year.now();
	           //given year
	           //Year yr = Year.of(2001);
	           System.out.println("\nCurrent Year: " + yr);  
	           boolean isLeap = yr.isLeap(); // false
	           System.out.println("Is current year leap year? " + isLeap);  
	           int length = yr.length(); // 365
	           System.out.println("Length of the year: " + length+" days\n"); 
	           
	           
	           //get the information of the current/given month.
	           System.out.println("=====================================");
   	           System.out.println("get the information of the current/given month..");
   	           System.out.println();
	           LocalDate ldt = LocalDate.of(2016, Month.FEBRUARY, 10);
	           Month mn = ldt.getMonth(); // FEBRUARY
	           int mnIntValue = mn.getValue(); // 2
	           int minLength = mn.minLength(); // 28
	           int maxLength = mn.maxLength(); // 29
	           Month firstMonthOfQuarter = mn.firstMonthOfQuarter(); // JANUARY
	           System.out.println("\nInteger value of the current month: " + mnIntValue);
	           System.out.println("Length of the month: " + minLength);
	           System.out.println("Maximum length of the month: " + maxLength); 
	           System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n"); 
	           
	           // get the next and previous Fridays..
	           System.out.println("=====================================");
   	           System.out.println(" get the next and previous Fridays.");
   	           System.out.println();
	           LocalDate dt1 = LocalDate.now();    
	           System.out.println("\nNext Friday: "+dt1.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
	           System.out.println("Previous Friday: "+dt1.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
	           
	           //convert a Unix timestamp to a date.
	           System.out.println("=====================================");
   	           System.out.println(" convert a Unix timestamp to a date.");
   	           System.out.println();
	         //Unix seconds
	           long unix_seconds = 1372339860;
	           //convert seconds to milliseconds
	           Date date11 = new Date(unix_seconds*1000L); 
	           // format of the date
	           SimpleDateFormat jdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
	           jdf.setTimeZone(TimeZone.getTimeZone("GMT-4"));
	           String java_date = jdf.format(date11);
	           System.out.println("\n"+java_date+"\n");
	           
	           
	           
	           
	           //================================================================================================================
	          // difference between two dates in days.
	           
	           System.out.println("=====================================");
   	           System.out.println("difference between two dates in days before Java 8.");
   	           System.out.println();
	           
	           System.out.println("\nBefore JDK 8:");

	           Calendar cal1111 = Calendar.getInstance();
	           cal1111.set(2019, 0, 1);
	           Calendar cal2 = Calendar.getInstance();
	           cal2.set(2020, 2, 1);

	           System.out.println("\nDate/Calendar case: " + cal1111.getTime() + " <-> " + cal2.getTime());

	           long inMs = Math.abs(cal1111.getTimeInMillis() - cal2.getTimeInMillis());
	           long inDays = Math.abs(TimeUnit.DAYS.convert(inMs, TimeUnit.MILLISECONDS));

	           System.out.println("Difference in milliseconds is: " + inMs);
	           System.out.println("Difference in days is: " + inDays);

	           System.out.println("\nStarting with JDK 8:");

	           LocalDate ld1 = LocalDate.of(2019, 1, 1);
	           LocalDate ld2 = LocalDate.of(2020, 3, 1);

	           System.out.println("\nLocalDate case: " + ld1 + " <-> " + ld2);

	           long between_In_Days = Math.abs(ChronoUnit.DAYS.between(ld1, ld2));
	           long between_In_Months = Math.abs(ChronoUnit.MONTHS.between(ld1, ld2));
	           long between_In_Years = Math.abs(ChronoUnit.YEARS.between(ld1, ld2));
	           long until_In_Days = Math.abs(ld1.until(ld2, ChronoUnit.DAYS));
	           long until_In_Months = Math.abs(ld1.until(ld2, ChronoUnit.MONTHS));
	           long until_In_Years = Math.abs(ld1.until(ld2, ChronoUnit.YEARS));
	           Period period1 = ld1.until(ld2);
	           System.out.println("Difference as Period: "
	                   + period1.getYears() + "y" + period1.getMonths() + "m" + period1.getDays() + "d");
	           System.out.println("Difference in days is via between(): " + between_In_Days);
	           System.out.println("Difference in months is via between(): " + between_In_Months);
	           System.out.println("Difference in years is via between(): " + between_In_Years);
	           System.out.println("Difference in days is via until(): " + until_In_Days);
	           System.out.println("Difference in months is via until(): " + until_In_Months);
	           System.out.println("Difference in years is via until(): " + until_In_Years);

	           LocalDateTime ldt1 = LocalDateTime.of(2019, 1, 1, 22, 15, 15);
	           LocalDateTime ldt2 = LocalDateTime.of(2020, 1, 1, 23, 15, 15);

	           System.out.println("\nLocalDateTime case: " + ldt1 + " <-> " + ldt2);

	           long betweenInMinutesWithoutZone = Math.abs(ChronoUnit.MINUTES.between(ldt1, ldt2));
	           long untilInMinutesWithoutZone = Math.abs(ldt1.until(ldt2, ChronoUnit.HOURS));
	           System.out.println("Difference in minutes without zone: " + betweenInMinutesWithoutZone);
	           System.out.println("Difference in hours without zone: " + untilInMinutesWithoutZone);

	           System.out.println("\nZonedDateTime case:");

	           ZonedDateTime zdt1 = ldt1.atZone(ZoneId.of("Europe/Bucharest"));
	           ZonedDateTime zdt2 = zdt1.withZoneSameInstant(ZoneId.of("Australia/Perth")).plusHours(1);
	           ZonedDateTime zdt3 = ldt2.atZone(ZoneId.of("Australia/Perth"));

	           long betweenInMinutesWithZone12 = Math.abs(ChronoUnit.MINUTES.between(zdt1, zdt2));
	           long untilInHoursWithZone12 = Math.abs(zdt1.until(zdt2, ChronoUnit.HOURS));
	           long betweenInMinutesWithZone13 = Math.abs(ChronoUnit.MINUTES.between(zdt1, zdt3));
	           long untilInHoursWithZone13 = Math.abs(zdt1.until(zdt3, ChronoUnit.HOURS));

	           System.out.println("Europe/Bucharest: " + zdt1 + " <-> Australia/Perth: " + zdt2);
	           System.out.println("Difference in minutes with zone (same instant): " + betweenInMinutesWithZone12);
	           System.out.println("Difference in hours with zone (same instant): " + untilInHoursWithZone12);

	           System.out.println("\nEurope/Bucharest: " + zdt1 + " <-> Australia/Perth: " + zdt3);
	           System.out.println("Difference in minutes with zone (not same instant): " + betweenInMinutesWithZone13);
	           System.out.println("Difference in hours with zone: " + untilInHoursWithZone13);
	           
	           // get which date is bigger in java
	           System.out.println("=====================================");
   	           System.out.println("get which date is bigger in java.");
   	           System.out.println();
   	           
   	        String dateString = "2023-12-26T15:30:00";
   	     String dateString1 = "2024-12-26T15:30:00";

   	        // Define a DateTimeFormatter
   	        DateTimeFormatter formatter111 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

   	        // Parse the string to LocalDateTime
   	        LocalDateTime localDateTime = LocalDateTime.parse(dateString, formatter111);
   	     LocalDateTime localDateTime2 = LocalDateTime.parse(dateString1, formatter111);

   	  // Comparing dates
         if (localDateTime.isBefore(localDateTime2)) {
             System.out.println(localDateTime + " is before " + localDateTime2);
         } else if (localDateTime.isAfter(localDateTime2)) {
             System.out.println(localDateTime + " is after " + localDateTime2);
         } else {
        	 System.out.println(localDateTime + " is equal to " + localDateTime2);
         }
   	           
         
         //===================================================================================
	           LocalDate date1one = LocalDate.of(2023, 1, 1);
	           LocalDate date2 = LocalDate.of(2023, 12, 31);

	           // Comparing dates
	           if (date1one.isBefore(date2)) {
	               System.out.println(date1one + " is before " + date2);
	           } else if (date1one.isAfter(date2)) {
	               System.out.println(date1one + " is after " + date2);
	           } else {
	               System.out.println(date1one + " is equal to " + date2);
	           }
	           
		 }
		}

//
//UTC (Coordinated Universal Time)
//GMT (Greenwich Mean Time)
//Europe:
//CET (Central European Time)
//EET (Eastern European Time)
//WET (Western European Time)
//BST (British Summer Time)
//North America:
//EST (Eastern Standard Time)
//CST (Central Standard Time)
//MST (Mountain Standard Time)
//PST (Pacific Standard Time)
//AKST (Alaska Standard Time)
//HAST (Hawaii-Aleutian Standard Time)
//South America:
//ART (Argentina Time)
//BRT (Brasília Time)
//Asia:
//IST (Indian Standard Time)
//JST (Japan Standard Time)
//CST (China Standard Time)
//SGT (Singapore Time)
//Australia/Oceania:
//AEST (Australian Eastern Standard Time)
//ACST (Australian Central Standard Time)
//AWST (Australian Western Standard Time)
//NZST (New Zealand Standard Time)


//UTC (Coordinated Universal Time)
//
//UTC
//Europe:
//
//Europe/London
//Europe/Paris
//Europe/Berlin
//Europe/Rome
//Europe/Madrid
//North America:
//
//America/New_York
//America/Chicago
//America/Denver
//America/Los_Angeles
//America/Anchorage
//Pacific/Honolulu
//Asia:
//
//Asia/Tokyo
//Asia/Shanghai
//Asia/Kolkata
//Asia/Dubai
//Asia/Singapore
//Australia/Oceania:
//
//Australia/Sydney
//Australia/Melbourne
//Australia/Brisbane
//Pacific/Auckland
//South America:
//
//America/Argentina/Buenos_Aires
//America/Sao_Paulo


