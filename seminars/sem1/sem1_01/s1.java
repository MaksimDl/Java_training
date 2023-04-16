import java.util.Scanner;

public class s1{
    
    private static void print(String s){  // change system.out.println() to print
        System.out.println(s);
    }

    public static class S1{
        public static void main(String[] args){
            int i;
            long l;
            float f;
            double d;
            String s;

            int[] ints = new int[]{1,2,3,4,5};
            i = ints.length;
            
            int[] temp = new int[ints.length + 1];
            for(int j=0; j < ints.length; j++){
                temp[j] = ints[j];
            }
            ints = temp;

            if (2!=3){
                System.out.println("hello world");
                }
                

            // увеличение элементво массива

        
        }
    }
}