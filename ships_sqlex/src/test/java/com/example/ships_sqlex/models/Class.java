package com.example.ships_sqlex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "classes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Class {
    @Id
    String classs;
    String type;
    String country;
    int numGuns;
    int bore;
    int displacement;

}
