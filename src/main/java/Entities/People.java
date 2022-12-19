package main.java.Entities;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E> {

    List<E> personList = new ArrayList<>();

    public void add(E p1) {
        personList.add(p1);
    }

    public void remove(E p1) {
        personList.remove(p1);
    }

    public void remove(int i) {
        for (E p : personList) {
            if (p.getId() == i) {
                personList.remove(p);
                break;
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

//    public E[] toArray(Entities.Student[] students) {
//        E[] newArray = (E[]) Array.newInstance(personList.get(0).getClass(), personList.size());
//        for (int i=0; i<personList.size(); i++) {
//            newArray[i] = personList.get(i);
//        }
//        return newArray;
//    }

    public E findById(int i) {
        for (E p : personList) {
            if (p.getId() == i) return p;
        }
        return null;
    }

    public boolean contains(E p) {
        return personList.contains(p);
    }

    public int count() {
        return personList.size();
    }

    @Override
    public Iterator<E> iterator() {
        return personList.stream().iterator();
    }
}
