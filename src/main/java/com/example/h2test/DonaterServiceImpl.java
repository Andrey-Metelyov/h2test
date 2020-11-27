package com.example.h2test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonaterServiceImpl implements DonaterService {
    @Autowired
    DonaterRepository donaterRepository;

    @Override
    public Donater getDonaterById(Long id) {
        return donaterRepository.findById(id).get();
    }

    @Override
    public Donater addDonater(Donater donater) {
        return donaterRepository.save(donater);
    }

    @Override
    public List<Donater> getAllDonaters() {
        return (List<Donater>) donaterRepository.findAll();
    }

    @Override
    public Donation addDonation(Long donaterId, Donation donation) {
        Donater donater = donaterRepository.findById(donaterId).get();
        List<Donation> donations = donater.getDonations();
        donations.add(donation);
        donater.setDonations(donations);
        donaterRepository.save(donater);
        return donation;
    }

    @Override
    public List<Donation> getDonaterDonations(Long id) {
        return donaterRepository.findById(id).get().getDonations();
    }
}
