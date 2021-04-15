import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E elements[];

    public MyList(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = (E[]) new Object[capacity];
    }


    public void add(int index, E element){
        E[] newArray = Arrays.copyOf(elements, elements.length+1);
        for (int i = index; i < elements.length; i++) {
            newArray[i + 1] = newArray[i];
        }
        newArray[index] = element;
        elements = newArray;
        size++;
    }

    public boolean add (E e){
        E[] newArray = Arrays.copyOf(elements, elements.length+1);
        newArray[elements.length] = e;
        elements = newArray;
        size++;
        return true;
    }


    public E remove(int index){
        E holder = elements[index];
        E[] newArray = (E[]) new Object[elements.length - 1];
        for (int i = 0; i < index; i++){
            newArray[i] = elements[i];
        }
        for (int i = index+1; i < elements.length; i++){
            newArray[i-1] = elements[i];
        }
        elements = newArray;
        size--;
        return holder;
    }

    public int size(){
        return size;
    }

    @Override
    public E[] clone(){
        E[] newArray = Arrays.copyOf(elements, elements.length);
        return newArray;
    }

    public boolean contains(E o){
        for (int i = 0; i < elements.length; i++){
            if (o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        for (int i = 0; i < elements.length; i++){
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public void ensureCapacity(int minCapacity){
        if (size >= elements.length){
            E[] newArray = (E[]) new Object[minCapacity];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    public E get(int i){
        return elements[i];
    }

    public void clear(){
        elements = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    public void print(){
        for (int i = 0; i < elements.length; i++){
            System.out.print(elements[i]+", ");
        }
        System.out.println();
    }
}
