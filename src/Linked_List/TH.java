package Linked_List;

import java.util.LinkedList;

public class TH {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(4);
        for (int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(i)+"\t");
        }
    }
}
