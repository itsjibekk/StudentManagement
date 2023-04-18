package com.example.ships.services.impl;

import com.example.ships.services.ClassService;
import com.example.ships.services.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    private ClassService classService;

    public TaskServiceImpl(ClassService classService) {
        this.classService = classService;
    }

    @Override
    public Object run(String result) {
        return classService.findClassesByBattleResult(result);
    }
}
