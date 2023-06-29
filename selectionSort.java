public class selectionSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int array[]={8,2,3,6,5};
        for(int i=0;i<array.length-1;i++){
            int smallest=i;
            for(int j=i+1;j< array.length-1;j++){
                if(array[smallest]>j){
                    smallest=j;
                }

            }
            int temp=array[smallest];
            array[smallest]=array[i];
            array[i]=temp;

        }
        printArray(array);
    }
}
