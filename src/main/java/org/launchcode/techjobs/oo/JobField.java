package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString(){
        if (value == null || value.equals("")) {
            return "Data not available";
        } else {
            return value;
        }
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobFields = (JobField) o;
        return getId() == jobFields.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
