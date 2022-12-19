package main.java.Entities;

import java.util.Iterator;
import java.util.List;

public class Students extends People<Student> {

    public Students(Student p) {super(p);}
    public Students(List<Student> personList) {super(personList);}
    @Override
    public Iterator<Student> iterator() {return getPersonList().iterator();}
}
