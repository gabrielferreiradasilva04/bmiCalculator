package com.android.bmicalc.entity;

import java.text.DecimalFormat;
import java.util.Objects;

public class Person {
    private String name;
    private double height; //altura
    private double weight; //peso
    private double bmi = 0; // imc
    private ClassWeight classWeight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public ClassWeight getClassWeight() {
        return classWeight;
    }

    public void setClassWeight(ClassWeight classWeight) {
        this.classWeight = classWeight;
    }

    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public Person(){

    }
    //methods
    public double bmiCalculation(){
       this.bmi = this.weight / (this.height * this.height);
       return this.bmi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(person.height, height) == 0 && Double.compare(person.weight, weight) == 0 && Double.compare(person.bmi, bmi) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight, bmi);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", bmi=" + bmi +
                '}';
    }
}
