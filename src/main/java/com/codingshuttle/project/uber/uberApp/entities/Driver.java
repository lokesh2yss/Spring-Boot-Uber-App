package com.codingshuttle.project.uber.uberApp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Double rating;

    private String vehicleId;
    private Boolean available;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point currentLocation;
}
