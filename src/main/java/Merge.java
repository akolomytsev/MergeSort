public class Merge {
    public static int [] mergeArray(int[] intsA, int[] intsB) {

        int[] arrayC = new int[intsA.length + intsB.length]; //
        int positionA = 0, positionB = 0; //

        for (int i = 0; i < arrayC.length; i++) { //
            if (positionA == intsA.length) { //
                arrayC[i] = intsB[i - positionA]; //
                positionB++; //
            } else if (positionB == intsB.length) { //
                arrayC[i] = intsA[i - positionB]; //
                positionA++; //
            } else if (intsA[i - positionB] < intsB[i - positionA]) { //
                arrayC[i] = intsA[i - positionB]; //
                positionA++; //
            } else { //
                arrayC[i] = intsB[i - positionA]; //
                positionB++; //
            }
        }
        return arrayC;
    }
}
