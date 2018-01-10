public class IntList{
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }

    public int size(){
        if(this.rest == null){
            return 1;
        }
        return 1+this.rest.size();
    }

    public int iterativeSize(){
        IntList p = this;
        int count = 0;

        while(p != null){
            count +=1;
            p = p.rest;
        }

        return count;
    }

    public int get(int i){
        IntList p = this;
        int index = 0;
        int answer = p.first;

        while(p != null){
            if(index == i){
                answer = p.first;
                break;
            }else{
                index +=1;
                p = p.rest;
            }
        }

        return answer;
    }

    public int geti(int i){

        if(i == 0){
            return first;
        }

        return rest.geti(i-1);


    }

    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5,L);
        // System.out.println(L.rest.first);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(2));
        System.out.println(L.geti(2));

    }
}