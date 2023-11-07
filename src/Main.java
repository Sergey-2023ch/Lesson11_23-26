import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 500000; i++) {
            numbers.add(i);
        }
        System.out.println(numbers.getLast());
        System.out.println(System.currentTimeMillis());
        //1699330168447 милисекунд ArrayList работает чуть быстрее


        LinkedList<Integer>num=new LinkedList<>();
        for(int i=0;i<500000;i++){
            num.add(i);
        }
        System.out.println(num.getLast());
        System.out.println(System.currentTimeMillis());
        //1699330023837 милисек
    }
}