package HW02;

public class Main {
    public static void main(String[] args) {
        HWLinkedList List1 = new HWLinkedList();

        List1.add(10);

        List1.add(20);

        List1.add(33);

        List1.add(56);

        List1.print();


        List1.revert();

        System.out.println("REVERT");

        List1.print();

    }
}
