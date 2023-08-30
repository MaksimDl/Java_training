// Разработайте программу, которая выбросит Exception, когда пользователь 
// вводит пустую строку. Пользователю должно показаться сообщение, что 
// пустые строки вводить нельзя.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        while(true){
             String st = inputSomeString();
            System.out.println("input string is: " + st);
        }
    }

    public static String inputSomeString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input some string:");
        System.out.print("> ");
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                return input;

            } catch (Exception e) {
                System.out.println("Cannot be empty:");
                System.out.print("> ");
            }
        }
        
    }
    
}