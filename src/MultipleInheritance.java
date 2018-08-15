// Java program to solve Diamond Problem for Multiple Inheritance
// Created by Abhijeet Singh: github.com/cseas

interface Grandparent {
    // default method
    default void show() {
        System.out.println("Default Grandparent");
    }
}

interface Parent1 extends Grandparent {}
interface Parent2 extends Grandparent {}

public class MultipleInheritance implements Parent1, Parent2 {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.show();
    }
}
