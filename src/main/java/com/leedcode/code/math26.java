package com.leedcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class math26 {

    public static void main(String[] args) {
        combinationSum(new int[]{7, 3, 9, 6}, 6);
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length < 1 || target < candidates[0]) {
            return new ArrayList<>();
        }

        Arrays.sort(candidates);
        Set<List<Integer>> set = new HashSet<>();

        List<List<Integer>> res = new ArrayList<>();
        math(candidates, target, res, 0, new ArrayList<Integer>());
        return res;
    }

    public static void math(int[] candidates, int target, List<List<Integer>> res, int idx, List<Integer> l) {
        for (int i = idx; i < candidates.length; i++) {
            if (candidates[i] > target) {
                return;
            }

            if (target == candidates[i]) {
                l.add(target);
                res.add(l);
                return;
            }

            int lost = target - candidates[i];
            List<Integer> t = new ArrayList<>(l);
            t.add(candidates[i]);
            math(candidates, lost, res, i, t);
        }
    }
}
