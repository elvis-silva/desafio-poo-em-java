package com.elvissilva.desafio.poo;

public class Course extends Content{

    private int workload;

    public Course() {
    }

    @Override
    public double calculateXP() {
        return DEFAULT_XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title: " + getTitle() + "\'" +
                "description: " + getDescription() + "\'" +
                "workload=" + workload +
                '}';
    }
}
