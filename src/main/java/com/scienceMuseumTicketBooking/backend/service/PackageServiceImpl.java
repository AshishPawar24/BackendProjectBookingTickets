package com.scienceMuseumTicketBooking.backend.service;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

import com.scienceMuseumTicketBooking.backend.model.Package;
import com.scienceMuseumTicketBooking.backend.repository.PackageRepository;
import com.scienceMuseumTicketBooking.backend.service.PackageService;

@Service
public class PackageServiceImpl implements PackageService {

    private final PackageRepository packageRepository;

    public PackageServiceImpl(PackageRepository packageRepository) {
        this.packageRepository = packageRepository;
    }

    @Override
    public Package viewDetailedPackage(int pid) {
        return null;
    }

    @Override
    public List<Package> getPackagesByMuseumId(int mid) {
        return Collections.emptyList();
    }

    @Override
    public int createPackage(Package p) {
        return 0;
    }
}
