package com.lzb.structure.proxy.staticproxy;

/**
 * @Author : LZB
 * @Description :
 */
public class PersonProxy implements Person {
    private Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println("静态代理");
        person.eat();
    }

    @Override
    public void sleep() {
        System.out.println("静态代理");
        person.sleep();
    }
}
