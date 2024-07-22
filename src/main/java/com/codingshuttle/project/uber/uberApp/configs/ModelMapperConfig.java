package com.codingshuttle.project.uber.uberApp.configs;

import com.codingshuttle.project.uber.uberApp.dto.PointDto;
import com.codingshuttle.project.uber.uberApp.utils.GeometryUtil;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {
    @Bean
    public ModelMapper createModelMapper() {
        ModelMapper mapper = new ModelMapper();
        mapper.typeMap(PointDto.class, Point.class).setConverter(context -> {
            PointDto pointDto = context.getSource();
            return GeometryUtil.createPoint(pointDto);
        });

        mapper.typeMap(Point.class, PointDto.class).setConverter(context -> {
            Point point = context.getSource();
            double[] coordinates = {
                    point.getX(),
                    point.getY()
            };
            return new PointDto(coordinates);
        });
        return mapper;
    }
}
