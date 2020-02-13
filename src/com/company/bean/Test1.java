package com.company.bean;

/**
 * Created by HP on 2020/2/13.
 */
public class Test1 {
    public static void main(String [] args){
        int m =6;
        for(int i = 1; i <= m; i++){
            System.out.print(Fibonacci(i)+"、");
        }
    }
    public static int Fibonacci (int m){
        if (m == 1 || m == 2){
            return 1;
        }else{
            return Fibonacci(m-1)+Fibonacci(m-2);
        }
    }
}

