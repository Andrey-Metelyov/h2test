package com.example.h2test;

import java.util.List;

public interface DonaterService {
    Donater getDonaterById(Long id);

    Donater addDonater(Donater donater);

    List<Donater> getAllDonaters();

    String addDonation(Long donaterId, String donation, Integer value);

    List<String> getDonaterDonations(Long id);
}
