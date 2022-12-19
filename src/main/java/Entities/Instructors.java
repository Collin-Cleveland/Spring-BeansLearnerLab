package main.java.Entities;

import java.util.Iterator;
import java.util.List;

public class Instructors extends People<Instructor> {
    public Instructors(Instructor p) {super(p);}
    public Instructors(List<Instructor> personList) {super(personList);}
    @Override
    public Iterator<Instructor> iterator() {return getPersonList().iterator();}
}