package com.guven.cvpreparationproject.controller;

import com.guven.cvpreparationproject.model.Cv;
import com.guven.cvpreparationproject.service.ICvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cv")
public class CvController {

    @Autowired
    private ICvService cvService;

    @PostMapping
    public ResponseEntity<?> saveCv (@RequestBody Cv cv){
        return  new ResponseEntity<>(cvService.saveCv(cv), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAllCv(Pageable page){
        return new ResponseEntity<>(cvService.findAllCv(page), HttpStatus.OK);
    }

    @GetMapping("{cvId}")
    public ResponseEntity<?> findByIdCv(@PathVariable Long cvId){
        return new ResponseEntity<>(cvService.findByIdCv(cvId), HttpStatus.OK);

    }

    //    @DeleteMapping("{cvId}")
//    public ResponseEntity<?> deleteCv(@PathVariable Long cvId){
//        cvService.deleteCv(cvId);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

//    @PutMapping("{cvId}")
//    public ResponseEntity<?> updateCv(@PathVariable Long cvId){
//
//
//    }



}
