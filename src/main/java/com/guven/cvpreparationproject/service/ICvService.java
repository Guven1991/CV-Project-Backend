package com.guven.cvpreparationproject.service;

import com.guven.cvpreparationproject.model.Cv;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICvService {
    Cv saveCv(Cv cv);


    Page<Cv> findAllCv(Pageable page);

    Optional<Cv> findByIdCv(Long id);


//    void deleteCv(Long id);
//    Cv updateCv(Cv cv);
}



