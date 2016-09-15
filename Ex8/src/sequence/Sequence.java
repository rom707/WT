package sequence;

/**
 * Created by User on 14.09.2016.
 */
public class Sequence {

    /**
     * @param arrayA
     * @param arrayB
     * @return
     */
    public int[] getMergingIndexes(int[] arrayA, int[] arrayB){
        int[] mergingIndexes = new int[arrayB.length];
        int j = 0;

        for (int i = 0; i < arrayA.length; i++) {
            while (j < arrayB.length && arrayB[j] <= arrayA[i]) {
                mergingIndexes[j] = i;
                j++;
            }
            i++;
        }
        if(j != arrayB.length-1){
            for (; j<arrayB.length; j++){
                mergingIndexes[j] = arrayA.length-1;
            }
        }
        return mergingIndexes;
    }

    public int[] mergeIncreaseSequences(int[] arrayA, int[] arrayB){
        int j = 0;
        int i = 0;
        int[] mergedSequences = new int[arrayA.length+arrayB.length];

        for (; i < arrayA.length; i++) {
            while (j < arrayB.length && arrayB[j] <= arrayA[i]) {
                mergedSequences[j] = i;
                j++;
            }
            i++;
        }
        if(j != arrayB.length-1){
            for (; j<arrayB.length; j++){
                mergedSequences[j] = arrayB[j];
            }
        }
        else{
            if(i != arrayB.length-1){
                for (; j<arrayB.length; j++){
                    mergedSequences[j] = arrayB[j];
                }
            }
        }
        return mergedSequences;

    }
}
