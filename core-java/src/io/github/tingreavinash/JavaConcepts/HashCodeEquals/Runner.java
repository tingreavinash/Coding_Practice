package io.github.tingreavinash.JavaConcepts.HashCodeEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class Runner {
    public static void main(String[] args) {

        Employee e1 = new Employee(1);
        Employee e2 = new Employee(1);

        Map<Employee, String> map1 = new HashMap<>();
        map1.put(e1, "Avinash");
        map1.put(e2, "Avinash");
        System.out.println(map1.size()); // It will print 2, if hashcode is not implemented for Employee class.
    }
}
