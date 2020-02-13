package com.company.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HP on 2020/2/13.
 */
public class Text4 {
    public static void main(String[] args) {
        josephRing(100,1,3);
    }
    private static void josephRing(int n,int start,int m){
        List<Integer> list=new ArrayList<Integer>();//初始化列表
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        while(list.size()>0){
            for(int j=0;j<m-1;j++){
                list.add(list.remove(start));
            }
            System.out.println(list.remove(start));
        }
    }
}

