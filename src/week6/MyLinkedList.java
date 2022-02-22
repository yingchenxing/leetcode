package week6;

class MyLinkedList {

    public int val;
    public MyLinkedList next;
    public MyLinkedList pre;

    public MyLinkedList() {
        int val;
        MyLinkedList next;
        MyLinkedList pre;
    }

    public int get(int index) {
        MyLinkedList temp = this;

        while(temp.pre != null){
            temp = temp.pre;
        }

        for(int i =0;i<index;i++){
            if(temp!=null)
                temp = temp.next;
            else
                return -1;
        }
        return temp.val;
    }

    public void addAtHead(int val) {
        MyLinkedList head = new MyLinkedList();
        head.val = val;
        MyLinkedList temp = this;
        while(temp.pre != null){
            temp = temp.pre;
        }
        temp.pre = head;
        head.next = temp;
    }

    public void addAtTail(int val) {
        MyLinkedList tail = new MyLinkedList();
        tail.val = val;
        MyLinkedList temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = tail;
        tail.pre = temp;
    }

    public void addAtIndex(int index, int val) {
        MyLinkedList temp = this;

        while(temp.pre != null){
            temp = temp.pre;
        }

        for(int i = 0;i<index-1;i++){
            temp = temp.next;
        }



    }

    public void deleteAtIndex(int index) {

    }
}