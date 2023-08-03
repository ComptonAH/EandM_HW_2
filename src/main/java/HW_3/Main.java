package HW_3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.next();
        for (char value :
                name.toCharArray()) {
            if (Character.isDigit(value)) throw MyExceptions.digitInFIO();
        }


        System.out.print("Enter the surname: ");
        String surname = scanner.next();
        for (char value :
                surname.toCharArray()) {
            if (Character.isDigit(value)) throw MyExceptions.digitInFIO();
        }

        System.out.print("Enter the patronymic: ");
        String patronymic = scanner.next();
        for (char value :
                patronymic.toCharArray()) {
            if (Character.isDigit(value)) throw MyExceptions.digitInFIO();
        }

        String FIO = name + " " + surname + " " + patronymic;

        System.out.print("Enter the day of birth: ");
        String day = scanner.next();
        day = String.valueOf(Integer.parseInt(day));
        if (Integer.parseInt(day) < 1 || Integer.parseInt(day) > 31) throw MyExceptions.outOfDay();

        System.out.print("Enter the month of birth: ");
        String month = scanner.next();
        month = String.valueOf(Integer.parseInt(month));
        if (Integer.parseInt(month) < 1 || Integer.parseInt(month) > 12) throw MyExceptions.outOfMonth();

        System.out.print("Enter the year of birth: ");
        String year = scanner.next();
        year = String.valueOf(Integer.parseInt(year));
        if (Integer.parseInt(year) < 1 || Integer.parseInt(year) > 2023) throw MyExceptions.outOfYear();

        String date_of_birth = String.valueOf(day + "." + month + "." + year);

        System.out.println("Enter your phone number (start with '8'): ");
        String phone_number = scanner.next();
        if (phone_number.length() != 11) throw MyExceptions.nonExistNumber();

        System.out.println("Enter your sex ('f' or 'm'): ");
        String sex = scanner.next();
        if (!sex.equals("f") && !sex.equals("m")) throw MyExceptions.wrongDataSex();

        String full_data = FIO + " " + date_of_birth + " " + phone_number + " "  + sex;
        try{
            File file = new File("D:\\PythonGB\\JAVA\\Exceptions and mistakes\\exceptions_and_mistakes\\src\\main\\java\\HW_3\\kar.txt");
            Path path = Path.of("D:\\PythonGB\\JAVA\\Exceptions and mistakes\\exceptions_and_mistakes\\src\\main\\java\\HW_3\\kar.txt");
            if (Files.exists(path)) {
                FileWriter fileWriter = new FileWriter(file,true);
                fileWriter.write("\n");
                fileWriter.write(full_data);
                fileWriter.flush();
                fileWriter.close();
            } else {
                Files.write(path, full_data.getBytes());
            }
        }  catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }


    }
}

