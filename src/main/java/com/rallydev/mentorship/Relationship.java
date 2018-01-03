package com.rallydev.mentorship;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "relationship")
public class Relationship {
    private String area;
    private boolean power_user;
    private boolean mentor;
    private boolean active;

    public String getArea() {
        return area;
    }

    @Column(name = "area")
    public void setArea(String area) {
        this.area = area;
    }

    public boolean isActive() {
        return active;
    }

    @Column(name = "active")
    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isMentor() {
        return mentor;
    }

    @Column(name = "mentor")
    public void setMentor(boolean mentor) {
        this.mentor = mentor;
    }

    public boolean isPower_user() {
        return power_user;
    }

    @Column(name = "power_user")
    public void setPower_user(boolean power_user) {
        this.power_user = power_user;
    }
}
