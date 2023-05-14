public class InsertionSort {
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
  
    public static void main(String args[]){

       
        //Insertion  sort
        int arr[]={5,6,2,1,3};

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j >=0; j--) {
               if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
               }
            }
        }

        printArr(arr);


    }
}
