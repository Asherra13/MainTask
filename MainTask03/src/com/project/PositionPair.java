package com.project;

public class PositionPair <T>{
    private T item1;
    private T item2;

    PositionPair(T item1, T item2 )
    {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T getItem1()
    {
        return  this.item1;
    }

    public T getItem2()
    {
        return  this.item2;
    }
}
