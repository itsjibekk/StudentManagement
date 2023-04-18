package com.example.ships.models;

import jakarta.persistence.*;
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
    @ManyToOne
    @JoinColumn(name = "battle_name", referencedColumnName = "name")
    Battle battle;
    String result;
}
