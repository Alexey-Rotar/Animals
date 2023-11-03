package org.example;

class Counter implements AutoCloseable{
    int c;

    public int getC() { return c; }

    public Counter() {
        this.c = 0;
    }

    public void close() {
        return;
    }

    public void add() {
        this.c++;
    }
}