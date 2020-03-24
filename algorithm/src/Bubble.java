//冒泡排序 和 选择排序的区别是 每次比较 只要符合条件 都要交换位置
public class Bubble extends Sort{

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        sort2(arr);
        print(arr);
    }

    static int[] sort(int[] arr){
        if(arr!=null && arr.length>1){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                   if(arr[j]>arr[j+1]) {
                       swap(arr, j, j + 1);
                   }
                }
            }
        }
        return arr;
    }
    //最优方式： 时间复杂度是O(n)的优化
    static int[] sort2(int[] arr){
        if(arr!=null && arr.length>1){
            for(int i=0;i<arr.length;i++){
                System.out.println("第"+i+"次 外循环");
                boolean didSwap=false;
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]) {
                        swap(arr, j, j + 1);
                        didSwap=true;
                    }
                }
                if(!didSwap){
                    return arr;
                }
            }
        }
        return arr;
    }
}
