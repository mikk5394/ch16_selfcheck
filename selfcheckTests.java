package ch16;

public class selfcheckTests {

    public static void main(String[] args) {
     //   ListNode list = new ListNode(5,new ListNode(4, new ListNode(3)));

/*
        //Selfcheck 9
        list.next.next = new ListNode(3);
        System.out.println("selfcheck 9: " + list);
*/
/*
        //Selfcheck 10
        list = new ListNode(3,list);
        System.out.println("selfcheck 10: " + list);
*/
/*
        //Selfcheck 11
        ListNode temp = new ListNode(3,new ListNode(4));
        temp.next.next = list.next;
        list.next = temp;
        System.out.println("selfcheck 11: " + list);
*/
/*
        //Selfcheck 12
        ListNode list2 = list;
        list = list.next;
        list2.next = list2.next.next;;
        list.next = null;
        System.out.println(list + ", " + list2);
*/
/*
        //Selfcheck 13
        ListNode temp = list; // begge sættes til 5
        list = list.next; // list sættes til 4
        temp.next = list.next; // temps anden index sat til 3, så 5 3
        list.next = temp; // list's næste index (som er 4) sættes til temp (som er 5 3) så list ender med at blive 4 5 3.
        System.out.println(list);
*/



    }
}
