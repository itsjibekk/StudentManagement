package com.example.ships.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "ships")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Ship {
    @Id
    String name;
    @ManyToOne
    @JoinColumn(name = "class_name", referencedColumnName = "classs")
    ShipClass classs;
    Integer launched;

}
