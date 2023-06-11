package HW03;

public class Main {
    public static void main(String[] args) {
        HashMap hm1 = new HashMap();
        hm1.put(1, 10);
        hm1.put(2, 43);
        hm1.put(3, 75);
        hm1.put(7, 67);
        System.out.println(hm1.get(1));
        System.out.println(hm1.get(2));
        System.out.println(hm1.get(5));
        System.out.println("-----------------------------------");
        System.out.println(hm1.get(3));
        System.out.println(hm1.remove(3));
        System.out.println(hm1.remove(3));
        System.out.println(hm1.get(3));
        System.out.println("-----------------------------------");
        System.out.println(hm1.get(2));
        System.out.println(hm1.replace(2, 56));
        System.out.println(hm1.get(2));
        System.out.println(hm1.replace(2, 40));
        System.out.println(hm1.get(2));
    }
}


