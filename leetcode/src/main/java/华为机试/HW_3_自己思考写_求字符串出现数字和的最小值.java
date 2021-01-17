package 华为机试;

/**
 *
 *  任给一个数组,其中只有一个元素是单独出现,其他是成对出现,输出单独的元素。
 *     例如： 输入： {2,2,1,1,4,4,7}
 *     输出：7
 *
 */
public class HW_3_自己思考写_求字符串出现数字和的最小值 {


    /**
     *  n 异或 n = 0
     *  n 异或 0 = n
     * @param args
     */
    public static void main(String[] args) {
        int [] array = new int[]{2,2,1,1,4,4,7};
        System.out.println(find(array));
    }


    /**
     * java的位运算
     *
     * @param array
     * @return
     */
    public static int find(int [] array){
        int num = array[0];
        for (int i = 1; i < array.length; i++){
            num = array[i] ^ num;
        }
        return num;
    }


}
