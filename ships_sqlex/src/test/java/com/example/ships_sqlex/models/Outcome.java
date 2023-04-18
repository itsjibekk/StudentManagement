package com.example.ships_sqlex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Table(name = "outcomes")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Outcome {
    @Id
    String ship;
    String battle;
    String result;

}
