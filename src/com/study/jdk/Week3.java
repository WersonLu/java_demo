package com.study.jdk;

public enum Week3 {
    MON("星期一") {
        public void show() {
            System.out.println("今天星期一");
        }
    },
    TUE("星期二") {
        public void show() {
            System.out.println("今天星期二");
        }
    },
    WED("星期三") {
        public void show() {
            System.out.println("今天星期三");
        }
    };

    private String name;

    private Week3(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
