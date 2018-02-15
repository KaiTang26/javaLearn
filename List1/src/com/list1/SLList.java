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

    public SLList(int num){
        first = new Lnode(num, null);
    }

    public void addFirst(int num){

        first = new Lnode(num, first);

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

    public static void main(String[] args){

        SLList p = new SLList(12);

        p.addFirst(40);

        p.addLast(50);

//        int result = p.first.next.next.item;

        System.out.println(p.size());

        System.out.println(p.getFirst());
    }
}
