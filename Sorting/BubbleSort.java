public class BubbleSort{
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
  
    public static void main(String args[]){

       
        //bubble sort
        int arr[]={5,6,2,1,3};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j+1]<arr[j]) {
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        printArr(arr);


    }

    
}
