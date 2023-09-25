package org.launchcode.techjobs.oo;

import org.junit.Test;
import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;


public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = lineSeparator();
        String firstChar = String.valueOf(job1.toString().substring(0,2));
        String lastChar = String.valueOf(job1.toString().substring(job1.toString().length()-2));

        assertEquals(firstChar, lineSeparator());
        assertEquals(lastChar, lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job3.getLocation().toString(), "Data not available");
    }


    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String newline = lineSeparator();
        String results =
                newline +
                        "ID: 4" + newline +
                        "Name: Product tester" + newline +
                        "Employer: ACME" + newline +
                        "Location: Desert" + newline +
                        "Position Type: Quality control" + newline +
                        "Core Competency: Persistence"
                        + newline;
        assertEquals(results, job4.toString() );
    }

}
