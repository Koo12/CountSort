public class CountSort_test {
    public static void main(String[] args){
        int[] A=new int[]{1,6,5,9,8,7,5,2,2,3,6,5,8};
        int max=0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println("排序之前的数组为：");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"\t");
        }
        A=countSortTest(A,max);

        System.out.println("排序之后的数组为：");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+"\t");
        }
    }

    public static int[] countSortTest(int[] array,int k){
        int[] C=new int[k+1];
        for(int i=0;i<array.length;i++){
            C[array[i]]=C[array[i]]+1;
        }
        int sum=0;
        for(int i=0;i<C.length;i++){
            sum=sum+C[i];
            C[i]=sum;
        }
        int[] B=new int[array.length];
        for(int i=array.length-1;i>=0;i--){
            B[C[array[i]]-1]=array[i];
            C[array[i]]=C[array[i]]-1;
        }
        return B;
    }
}
