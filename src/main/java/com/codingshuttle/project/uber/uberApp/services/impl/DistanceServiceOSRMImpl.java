package com.codingshuttle.project.uber.uberApp.services.impl;

import com.codingshuttle.project.uber.uberApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        //TODO  Call the third party api called OSIRM to get the distance
        return 0;
    }
}
