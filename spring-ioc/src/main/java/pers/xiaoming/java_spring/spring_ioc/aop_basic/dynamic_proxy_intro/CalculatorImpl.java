package pers.xiaoming.java_spring.spring_ioc.aop_basic.dynamic_proxy_intro;

import pers.xiaoming.java_spring.spring_ioc.aop_basic.traditional_impl.Calculator;

public class CalculatorImpl implements Calculator {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public int sub(int a, int b) {
        int result = a - b;
        return result;
    }

    public int mul(int a, int b) {
        int result = a * b;
        return result;
    }

    public int div(int a, int b) {
        int result = a / b;
        return result;
    }
}