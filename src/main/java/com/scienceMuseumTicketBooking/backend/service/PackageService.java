package com.scienceMuseumTicketBooking.backend.service;

import java.util.List;
import com.scienceMuseumTicketBooking.backend.model.Package;

public interface PackageService {
    //get packages of meuseum
    Package viewDetailedPackage(int pid);
    List<Package> getPackagesByMuseumId(int mid);
    int createPackage(Package p);

}
