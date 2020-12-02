package com.example.h2test;

import javax.persistence.*;
import java.util.List;

@Entity(name = "donaters")
public class Donater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToMany(cascade = {CascadeType.ALL})
//    @JoinColumn(name = "donater_id", nullable = false)
    @ElementCollection
    @OrderColumn
    private List<String> donations;

    @ElementCollection
    @OrderColumn
    private List<Integer> donationValues;

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

    public List<String> getDonations() {
        return donations;
    }

    public void setDonations(List<String> donations) {
        this.donations = donations;
    }

    public List<Integer> getDonationValues() {
        return donationValues;
    }

    public void setDonationValues(List<Integer> value) {
        this.donationValues = value;
    }
}
