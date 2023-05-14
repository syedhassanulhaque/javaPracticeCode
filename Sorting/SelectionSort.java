public class SelectionSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
  
    public static void main(String args[]){

       
        //selection sort
        int arr[]={5,6,2,1,3,1 ,0};

        for (int i = 0; i < arr.length-1; i++) {
            
            for (int j = i; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  
                }
            }
        }

        printArr(arr);


    }
}
