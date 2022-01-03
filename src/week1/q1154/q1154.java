package week1.q1154;

import java.util.Scanner;

public class q1154 {


    public static int dayOfYear(String date) {
        String[] str = date.split("-", 3);
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);


        if (month == 1 && day == 1) {
            return 1;
        } else {//其他情况
            if (day != 1) {
                day--;
            } else {//月-1
                month = month - 1;
                if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
                    day = 31;
                } else if (month == 2) {
                    int second = 28;
                    if (year % 4 == 0) {
                        second = 29;
                    }
                    day = second;
                } else if ((month < 8 && month % 2 == 0) || (month >= 8 && month % 2 == 1)) {
                    day = 30;
                }
            }

            String data_ = String.format("%04d", year) + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
            return dayOfYear(data_) + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        System.out.println(dayOfYear(date));
    }
}
