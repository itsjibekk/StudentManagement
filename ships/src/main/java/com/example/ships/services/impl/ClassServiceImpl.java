package com.example.ships.services.impl;

import com.example.ships.dtos.ShipClassDto;
import com.example.ships.models.ShipClass;
import com.example.ships.repositories.ClassRepo;
import com.example.ships.services.ClassService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClassServiceImpl implements ClassService {
    private final ClassRepo classRepo;

    public ClassServiceImpl(ClassRepo classRepo) {
        this.classRepo = classRepo;
    }

    @Override
    public Object findClassesByBattleResult(String result) {
        List<ShipClass> shipClassList = classRepo.findByBattleResult(result);
        return mapToDto(shipClassList);
    }

    private ShipClassDto mapToDto(List<ShipClass> list) {
        ShipClassDto shipClassDto = new ShipClassDto();
        shipClassDto.setClass_names(list.stream().map(x -> x.getClasss()).collect(Collectors.toList()));
        return shipClassDto;
    }
}
