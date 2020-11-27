package com.example.h2test;

import java.util.List;

public interface DonaterService {
    Donater getDonaterById(Long id);

    Donater addDonater(Donater donater);

    List<Donater> getAllDonaters();
}
