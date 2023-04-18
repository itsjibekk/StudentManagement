package com.example.ships_sqlex.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@Entity
@Table(name = "battles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Battle {
    @Id
    String name;
    Date date;
}
