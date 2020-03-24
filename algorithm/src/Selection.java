//选择排序
public class Selection extends Sort{
    public static void main(String[] args) {
        int[] ints={1,5,4,3,2};
        ints = sort2(ints);
        print(ints);
    }

    public static int[] sort(int [] src){

        if(src!=null && src.length>1){
            for(int i=0;i<src.length-1;i++){
                int mix=i;
                for(int j=i;j<src.length;j++){
                    mix = src[mix]>=src[j] ? j : mix;
                }
                swap(src, i, mix);
            }
        }
        return src;
    }

    //高级 同时找出最大值 和 最小值  放到前后
    public static int[] sort2(int [] src){

        if(src!=null && src.length>1){
            for(int i=0;i<src.length-1;i++){
                int mix=i;
                int max=i;
                boolean hasFor = false;
                for(int j=i;j<src.length-i;j++){
                    hasFor=true;
                    mix = src[mix]>=src[j] ? j : mix;
                    max = src[max]<src[j] ? j : max;
                }
                if(hasFor) {
                    System.out.println("遍历"+i+"次,mix="+mix+",max="+max);
                    swap(src, i, mix);
                    swap(src, src.length - i - 1, max);
                    print(src);
                    System.out.println("==================");
                }
            }
        }
        return src;
    }
}
