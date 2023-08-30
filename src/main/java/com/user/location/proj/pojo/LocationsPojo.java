package com.user.location.proj.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LocationsPojo {
    private String userName;
    private String userLocation;
    private int latitude;
    private int longitude;
    private double distance;
}
