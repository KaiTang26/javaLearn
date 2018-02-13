public class ByteShortInt {

    public static void main(String[] args){

        int myMinValue = -2_147_483_648;

        int myMaxValue = 2_147_483_647;

//        the range for byte: -128 to 127

        byte myByteValue = 10;

        byte myNewByte = (byte) (myByteValue/2);

//        the range for short: ....

        short myShortValue = 123;



//        code assignment:

//        Q1
        byte byteNum = 100;
//        Q2
        short shortNum = 30000;
//        Q3
        int intNum = 234567;
//        Q4
        long longNum = 50000L+10L*(byteNum+shortNum+intNum);
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);




    }
}
