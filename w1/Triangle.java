public class Triangle{

    public static void drawTriangle(int N){    
        for(int numberOfLine = 1;numberOfLine <= N; numberOfLine++){
            for(int i =1; i<=numberOfLine; i++){
                System.out.print("*");
            }
            System.out.println();   
        }
    }

    public static void main(String[] args){

        drawTriangle(10);
        
    }
}