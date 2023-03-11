package com.jc.twelve.demo5;

import lombok.Data;

@Data
public class Person implements Cloneable {
    private String name="½¯³¬";
    private int age=25;
    private Animal animal;

    public Person() {
        animal=new Animal();
    }

    //    Ç³¿ËÂ¡
    protected Person clone_qian() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    //    Éî¿ËÂ¡
    protected Person clone_shen() throws CloneNotSupportedException {
        Person person=(Person) super.clone();
        person.setAnimal(this.getAnimal().clone());
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}


class Animal implements Cloneable {
    private String name="animal";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected Animal clone() throws CloneNotSupportedException {
        return (Animal) super.clone();
    }

}
