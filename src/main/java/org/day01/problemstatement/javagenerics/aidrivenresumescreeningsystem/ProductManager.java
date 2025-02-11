package org.day01.problemstatement.javagenerics.aidrivenresumescreeningsystem;

public class ProductManager extends JobRole {
    private int projectsManaged;

    public ProductManager(String candidateName, int experienceYears, int projectsManaged) {
        super(candidateName, experienceYears);
        this.projectsManaged = projectsManaged;
    }

    public int getProjectsManaged(){
        return projectsManaged;
    }

    @Override
    public void displayResume() {
        System.out.println("Product Manager: " + getCandidateName() +
                " | Experience: " + getExperienceYears() + " years" +
                " | Projects: " + projectsManaged);
    }
}
