package com.example.ships.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "classes")
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ShipClass {
    @Id
    String classs;
    String type;
    String country;
    Integer numGuns;
    Integer bore;
    Integer displacement;


}
