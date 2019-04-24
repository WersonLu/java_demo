package com.study.generic;

import com.study.bean.Tool;
import com.study.bean.WorkerStuden;

public class Demo3_generic {


    public static void main(String[] args) {
        Tool t=new Tool();
        t.setObject(new WorkerStuden("张三",23));

    }
}
