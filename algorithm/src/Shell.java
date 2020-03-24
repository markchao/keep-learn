public class Shell extends Sort {
    public static void main(String[] args) {
        int[] arr = {9,6,11,3,5,12,8,7,10,15,14,4,1,13};
        sort2(arr);
        print(arr);
    }

    static int[] sort(int[] arr){
        for(int s=arr.length/2;s>0;s /=2){
            System.out.println("step="+s);
            sortMaByStep(arr,s);
        }
        return  arr;
    }
    static int[] sort2(int[] arr){
        //使用 knuth 序列 效率比较高 h=3*h+1
        int h = 1;
        while (h*3+1 <= (arr.length-1)/3){
            h=h*3+1;
        }
        for(int s=h;s>0;s=(s-1)/3){
            System.out.println("step="+s);
            sortMaByStep(arr,s);
        }
        return  arr;
    }

    //这是我的 先按照每组 排序 比马老师的多个 for(int i=0;i<step;i++)
    static int[] sortByStep(int[] arr,int step){
        for(int i=0;i<step;i++){
            for(int j=i+step;j<arr.length;j=j+step){
                for(int g=j;g>0;g=g-step){
                    if((g-step)>=0 && arr[g]<arr[g-step]){
                        swap(arr,g,g-step);
                    }else {
                        break;
                    }
                }
            }
        }
        return arr;
    }


    static int[] sortMaByStep(int[] arr,int step){

        for(int i=step;i<arr.length;i++){
            for(int j=i;j>step-1;j-=step){
                if(arr[j]<arr[j-step]){
                    swap(arr,j,j-step);
                }else {
                    break;
                }
            }
        }

        return arr;
    }

}
