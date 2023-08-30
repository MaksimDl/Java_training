// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к 
// падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
   
package exceptions_homework;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        while(true){
             Float num = inputFloatNumber();
            System.out.println("input number is: " + num);
        }
    }

    public static Float inputFloatNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input float num (format is: *.*):");
        System.out.print("> ");
        while (true) {
            try {
                return Float.parseFloat(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("incorrect input, try again:");
                System.out.print("> ");
            }
        }
        
    }
    
}