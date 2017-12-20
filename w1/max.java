public class max{

    public static int maxNumber(int[] m){

        int max = 0;

        for(int i=1; i<m.length; i++){
            if(m[i]>m[i-1]){
                max=m[i];
            } else{
                max = m[i-1];
            }

        }

        return max;

    }

    public static void main(String[] args){

        int [] numberArry = new int[]{1,3,4,1,5,67,8};

        System.out.println(maxNumber(numberArry));

    }
}