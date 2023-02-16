package structures;

import javax.naming.SizeLimitExceededException;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public class StackBasedOnArray extends BasedOnArrayDataStorage{
    private int[] array;

    private int size;

    public StackBasedOnArray(int size){
        super(size);
    }

    public StackBasedOnArray() {
        this(5);
    }

    @Override
    public int get() {
        if(size>0){
            return array[--size];
        }else{
            throw new ArrayStoreException();
        }
    }
}
