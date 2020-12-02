package com.example.h2test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/donaters")
public class H2TestController {
    @Autowired
    private DonaterService donaterService;

    H2TestController() {
//        donaterService.addDonater(new Donater("Vova", "hello", 222L));
//        donaterService.addDonater(new Donater("Sasha", "bye", 123L));
//        donaterService.addDonater(new Donater("Masha", "ahuel?", 7L));
    }

    @GetMapping
    public List<Donater> getAllDonaters() {
        return donaterService.getAllDonaters();
    }

    @GetMapping(path = "/{id}")
    public Donater getDonaterById(@PathVariable final Long id) {
        return donaterService.getDonaterById(id);
    }

    @GetMapping(path = "donations/{id}")
    public List<String> getDonaterDonations(@PathVariable final Long id) {
        return donaterService.getDonaterDonations(id);
    }

    @PostMapping
    public void addDonater(@RequestBody Donater donater) {
        donaterService.addDonater(donater);
    }

    @PostMapping(path = "/{id}")
    public void addDonation(@PathVariable final Long id, @RequestBody String donation, @RequestBody Integer value) {
        donaterService.addDonation(id, donation, value);
    }

}
