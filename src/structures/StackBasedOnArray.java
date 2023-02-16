package structures;

import javax.naming.SizeLimitExceededException;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public final class StackBasedOnArray extends BasedOnArrayDataStorage {

    public StackBasedOnArray(int size) {
        super(size);
    }

    public StackBasedOnArray() {
        this(5);
    }

    @Override
    public int get() {
        if (size > 0) {
            return array[--size];
        } else {
            throw new ArrayStoreException();
        }
    }
}
