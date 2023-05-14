public class ClearBit {
    public static void main(String args[]){
        int n=5;
        int pos=2;
        int bitMask=1<<pos;

        bitMask=~(bitMask);

        int newNumber=n & bitMask;
        System.out.print(newNumber);
     

      
    }
}
