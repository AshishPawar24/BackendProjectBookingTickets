package com.scienceMuseumTicketBooking.backend.service;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

import com.scienceMuseumTicketBooking.backend.model.Package;
import com.scienceMuseumTicketBooking.backend.repository.PackageRepository;
import com.scienceMuseumTicketBooking.backend.service.PackageService;

@Service
public class PackageServiceImpl implements PackageService {

    private final PackageRepository prepo;

    public PackageServiceImpl(PackageRepository prepo) {
        this.prepo = prepo;
    }

    @Override
    public Package viewDetailedPackage(int pid) {
        return prepo.findById(pid).orElse(null);
    }

    @Override
    public List<Package> getPackagesByMuseumId(int mid) {
        return prepo.findByMuseumMid(mid);
    }

    @Override
    public int createPackage(Package p) {
        Package saved = prepo.save(p);
        return saved.getPid();
    }
}
