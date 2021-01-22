import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyCustomArrayclass _ob1 = new MyCustomArrayclass(3);
        _ob1.insert(10);
        _ob1.insert(20);
        _ob1.insert(30);
        System.out.println(_ob1.count_elements());
        _ob1.printArray();
        _ob1.removeAt(0);
        _ob1.printArray();//[20,30]
        _ob1.remove(20);
        _ob1.printArray();//[30]
       /* _ob1.removeAt(0);
        _ob1.printArray();//exception
        _ob1.insertAt(2,50);//exception
        _ob1.printArray();/*
        */
        System.out.println(_ob1.indexof(30));
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.remove(0);
        System.out.println(list.indexOf(2));
        System.out.println(list);
    }
}
