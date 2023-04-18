package com.example.ships_sqlex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    String classs;
    int launched;
}
