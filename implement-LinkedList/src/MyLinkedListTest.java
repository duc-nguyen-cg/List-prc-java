public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.addFirst(1);
        intList.addFirst(2);
        intList.addLast(3);
        intList.addFirst(3);
        intList.add(2, 5);
        intList.printList();

//        System.out.println(intList.getFirst());
//        System.out.println(intList.getLast());
//        System.out.println(intList.indexOf(5));

        System.out.println(intList.remove(4));
        intList.printList();
//        System.out.println(intList.contains(5));
//        System.out.println(intList.indexOf(5));
//
//        intList.clear();
//        intList.printList();
//        System.out.println(intList.contains(5));
//        System.out.println(intList.indexOf(5));
//
//        intList.addFirst(2);
//        intList.addFirst(1);
//        intList.addLast(3);
//        intList.printList();
//
//
//        intList.remove(new Integer(1));
//        intList.printList();
//
//        intList.addFirst(0);
//        intList.printList();
//        intList.remove(new Integer(3));
//        intList.printList();
//        intList.add(1, 10);
//        intList.printList();
//        intList.addLast(7);
//        intList.printList();
//        intList.remove(new Integer(2));
//        intList.printList();

    }
}
