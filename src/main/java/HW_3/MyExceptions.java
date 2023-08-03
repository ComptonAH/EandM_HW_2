package HW_3;

import java.util.InputMismatchException;

public class MyExceptions extends Exception{
    public static Throwable digitInFIO(){
        return new InputMismatchException("You've written a digit in this field");
    }
    public static Throwable outOfDay(){
        return new RuntimeException("You've written non-existing day");
    }
    public static Throwable outOfMonth(){
        return new RuntimeException("You've written non-existing month");
    }
    public static Throwable outOfYear(){
        return new RuntimeException("You've written non-existing year");
    }
    public static Throwable nonExistNumber(){
        return new RuntimeException("You've written non-existing phone number");
    }
    public static Throwable wrongDataSex(){
        return new RuntimeException("You've miswrite in the field 'Sex'. Please just type the first letter of your sex");
    }
}
