public class MaxOfArray {


    public static void main(String[] args) {
        int arr[] ={9,8,7,6,5,4,3,2,1};
        int max=arr[1];
        int max2=arr[0];
        int x=0;
        int ind =0;
        for(int i=2;i<9;i++) {


            if(max2>max){
                int temp=max;
                max=max2;
                max2=temp;
            }
            if (arr[i] > max) {

                max = arr[i];
            }
            if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(max2);
    }
}
