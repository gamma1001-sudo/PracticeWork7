import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Задание 1

        System.out.println("Разработчик: Илья");

        Date taskDate = new Date();

        System.out.println(
                "Дата получения задания: "
                        + taskDate
        );

        System.out.println(
                "Дата сдачи задания: "
                        + new Date()
        );


        // Задание 2

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "\nВведите дату в миллисекундах:"
        );

        long userTime = scanner.nextLong();

        Date userDate = new Date(userTime);

        Date currentDate = new Date();

        System.out.println(
                "Введенная дата: "
                        + userDate
        );

        System.out.println(
                "Текущая дата: "
                        + currentDate
        );

        if (userDate.before(currentDate)) {

            System.out.println(
                    "Введенная дата раньше текущей"
            );

        } else if (userDate.after(currentDate)) {

            System.out.println(
                    "Введенная дата позже текущей"
            );

        } else {

            System.out.println(
                    "Даты совпадают"
            );
        }

        scanner.close();
    }
}