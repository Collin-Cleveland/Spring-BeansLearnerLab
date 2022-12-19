package main.java.Entities;

import main.java.Interfaces.Learner;
import main.java.Interfaces.Teacher;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id, String name) {super(id, name);}

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
