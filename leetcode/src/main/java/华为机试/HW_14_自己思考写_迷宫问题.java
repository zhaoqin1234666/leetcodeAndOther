package 华为机试;


import java.util.*;


public class HW_14_自己思考写_迷宫问题 {

    public static int[][] directions = {
            {0, 1},// 右
            {-1, 0}, // 下
            {1, 0},// 上
            {0, -1} // 左
    };

    public static int[][] array;
    public static boolean[][] visit;
    //记录路径
    public static Stack<int[]>  path;
    public static List<int[]>  minPath;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        array = new int[m][n];
        visit = new boolean[m][n];
        path = new Stack<>();
        minPath = new ArrayList<>();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        dfs(0, 0);
        for (int [] array : minPath){
            System.out.println("(" + array[0] + "," + array[1] + ")");
        }
    }


    private static void dfs(int i, int j) {

        if (i > array.length - 1 || i < 0 || j > array[0].length - 1 || j < 0 ||
                visit[i][j] || array[i][j] == 1 ||
                //也可以在下面判断 不过这样效率更高
                (minPath.size() != 0 && path.size() >= minPath.size())
        ) {
            return;
        }
        visit[i][j] = true;
        path.add(new int[]{i,j});
        if (i == array.length-1 && j == array[0].length - 1){
            path.add(new int[]{i,j});
            // 可以在这里判断 最短路径 如果比已有的路径长 不用修改最短路径
//            if (minPath.size() == 0 || path.size() < minPath.size()){
//                minPath = new ArrayList<>(path);
//            }
            minPath = new ArrayList<>(path);
            path.pop();
        }
        //要明白这个递归的意思  按照一个方向走到头 才会走下一个方向
        for (int[] direction : directions) {
            dfs(i + direction[0], j + direction[1]);
        }

        visit[i][j] = false;
        path.pop();

    }
}