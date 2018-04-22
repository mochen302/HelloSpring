package com.mochen.hello;

public class HelloWorldService {

    private IHelloWorld helloWorld;

    public HelloWorldService() {

    }

    public void setHelloWorld(IHelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public IHelloWorld getHelloWorld() {
        return this.helloWorld;
    }

}
