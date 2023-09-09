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
        if (!this.isValid()) {
            return "OOPS! This job does not seem to exist.";
        }

        String emptyMessage = "Data not available";
        String employer;
        String location;
        String positionType;
        String coreCompetency;

        if (name == "") {
            setName(emptyMessage);
        }
        if ((this.employer == null)) {
            employer = emptyMessage;
        } else {
            employer = this.employer.getValue();
        }
        if ((this.location == null)) {
            location = emptyMessage;
        } else {
            location = this.location.getValue();
        }
        if ((this.positionType == null)) {
            positionType = emptyMessage;
        } else {
            positionType = this.positionType.getValue();
        }
        if ((this.coreCompetency == null)) {
            coreCompetency = emptyMessage;
        } else {
            coreCompetency = this.coreCompetency.getValue();
        }

        return System.lineSeparator() +
                "ID: " + this.id + System.lineSeparator() +
                "Name: " + name + System.lineSeparator() +
                "Employer: " + employer + System.lineSeparator() +
                "Location: " + location + System.lineSeparator() +
                "Position Type: " + positionType + System.lineSeparator() +
                "Core Competency: " + coreCompetency + System.lineSeparator();
        }

    private boolean isValid() {
        return (this.name != null) || (this.employer!= null) || (this.location != null) || (this.positionType != null) || (this.coreCompetency != null);
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
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

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
