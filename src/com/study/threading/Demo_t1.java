package com.study.threading;

public class Demo_t1 {
    public static void main(String[] args) {
        //jvm 虚拟机 多线程的
        for (int i = 0; i <1000000 ; i++) {
            new Demo();
        }
        for (int i = 0; i <1000000 ; i++) {
            System.out.println("saaa");
        }

    }
}

class Demo{
    @Override
    protected void finalize()  {
//        super.finalize();
        System.out.println("垃圾没了");
    }
}