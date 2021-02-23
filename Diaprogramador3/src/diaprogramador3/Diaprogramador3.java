/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diaprogramador3;

import java.util.Scanner;

/**
 *
 * @author davidmacola
 */
public class Diaprogramador3 {

    /**
     * @param args the command line arguments
     */
   private static Scanner keyboard=new Scanner(System.in);
    
 public static void main(String[] args) {
        int day,month=9, year;
        String stringday;
        System.out.println("Year?");
        year=keyboard.nextInt();
        if(year%4==0&&(year%100!=0||year%400==0)){
            day=12;
        }else{
            day=13;
        }
        stringday=stDay(day,month,year);
        System.out.println(stringday+" "+day+" September "+year);
    }

    private static String stDay(int day, int month, int year) {
        String[] ArrayWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int a,y,m,d;
        a=(14-month)/12;
        y=year-a;
        m=month+12*a-2;
        d=(day+y+y/4-y/100+y/400+(31*m)/12)%7;
        return ArrayWeek[d];
    }
    
}
