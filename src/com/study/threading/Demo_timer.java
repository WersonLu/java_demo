package com.study.threading;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

// 定时器
public class Demo_timer {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        t.schedule(new MyTimerTask(), new Date(188, 4, 26, 7, 30, 30));
        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }

    }
}

class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("学习");
    }
}
