package Exceptions;

import java.util.Date;

public class Formatter {
    public static void main(String[] args) {
        Date today=new Date();
        String.format("%tA,%<tB,%<tD",today);
        System.out.println(today);
    }
}
