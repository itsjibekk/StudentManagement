package com.example.ships.controllers;

import com.example.ships.services.TaskService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/query")
public class QueryController {
    private final TaskService taskService;

    public QueryController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/run")
    public Object run(@RequestParam("battle_result") String result){
        return taskService.run(result);
    }
}
