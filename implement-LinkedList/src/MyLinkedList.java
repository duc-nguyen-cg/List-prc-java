public class MyLinkedList<E> {
    public Node head;
    private int numNodes;

    private class Node {
        public Node next;
        private E data;

        public Node(E data){
            this.data = data;
        }

//        private Node(E data, Node next){
//            this.data = data;
//            this.next = next;
//        }

        public E getData(){
            return this.data;
        }

    }

    public MyLinkedList(){
    }

    public MyLinkedList(E o){
        head = new Node(o);
    }

    //passed
    public E get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp.getData();
    }

    //passed
    public E getFirst(){
        return head.getData();
    }

    //passed
    public E getLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp.getData();
    }

    //passed
    public void add(int index, E element){
        Node temp = head;
        Node holder;

        for (int i = 0; i < index-1 && temp.next != null; i++){
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    //passed
    public void addFirst(E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    //passed
    public void addLast(E e){
        Node temp = head;
        if (temp == null){
            head = new Node(e);
        } else {
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(e);
            temp.next.next = null;
        }
        numNodes++;
    }

    //passed
    public E remove(int index){
        E result = null;
        if (index > 0){
            Node temp = head;
            for (int i = 0; i < index - 1 && temp.next != null; i++){
                temp = temp.next;
            }
            result = temp.next.getData();

            if (temp.next.next != null){
                Node holder = temp.next.next;
                temp.next = holder; //delete middle
            } else {
                temp.next = null; //if delete tail
            }
        } else {
            result = head.getData();
            head = head.next; //if delete head
        }
        numNodes--;
        return result;
    }

    //passed, but delete only once
    public boolean remove(Object e){
        Node temp = head;
        for (int i = 0; i < numNodes; i++){
            if (temp.getData().equals((E) e)){
                remove(i);
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    //passed
    public int size(){
        return numNodes;
    }

    //passed
    public void clear(){
        numNodes = 0;
        head = null;
    }

    //passed
    public int indexOf(E o){
        Node temp = head;
        for (int i = 0; i < numNodes && temp.next != null; i++){
            if (temp.getData().equals(o)){
                return i;
            }
            temp  = temp.next;
        }
        return -1;
    }

    //passed
    public boolean contains(E o){
        if (head != null){
            Node temp = head;
            while (temp.next != null){
                if (temp.getData().equals(o)){
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

//    @Override
//    public MyLinkedList<E> clone(){
//        MyLinkedList<E> newList = new MyLinkedList<>();
//        newList.head = new Node(head.getData(), head.next);
//        newList.head.next = head.next;
//        newList.numNodes = numNodes;
//        return newList;
//    }

    //passed
    public void printList(){
        Node temp = head;
        System.out.print("[\t");
        for (int i = 0; i < numNodes; i++){
            System.out.print(temp.getData()+"\t");
            temp = temp.next;
        }
        System.out.println("]");
    }
}
