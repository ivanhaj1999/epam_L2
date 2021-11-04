package org.oops.encapsulationtest;

import org.oops.encapsulation.Student;

public class StudentDetailsTest {
    public static void main(String args[]) {
        Student encap = new Student();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
    }
}
