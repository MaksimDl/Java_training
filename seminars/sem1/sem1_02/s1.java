import java.util.Arrays;
import java.util.Random;

public class s1 {
    public static void main(String[] args) {
        //случайное число.
        //Это число в консоль
        
        //развернуть его наоборот
        

        int i;    
        String[] i_string;
        Random random = new Random();
        i = random.nextInt(10000);
        
        System.out.println(i);
        i_string = String.valueOf(i).split("");
        System.out.println(Arrays.toString(i_string));
        for(int j = i_string.length-1;  j >=0; j --){
            System.out.print(i_string[j]);
        }

        //Сделать строку Иванов Иван Иванович
        //Вывести одним принтом. Фамилия промел Большая буква Имени. Большая буква отчества.
        System.out.println();
        String fio = "Иванов петр григорьевич";
        String result;
        String[] fio_array = fio.split(" ");
        System.out.println(Arrays.toString(fio_array));
        result = fio.split(" ")[0] + ' ' + fio.split(" ")[1].toUpperCase().charAt(0)+'.'+ fio.split(" ")[2].toUpperCase().charAt(0)+'.';
        System.out.println(result);
    
}
}