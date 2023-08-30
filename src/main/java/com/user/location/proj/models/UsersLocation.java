package com.user.location.proj.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "location")
public class UsersLocation {
    @Id
    private long locationID;

    private String userName;
    private String userLocation;
    private int latitude;
    private int longitude;

}
