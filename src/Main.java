public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("Hello");
        list.add("World");
        list.add("GoIT courses");


        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));


        list.remove(1);
        System.out.println(list.get(1));


        list.clear();


        System.out.println(list.size());

    }
}