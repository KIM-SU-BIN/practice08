package com.javaex.ex05;

public class Mul {

    private int a;
    private int b;
    
    public void setValue() {
    }

    
    public void setValue (int a, int b) {
		this.a = a;
		this.b = b;
	}


	public int calculate() {
    	return this.a * this.b;
    }
}
