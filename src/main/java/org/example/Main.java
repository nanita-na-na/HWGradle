package org.example;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Person person = new Person(1, "Leo", 23);
        person.setId(2);

        System.out.println(service.getMessage() + person);

    }
}