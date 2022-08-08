import java.util.Arrays;

public class SimpleQueue<T> {

    private int maxSize;

    private T[] queueArray;
    private int front;
    private int tail;
    private int nItem;

    public SimpleQueue() {
        this.maxSize = maxSize;
        this.queueArray = ((T[])new Object[maxSize]);
        this.front = 0;
        this.tail = -1;
        this.nItem = 0;
    }

    public T add(T element) {
        queueArray = Arrays.copyOf(queueArray, queueArray.length + 1);

        queueArray[++tail] = element;
        nItem++;
        return element;
    }

    public void remove() {
        if (queueArray.length == 0) {
            return;
        } else {
            ++front;
            T[] arr = ((T[])new Object[queueArray.length - 1]);
            System.arraycopy(queueArray, front, arr, 0, queueArray.length - 1);
            queueArray = arr;


        }
    }
}