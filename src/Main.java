import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> massiv = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <= 50; i++) {
            massiv.add(r.nextInt(100));
        }
        for (int a : massiv){
            System.out.print(a + ", ");
        }
        System.out.println();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int b: massiv) {
            if (b % 2 == 0){
                System.out.print(b + ", "); // Жуп сандар
            }
        }
        System.out.println();
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int с: massiv) {
            if (с % 2 == 1){
                System.out.print(с + ", "); // Так сандар
            }
        }

    }
}