package com.scienceMuseumTicketBooking.backend.service;

import java.util.List;

public interface PackageService {
    Package viewDetailedPackage(int pid);
    List<Package> getPackagesByMuseumId(int mid);
    int createPackage(Package p);
}
