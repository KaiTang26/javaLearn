package com.list1;

public class SLList {

    private static class Lnode{

        private int item;

        private Lnode next;

        public Lnode(int i, Lnode n){
            item = i;

            next = n;
        }
    }

    private Lnode first;

    private int count;

    public SLList(int num){
        first = new Lnode(666,null);
        first.next = new Lnode(num, null);

        count =1;
    }

//    create a constructor for empty list

    public SLList(){

        first = new Lnode(666,null);

        count=0;
    }

    public void addFirst(int num){

        first.next = new Lnode(num, first.next);

        count++;

    }

    public int getFirst(){

        return first.item;
    }

    public void addLast(int num){
        Lnode holder = first;

        while(holder.next!=null){
            holder=holder.next;
        }

        holder.next=new Lnode(num, null);

        count++;
    }

    public int size(){
        int count =1;

        Lnode holder = first;

        while(holder.next!=null){
            count++;
            holder=holder.next;
        }

        return count;
    }

//    the sizeFast method used to return the count value

    public int sizeFast(){

        return count;
    }


    public static void main(String[] args){

        SLList p = new SLList();

//        p.addFirst(40);

//        p.addLast(50);

          p.addLast(52);



        System.out.println(p.size());

        System.out.println(p.getFirst());

        System.out.println(p.sizeFast());

    }
}
