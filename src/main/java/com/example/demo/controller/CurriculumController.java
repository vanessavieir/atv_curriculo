package com.example.demo.controller;

import com.example.demo.model.Curriculum;
import com.example.demo.service.CurriculumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculumController {

    @Autowired
    private CurriculumService curriculumService;

    @GetMapping
    public List<Curriculum> getAllCurriculums() {
        return curriculumService.getAllCurriculums();
    }

    @GetMapping("/{id}")
    public Optional<Curriculum> getCurriculumById(@PathVariable Long id) {
        return curriculumService.getCurriculumById(id);
    }

    @PostMapping
    public Curriculum createCurriculum(@RequestBody Curriculum curriculum) {
        return curriculumService.createCurriculum(curriculum);
    }

    @PutMapping("/{id}")
    public Optional<Curriculum> updateCurriculum(@PathVariable Long id, @RequestBody Curriculum curriculum) {
        return curriculumService.updateCurriculum(id, curriculum);
    }

    @DeleteMapping("/{id}")
    public void deleteCurriculum(@PathVariable Long id) {
        curriculumService.deleteCurriculum(id);
    }
}
