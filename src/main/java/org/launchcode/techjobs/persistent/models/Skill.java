package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required.")
    @Size(min=2, max=250, message="Description must be greater than 2 characters less than 250 characters.")
    private String description;

    public Skill(){ };

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}