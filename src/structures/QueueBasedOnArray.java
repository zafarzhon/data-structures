package structures;

import java.util.Arrays;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class QueueBasedOnArray extends BasedOnArrayDataStorage {

    public QueueBasedOnArray(int size) {
        super(size);
    }

    public QueueBasedOnArray() {
        this(5);
    }

    @Override
    public int get() {
        if (size > 0) {
            int res = array[0];
            System.arraycopy(array, 1, array, 0, array.length - 1);
            size--;
            return res;
        } else {
            throw new ArrayStoreException();
        }
    }


}
