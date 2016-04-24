package com.woo.wrhorse.generic;

/**
 * Created by User on 2016/4/24.
 */
class Box<T> {
    private T data;
    public Box(){
    }

    public Box(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
