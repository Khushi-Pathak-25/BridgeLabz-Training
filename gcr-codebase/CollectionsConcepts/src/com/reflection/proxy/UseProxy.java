package com.reflection.proxy;

import java.lang.reflect.Proxy;

public class UseProxy {
    public static void main(String[] args) {
	Greeting target = new GreetingImplementation();
	LoggingProxy loggingProxy = new LoggingProxy(target);

	Greeting proxy = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),
		new Class[] { Greeting.class }, loggingProxy);

	proxy.sayHello();
    }
}