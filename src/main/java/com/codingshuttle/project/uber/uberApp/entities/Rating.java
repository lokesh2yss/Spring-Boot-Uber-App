package com.codingshuttle.project.uber.uberApp.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(indexes = {
        @Index(name = "idx_rating_driver", columnList = "driver_id"),
        @Index(name = "idx_rating_rider", columnList = "rider_id")

})
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Ride ride;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Rider rider;

    private Integer driverRating; //rating for the driver

    private Integer riderRating; //rating for the rider

}
