public class Dog{

    public int weightInPounds;

    public Dog(int w){
        weightInPounds =w;
    }

    public void makeNoice(){
        if(weightInPounds<10){
            System.out.println("yip");
        } else if(weightInPounds<30){
            System.out.println("bark");

        }else{
            System.out.println("wooof");
        }
        
    }
}