package main.java.com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
Calculates first date and last date of next week.
 */

public class CalculateFirstLastDateOfWeek {
    public String calculateFirstDateOfWeek() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add( Calendar.DATE, 1 );
        while( calendar.get( Calendar.DAY_OF_WEEK ) != Calendar.MONDAY )
            calendar.add( Calendar.DATE, 1 );
        return "Mon " + simpleDateFormat.format(calendar.getTime());
    }

    public String calculateLastDateOfWeek() {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add( Calendar.DATE, 1 );
        while( calendar.get( Calendar.DAY_OF_WEEK ) != Calendar.SUNDAY )
            calendar.add( Calendar.DATE, 1 );
        return "Sun " + simpleDateFormat.format(calendar.getTime());
    }
}
