package HW03;

public class HashMap {

    Node head;

    Node[] array = new Node[16];



    public Object put(Integer key, int value) {
        Node node = new Node();
        node.key = key;
        node.value = value;
        node.hashcode = node.key.hashCode()%16;
        if(array[node.hashcode] != null) {
            Node tempNode = array[node.hashcode];
            while (tempNode != null) {
                if (tempNode.key == key) {
                    return tempNode.value;
                }
            }
            node.next = array[node.hashcode];
        }
        array[node.hashcode] = node;
        return null;
    }


    public Object get(Integer key) {
        int hash = key.hashCode()%16;
        if(array[hash] != null) {
            Node tempNode = array[hash];
            return tempNode.value;
        }
        return null;
    }

    public Object remove(Integer key) {
        int hash = key.hashCode()%16;
        if(array[hash] != null) {
            Node tempNode = array[hash];
            if(tempNode.key == key) {
                array[hash] = null;
                return tempNode.value;
            }
        }
        return null;
    }

    public Object replace(Integer key, int value) {
        int hash = key.hashCode()%16;
        if(array[hash] != null) {
            Node tempNode = array[hash];
            if(tempNode != null && tempNode.key == key) {
                Integer v = tempNode.value;
                tempNode.value = value;
                return v;
            }
        }
        return null;
    }

    //     public Object remove(Integer key) {
    //     int hash = key.hashCode()%16;
    //     if(array[hash] != null) {
    //         Node tempNode = array[hash];
    //         if(tempNode.key == key) {
    //             array[hash] = null;
    //             return tempNode.value;
    //         }
    //         if(tempNode.key == key && tempNode.next != null) {
    //             array[hash] = tempNode.next;
    //             return tempNode.value;
    //         }
    //         while(tempNode.next != null) {
    //             if(tempNode.next.key == key) {
    //                 Integer value = tempNode.next.value;
    //                 tempNode.next = tempNode.next.next;
    //                 return value;
    //             }
    //             tempNode = tempNode.next;
    //         }
    //     }
    //     return null;
    // }


    public class Node {

        Integer key;

        Integer value;

        int hashcode;

        Node next;
        
    }
 
}

