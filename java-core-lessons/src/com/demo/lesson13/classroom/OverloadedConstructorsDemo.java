package com.demo.lesson13.classroom;

public class OverloadedConstructorsDemo {

    private final int n;
    private final int m;
    private final String s;
    private final boolean b;

    public OverloadedConstructorsDemo(int n) {
        this(n, -1, "Default", false);
    }

    public OverloadedConstructorsDemo(int n, int m) {
        this(n, m, "Default", false);
    }

    public OverloadedConstructorsDemo(int n, int m, String s, boolean b) {
        this.n = n;
        this.m = m;
        this.s = s;
        this.b = b;
    }

}
