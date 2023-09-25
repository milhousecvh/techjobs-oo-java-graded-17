package org.launchcode.techjobs.oo;

import java.util.Objects;
import static java.lang.System.lineSeparator;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }

    @Override
    public String toString() {
//        if (!this.isValid()) {
//            return "OOPS! This job does not seem to exist.";
//        }

//        String emptyMessage = "Data not available";
//        String employer;
//        String location;
////        String positionType;
////        String coreCompetency;
//
//        if (name == "" || name == null) {
//            name = emptyMessage;
//        }
//        if ((employer.getValue() == "" || employer == null)) {
//            employer.setValue(emptyMessage);
//        }
//        if ((location.getValue() == "" || location == null)) {
//            location.setValue(emptyMessage);
//        }
//        if ((positionType.getValue() == "" || positionType == null)) {
//            positionType.setValue(emptyMessage);
//        }
//        if ((coreCompetency.getValue() == "" || coreCompetency == null)) {
//            coreCompetency.setValue(emptyMessage);
//        }

        String newline = lineSeparator();

        return newline + "ID: " + id + newline +
                "Name: " + name + newline +
                "Employer: " + employer + newline +
                "Location: " + location + newline +
                "Position Type: " + positionType + newline +
                "Core Competency: " + coreCompetency + newline;
        }

    private boolean isValid() {
        return (this.name != null) || (this.employer!= null) || (this.location != null) || (this.positionType != null) || (this.coreCompetency != null);
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }
    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }



}


