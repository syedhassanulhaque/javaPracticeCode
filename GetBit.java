public class GetBit {
    public static void main(String args[]){
        int n=5;
        int pos=3;
        int bitMask=1<<pos;

        if ((n & bitMask)==0) {
            System.out.println("Bit is  zero");
        }
        else{
            System.out.println("Bit is one");
        }
    }
}
