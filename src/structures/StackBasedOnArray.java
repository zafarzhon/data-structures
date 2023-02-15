package structures;

import javax.naming.SizeLimitExceededException;

/**
 * @author Odilov_Zafarjon
 * @link https://t.me/zafarzhon_odilov
 */
public class StackBasedOnArray implements DataStorage{
    private int[] array;

    private int size;

    public StackBasedOnArray(int size){
        if(size>0){
            array = new int[size];
        }else
            array = new int[5];
    }

    public StackBasedOnArray() {
        this(5);
    }

    @Override
    public void add(int value) {
        if(size==array.length) grow(array.length==0?5:array.length*2);
        array[size++] = value;
    }

    @Override
    public int get() {
        if(size>0){
            return array[--size];
        }else{
            throw new ArrayStoreException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    private void grow(int newSize){
        int[] newArray = new int[newSize];
        System.arraycopy(array,0,newArray,0,array.length);
        array = newArray;
    }

}
