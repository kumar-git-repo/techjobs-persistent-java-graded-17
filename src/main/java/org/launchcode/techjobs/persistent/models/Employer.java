package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity

public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    @NotBlank
    @Size(min = 1, max = 255)
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public Employer(){

    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs){
        this.jobs = jobs;
    }
}