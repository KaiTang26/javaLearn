public class DogLauncher{
    public static void main(String[] args){
        Dog [] myDog = new Dog[2];
        myDog[0] = new Dog(5);
        myDog[1] = new Dog(40);
        
        myDog[1].makeNoice();
        myDog[0].makeNoice();

        Dog bigger = Dog.maxDog(myDog[0], myDog[1]);

        bigger.makeNoice();

        System.out.println(args[0]);
    }
}