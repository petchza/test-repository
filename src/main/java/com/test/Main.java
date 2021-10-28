package com.test;

import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) throws ParseException {
	        Scanner in = new Scanner(System.in);
	        DateFormat formatT = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
	        
	        System.out.print("TimeIn(yyyy-MM-dd-HH-mm) : ");
	        String fromin = in.nextLine();
	        Date din = formatT.parse(fromin);
	        
	        System.out.print("TimeOut(yyyy-MM-dd-HH-mm) : ");
	        String fromout = in.nextLine();
	        Date dout = formatT.parse(fromout);

	        System.out.println("You will have to pay : " + kidTang(din, dout) + " Baht");
	    }

	    public static double kidTang(Date datein, Date dateout){
	        double sum = 0;
	        System.out.println("date in : "+datein.getTime());
	        System.out.println("date out : "+dateout.getTime());
	        
	        System.out.println("date curren: "+ new Date().getHours());
	        System.out.println("date curren: "+ new Date().getMinutes());
	        
	        double milliTime = dateout.getTime() - datein.getTime();
	        System.out.println("milliTime : "+milliTime);
//	        NumberFormat nf = NumberFormat.getNumberInstance();
//	        nf.setMaximumFractionDigits(0);
//	        nf.setRoundingMode(RoundingMode.HALF_UP);
//	        int hour = Integer.parseInt(nf.format(milliTime/(1000*60*60)));
//
//	        sum = sum + (hour/24)*500;
//	        hour = hour%24;
//
//	        if(hour <= 3) sum = sum + hour*20;
//	        else sum = sum + 3*20 + (hour-3)*10;
//
	        return sum;
	    }
}

