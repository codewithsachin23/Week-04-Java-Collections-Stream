package org.day01.problemstatement.javagenerics.aidrivenresumescreeningsystem;

public class DataScientist extends JobRole {
    private String tool;

    public DataScientist(String candidateName, int experienceYears, String tool) {
        super(candidateName, experienceYears);
        this.tool = tool;
    }
    public String getTool(){
        return tool;
    }

    @Override
    public void displayResume() {
        System.out.println("Data Scientist: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Tool: " + tool);
    }
}
