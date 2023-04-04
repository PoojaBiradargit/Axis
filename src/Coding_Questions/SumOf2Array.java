//you have given an 2d int array,calculate the sum of elements
public class SumOf2Array {
    public void sumOfArray(int arr[][]){
        int sum=0;
        for (int i=0; i<arr.length; i++){
            int l =arr[i].length;
            for (int j=0; j<l;j++){
                sum +=arr[i][j];
            }
        }
        System.out.println("sum of 2d array:");
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][]= {{1,4,5,6},{1,1},{1,1,1}};
        SumOf2Array array=new SumOf2Array();
        array.sumOfArray(arr);
    }
}
