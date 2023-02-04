import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Attempt3 {
    public static void main(String[] args) throws IOException {
        int[] a1 = Files.lines(Paths.get("D:\\Java\\Проекты\\MergeSort\\src\\main\\resources\\Test1")).mapToInt(Integer :: parseInt).toArray();
        int[] a2 = Files.lines(Paths.get("D:\\Java\\Проекты\\MergeSort\\src\\main\\resources\\Test2")).mapToInt(Integer :: parseInt).toArray();
        int[] a3 = merge3(a1, a2);
        for (int j : a3){
            System.out.print(j + " ");
        }

    }

    public static int[] merge3(int[] a1, int[] a2){
        int[] a3 = new int[a1.length + a2.length];
        int poz1 = 0, poz2 =0;

        for (int i = 0; i < a3.length; i++) {
            if (poz1 == a1.length){
                a3[i] = a2[i - poz1];
                poz2++;
            } else if (poz2 == a2.length) {
                a3[i] = a1[i - poz2];
                poz1++;
            } else if (a1[i - poz1] < a2[i - poz2]) {
                a3[i] = a1[i - poz1];
                poz1++;
            } else {
                a3[i] = a2[i - poz2];
                poz2++;
            }
        }

        return a3;
    }
}
