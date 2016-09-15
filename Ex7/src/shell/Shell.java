package shell;

/**
 * Created by User on 13.09.2016.
 */
public class Shell {

    public float[] sort(float[] array){

        for(int i = 0; i < array.length-1; i++){
            if(array[i] > array[i+1]){
                float temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                if(i > 0)
                    i-=2;
            }
        }
        return array;
    }
}

