package com.guven.cvpreparationproject.service;

import com.guven.cvpreparationproject.model.Cv;
import com.guven.cvpreparationproject.repository.ICvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CvService implements ICvService{

    @Autowired
    private ICvRepository cvRepository;

    @Override
    public Cv saveCv(Cv cv){
        return cvRepository.save(cv);
    }

    @Override
    public Page<Cv> findAllCv(Pageable page){
        return  cvRepository.findAll(page);
    }

    @Override
    public Optional<Cv> findByIdCv(Long id){

        return  cvRepository.findById(id);
    }
}

//    @Override
//    public void deleteCv(Long id){
//        cvRepository.deleteById(id);
//    }

//    @Override
//    public Cv updateCv(Cv cv){
//        return cvRepository.save(cv);
//    }