class Array{
    public static void main(String[] args){
        int arr[]={5,2,7,9,3,5};
        int arr1[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr1[j]=arr[i];
            j++;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"  ");
        }
    }
}