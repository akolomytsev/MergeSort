import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpianmSam {
    public static void main(String[] args) throws IOException {
        int[] xz1 = Files.lines(Paths.get("D:\\Java\\Проекты\\MergeSort\\src\\main\\resources\\Test1")).mapToInt(Integer :: parseInt).toArray();

        int[] xz2 = Files.lines(Paths.get("D:\\Java\\Проекты\\MergeSort\\src\\main\\resources\\Test2")).mapToInt(Integer :: parseInt).toArray();

        int[] xz3 = nextMerge(xz1,xz2);
        for (int j : xz3){
            System.out.print(j + " ");
        }
    }

    public static int[] nextMerge(int[] xz1, int[] xz2){
        int[] xz3 = new int[xz1.length + xz2.length];
        int poz1 = 0, poz2 = 0;

        for (int i = 0; i < xz3.length; i++) {
            if(poz1 == xz1.length){
                xz3[i] = xz2[i - poz1];
                poz2++;
            } else if (poz2 == xz2.length) {
                xz3[i] = xz1[i - poz2];
                poz1++;
            } else if (xz1[i - poz2] < xz2[i - poz1]) {
                xz3[i] = xz1[i - poz2];
                poz1++;
            } else {
                xz3[i] = xz2[i - poz1];
                poz2++;
            }
        }



        return xz3;



    }
}
