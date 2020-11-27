package com.example.h2test;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "donaters")
public class Donater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "donater_id", nullable = false)
    private List<Donation> donations = new ArrayList<>();

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Donation> getDonations() {
        return donations;
    }

    public void setDonations(List<Donation> donations) {
        this.donations = donations;
    }
}
