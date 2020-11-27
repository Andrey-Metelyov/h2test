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

    @PostMapping
    public void addDonater(@RequestBody Donater donater) {
        donaterService.addDonater(donater);
    }

}
