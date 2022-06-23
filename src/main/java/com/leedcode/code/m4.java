package com.leedcode.code;

import java.util.LinkedList;
import java.util.Queue;

public class m4 {
    public int movingCount(int threshold, int rows, int cols) {
        //临时变量visited记录格子是否被访问过
        boolean[][] visited = new boolean[rows][cols];
        int res = 0;
        //创建一个队列，保存的是访问到的格子坐标，是个二维数组
        Queue<int[]> queue = new LinkedList<>();
        //从左上角坐标[0,0]点开始访问，add方法表示把坐标
        // 点加入到队列的队尾

        queue.add(new int[]{0, 0});
        while (queue.size() > 0) {
            //这里的poll()函数表示的是移除队列头部元素，因为队列
            // 是先进先出，从尾部添加，从头部移除
            int[] x = queue.poll();
            int i = x[0], j = x[1];
            //i >= rows || j >= cols是边界条件的判断，threshold < sum(i, j)判断当前格子坐标是否
            // 满足条件，visited[i][j]判断这个格子是否被访问过
            if (i >= rows || j >= cols || threshold < sum(i, j) || visited[i][j])
                continue;
            //标注这个格子被访问过
            visited[i][j] = true;
            res++;
            //把当前格子右边格子的坐标加入到队列中
            queue.add(new int[]{i + 1, j});
            //把当前格子下边格子的坐标加入到队列中
            queue.add(new int[]{i, j + 1});
        }
        return res;
    }

    //计算两个坐标数字的和
    private int sum(int i, int j) {
        int sum = 0;
        //计算坐标i所有数字的和
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }
        //计算坐标j所有数字的和
        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }
        return sum;
    }
}
