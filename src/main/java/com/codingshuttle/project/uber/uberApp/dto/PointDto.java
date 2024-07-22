package com.codingshuttle.project.uber.uberApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PointDto {
    private double[] coordinates;
    private String type = "Point";

    public PointDto(double[] coordinates) {
        this.coordinates = coordinates;
    }
}
