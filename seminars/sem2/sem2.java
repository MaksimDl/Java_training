public class sem2 {
    public static void main(String[] args) {
        String a = "Hello";
        long begin =  System.currentTimeMillis();
        for (int i =0; i < 30000; i++){
            a += Character.getName(i);
        }
        long end =  System.currentTimeMillis();
        System.out.println(end - begin);

        StringBuilder builder = new StringBuilder("World");
        begin =  System.currentTimeMillis();
        for(int i = 0; i < 30000; i++){
            builder.append(Character.getName(i));
        }
        end =  System.currentTimeMillis();
        System.out.println(end - begin);

        //builder.delete(0, builder.length()/2); // отрезать половину
        // builder.insert(2, .43f); - вставить на 2-ю позицию .43f(0.43 флоат) остальное сдвинуть
        //builder.deleteCharAt(3);  // удалить символ 3
        // builder.reverse(); - перевернуть
        // a += builder.toString();  - convert to string


       }

}