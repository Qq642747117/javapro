package com.company.bean;

/**
 * Created by HP on 2020/2/13.
 */
public class Test2 {
    public static void main(String[] args) {

        int height = 100;
        for (int i = 0; i < 10; i++ ){
            System.out.println("第" + (i + 1) + "次落下时候高度:" + height + " ");

            height=height/2;

        }
    }


}
