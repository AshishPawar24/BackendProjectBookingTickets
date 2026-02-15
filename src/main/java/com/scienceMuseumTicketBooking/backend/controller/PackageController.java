package com.scienceMuseumTicketBooking.backend.controller;

import com.scienceMuseumTicketBooking.backend.service.PackageServiceImpl;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.scienceMuseumTicketBooking.backend.model.Package;
import com.scienceMuseumTicketBooking.backend.service.PackageService;

@RestController
@CrossOrigin
@RequestMapping("/package")
public class PackageController {
    PackageServiceImpl pser;

    public PackageController(PackageServiceImpl pser) {
        super();
        this.pser = pser;
    }
    @GetMapping("/pack/{id}")
    public Package viewDetailedPackage(@PathVariable int pid) {
        return pser.viewDetailedPackage(pid);
    }

    @GetMapping("/{mid}/packages")
    public List<Package> getPackagesByMuseumId(@PathVariable("mid") int mid) {
        return pser.getPackagesByMuseumId(mid);
    }

    @PostMapping("/create")
    public int createPackage(@RequestBody Package p) {
        return pser.createPackage(p);
    }
}