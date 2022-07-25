package ss9_advanced.thuc_hanh.bai_1;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];

    }

    private void ensureCapa() {
        int newsize = element.length * 2;
        element = Arrays.copyOf(element, newsize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }
    public E get(int i) {
        if (i > size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size " + i );
        }
        return (E) element[i];
    }

    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

    }
}



