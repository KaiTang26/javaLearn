package com.list1;

public class Main {

    public int num;

    public Main list;

    public Main (int a, Main b){

        num = a;

        list = b;
    }

    public int size(){

        if(this.list == null){
            return 1;
        }

        return 1+this.list.size();
    }

    public int sizel(){
        int count = 1;

        Main holder = this;

        while(holder.list != null){

            count++;

            holder = holder.list;
        }

        return count;

    }

    public int getl(int index){

        int count = 0;

        Main holder = this;

        while(count != index){

            count++;

            holder = holder.list;

        }

        return holder.num;
    }

    public int get(int index){

        if(index==0){
            return this.num;
        }

        return this.list.getl(index-1);

    }

    public static void main(String[] args) {
	// write your code here

        Main L = new Main(10, null);

        L = new Main(12, L);

        L = new Main(45, L);

        System.out.println(L.size());

        System.out.println(L.sizel());

        System.out.println(L.get(2));

        System.out.println(L.getl(2));
    }
}
