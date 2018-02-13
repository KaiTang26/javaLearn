public class SLList {

    private IntNode first;

    public SLList (int x){
        first = new IntNode(x, null);
    }

    public static void main(String[] args){

        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        // L.addLast(12);

        System.out.println(L.getFist());
        System.out.println(L.first.next.next.item);
    }

    public void addFirst(int x){
        first = new IntNode(x, first);
    }

    public int getFist(){
        return first.item;
    }

    public void addLast(int x){
        if (first.next == null){
            first.next = new IntNode(x, null);
        }
        first = first.next;
        this.addLast(x);
    }
}