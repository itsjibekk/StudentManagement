package com.example.ships.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@Data
@RequiredArgsConstructor
public class ShipClassDto {
    List<String> class_names;
}
