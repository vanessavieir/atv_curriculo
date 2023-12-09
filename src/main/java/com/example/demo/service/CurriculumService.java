package com.example.demo.service;

import com.example.demo.model.Curriculum;
import com.example.demo.repository.CurriculumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CurriculumService {

    @Autowired
    private CurriculumRepository curriculumRepository;

    public List<Curriculum> getAllCurriculums() {
        return curriculumRepository.findAll();
    }

    public Optional<Curriculum> getCurriculumById(Long id) {
        return curriculumRepository.findById(id);
    }

    public Curriculum createCurriculum(Curriculum curriculum) {
        return curriculumRepository.save(curriculum);
    }

    public Optional<Curriculum> updateCurriculum(Long id, Curriculum updatedCurriculum) {
        Optional<Curriculum> existingCurriculum = curriculumRepository.findById(id);

        existingCurriculum.ifPresent(curriculum -> {
            curriculum.setNome(updatedCurriculum.getNome());
            curriculum.setTitulo(updatedCurriculum.getTitulo());
            curriculum.setEndereco(updatedCurriculum.getEndereco());
            curriculum.setTelefone(updatedCurriculum.getTelefone());
            curriculum.setEmail(updatedCurriculum.getEmail());
            curriculum.setObjetivoProfissional(updatedCurriculum.getObjetivoProfissional());
            curriculum.setExperiencia(updatedCurriculum.getExperiencia());
            curriculum.setEducacao(updatedCurriculum.getEducacao());
            curriculum.setHabilidades(updatedCurriculum.getHabilidades());
            curriculum.setIdiomas(updatedCurriculum.getIdiomas());
            curriculumRepository.save(curriculum);
        });

        return existingCurriculum;
    }

    public void deleteCurriculum(Long id) {
        curriculumRepository.deleteById(id);
    }
}
