package com.leedcode.code;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/30 17:40
 */
public class m11 {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }

        int left = 0;
        int up = 0;
        int right = matrix[0].length - 1;
        int down = matrix.length - 1;
        while (right >= left && down >= up) {
            for (int i = left; i<= right; i++) {
                list.add(matrix[up][i]);
            }
            up++;
            if (up > down) {
                break;
            }

            for (int i = up; i <= down; up++) {
                list.add(matrix[i][right]);
            }

            right--;
            if (right < left) {
                break;
            }

            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }

            down--;
            if (down < up) {
                break;
            }

            for (int i = down; i >=up; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (left > right) {
                break;
            }
        }

        return list;
    }
    }
