package com.study.error;

public class Demo_finally {

    public static void main(String[] args) {

        Demo d=new Demo();
        System.out.println(d.method());


    }
}

class  Demo{
    public int method(){
        int x=20;
        try {
            x=30;
            System.out.println(1/0);
            return x;
        }catch (Exception e){
            x=40;
//            System.out.println(x);
            return x;
        }finally {
            // 里面不能写return
            x=50;
//            System.out.println(x);

        }

    }

}
