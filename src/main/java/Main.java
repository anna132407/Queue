public class Main {
    public static void main(String[]args){
        SimpleQueue simpleQueue;
        simpleQueue = new SimpleQueue();
        simpleQueue.add("1");
        simpleQueue.add("5");
        simpleQueue.remove();
        System.out.println(simpleQueue);
    }
}
