package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/20 22:12
 */
public class m7 {

    public boolean isNumeric (String s) {
        // write code here

        if (s == null || s.length() == 0) return false;
        //去掉首位空格
        s = s.trim();
        boolean numFlag = false;
        boolean dotFlag = false;
        boolean eFlag = false;
        for (int i = 0; i < s.length(); i++) {
            //判定为数字，则标记numFlag
            if (Character.isDigit(s.charAt(i))) {
                numFlag = true;
                //判定为.  需要没出现过.并且没出现过e// 点在e前面
            } else if (s.charAt(i) == '.' && !dotFlag && !eFlag) {
                dotFlag = true;
                //判定为e，需要没出现过e，并且出过数字了
            } else if ((s.charAt(i) == 'e' || s.charAt(i) == 'E') && !eFlag && numFlag) {
                eFlag = true;
                numFlag = false;//为了避免123e这种请求，出现e之后就标志为false
                //判定为+-符号，只能出现在第一位或者紧接e后面
            } else if ((s.charAt(i) == '+' || s.charAt(i) == '-') && (i == 0 || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')) {

                //其他情况，都是非法的
            } else {
                return false;
            }
        }
        return numFlag;


    }

    public boolean isNum(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }

        char[] chars = str.toCharArray();
        boolean isBlank = false;
        boolean isE = false;
        boolean isDot = false;
        boolean isAdd = false;

        for (int i = 0; i < chars.length; i++ ) {
            boolean bo = Character.isDigit(chars[i]);
            if (bo) {
                isBlank = true;
                continue;
            }

          /*  if () {

            }*/
        }



        return true;
    }

}
