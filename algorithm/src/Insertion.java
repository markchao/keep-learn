//插入排序  是将 i 和 i-1 位置上的值进行比较，如果 i 上的值 小于 i-1位置的值 则交互 并继续 向 i-1方向比较，否则进行下一轮（即当前i至0顺序已正确）继续比较 i+1 和 i，
public class Insertion extends Sort {
    public static void main(String[] args) {
        int[] arr={4,6,2,1,3,5,9,8};
        sort(arr);
        print(arr);
    }

    static int[] sort(int[] arr){
        if(arr!=null && arr.length>1){
            for(int i=1;i<arr.length;i++){
                for(int j=i;j>0;j--){
                    if(arr[j]<arr[j-1]){
                        swap(arr,j,j-1);
                    }else {
                        break;
                    }
                }
            }
        }
        return arr;
    }
    //优化 去掉swap 使用 temp 减少赋值次数
    static int[] sort2(int[] arr){
        if(arr!=null && arr.length>1){
            for(int i=1;i<arr.length;i++){
                int temp=arr[i];
                for(int j=i;j>0;j--){
                    if(arr[j-1]>temp){
                        arr[j]=arr[j-1];
                    }else{
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
