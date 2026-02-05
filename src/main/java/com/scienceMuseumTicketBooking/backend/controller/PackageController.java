package com.scienceMuseumTicketBooking.backend.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.scienceMuseumTicketBooking.backend.model.Package;
import com.scienceMuseumTicketBooking.backend.service.PackageService;

@RestController
@CrossOrigin
@RequestMapping("/package")
public class PackageController {

    private final PackageService packageService;

    public PackageController(PackageService packageService) {
        this.packageService = packageService;
    }

    @GetMapping("/pack/{pid}")
    public Package viewDetailedPackage(@PathVariable int pid) {
        return packageService.viewDetailedPackage(pid);
    }

    @GetMapping("/{mid}/packages")
    public List<Package> getPackagesByMuseum(@PathVariable int mid) {
        return packageService.getPackagesByMuseumId(mid);
    }

    @PostMapping("/create")
    public int createPackage(@RequestBody Package p) {
        return packageService.createPackage(p);
    }
}
