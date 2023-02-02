import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
// сортировка слиянием двух массивов чисел из текстового файла, предварительно отсортированных по увеличению

public class Main {
    public static void main(String[] args) throws IOException {
        int[] intsA = Files.lines(Paths.get("D:\\Java\\Проекты\\MergeSort\\src\\main\\resources\\Test1"))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intsA);
        int[] intsB = Files.lines(Paths.get("D:\\Java\\Проекты\\MergeSort\\src\\main\\resources\\Test2"))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intsB);

        int[] rezult = Merge.mergeArray(intsA, intsB);
        for (int j : rezult) {
            System.out.print(j + " ");
        }


        }

    }

