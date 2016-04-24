package com.woo.wrhorse.common;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by User on 2016/4/18.
 */
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println(new Date());
//        System.out.println(new Date().toString());
//        GregorianCalendar now = new GregorianCalendar();
//        System.out.println(now.get(Calendar.DAY_OF_WEEK));
//        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
//        NumberFormat percentFormatter = NumberFormat.getPercentInstance();
//        double x = 0.1011;
//        System.out.println(currencyFormatter.format(x));
//        System.out.println(percentFormatter.format(x));

        int a = 1;
        System.out.println("aaa");
        assert a < 0: a ;
        System.out.println("bbb");
        Logger.getGlobal().info("llll");
        Logger.getGlobal().setLevel(Level.OFF);
        Logger.getGlobal().info("sasas");
        Logger.getGlobal().setLevel(Level.INFO);
        Logger.getGlobal().info("dsdsfsdf");
    }
}
