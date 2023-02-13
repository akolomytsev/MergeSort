package ru.rolomytsev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
// сортировка слиянием двух массивов чисел из текстового файла, предварительно отсортированных по увеличению

public class Main {
    public static void main(String[] args) throws IOException {
        int[] intsA = Files.lines(Path.of("src/main/resources/Test1"))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intsA);
        int[] intsB = Files.lines(Path.of("src/main/resources/Test2"))
                .mapToInt(Integer::parseInt).toArray();
        Arrays.sort(intsB);

        int[] result = MergeCheck.mergeArray(intsA, intsB);
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}

