package io.zipcoder.polymorphism;

public class Snake extends Pet {
    public Snake(String name) {
        super(name);
    }

    public String speak(){
        return "SsSsssS!";
    }
}
