package Lesson01InterfacesAndAbstraction.Lab.pr04_say_hello.model;

import Lesson01InterfacesAndAbstraction.Lab.pr04_say_hello.contracts.Person;

public final class Chinese implements Person {

    private final String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }

}
