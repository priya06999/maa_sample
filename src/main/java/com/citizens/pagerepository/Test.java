package com.citizens.pagerepository;

import io.cucumber.java.ca.Cal;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

        String str="06/09/2022 21:50:02 +00:00";
        String[] date=str.split(" ");
        System.out.println(date[0]);

        SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy");
        Calendar cal= Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR,0);
        Date currenTDate=cal.getTime();

        String todayDate=sdf.format(currenTDate);
        System.out.println(todayDate);

       /* DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));*/
    }
}
