package poketmonstar;

import java.util.Scanner;


public class Poket {
    private String name;
    private String kind;
    private int age;

    public Poket(){}

    public Poket(String name, String kind, int age){
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    String getName(){
        return name;
    }


    String getKind(){
        return kind;
    }

    int getAge(){
        return age;
    }


}
