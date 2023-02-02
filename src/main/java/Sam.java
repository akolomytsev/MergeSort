import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Sam {
    public static void main(String[] args) throws IOException {
        int[] z1 = Files.lines(Paths.get("src/main/resources/Test1")).mapToInt(Integer ::parseInt).toArray();
        Arrays.sort(z1);
        for (int j : z1){
            System.out.print(j + " ");
        }
        System.out.println();
        int[] z2 = Files.lines(Paths.get("src/main/resources/Test2")).mapToInt(Integer :: parseInt).toArray();
        Arrays.sort(z2);
        for (int j : z2){
            System.out.print(j + " ");
        }
        System.out.println();

        int[] z3 = merge2(z1,z2);
        for (int j : z3){
            System.out.print(j + " ");
        }
    }

    public static int[] merge2(int[] z1, int[] z2){
        int[] z3 = new int[z1.length + z2.length];
        int poz1 = 0, poz2 = 0;

        for (int i = 0; i < z3.length; i++) {
            if (poz1 == z1.length){
                z3[i] = z2[i-poz1];
            } else if (poz2 == z2.length){
                z3[i] = z1[i - poz2];
            } else  if(z1[i - poz2] < z2[i - poz1]){
                z3[i] = z1[i-poz2];
                poz1++;
            } else{
                z3[i] = z2[i-poz1];
                poz2++;
            }


        }

        return z3;
    }
}
