package structures;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public abstract class BasedOnArrayDataStorage implements DataStorage{
    protected int[] array;

    protected int size;

    public BasedOnArrayDataStorage(int size){
        if(size>0){
            array = new int[size];
        }else
            array = new int[5];
    }

    public BasedOnArrayDataStorage() {
        this(5);
    }

    @Override
    public final void add(int value) {
        if(size==array.length) grow(array.length==0?5:array.length*2);
        array[size++] = value;
    }

    @Override
    public abstract int get();

    @Override
    public final int size() {
        return size;
    }

    private void grow(int newSize){
        int[] newArray = new int[newSize];
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }
}
