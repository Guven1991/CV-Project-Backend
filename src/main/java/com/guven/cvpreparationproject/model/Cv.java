package com.guven.cvpreparationproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cv")
public class Cv {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",unique = true, nullable = false, length = 100)
    private String name;

    @Column(name = "last_name", nullable = false, length = 100)
    private String lastname;

    @Column(name = "phone", nullable = false, length = 100)
    private String phone;

    @Column(name = "email", unique = true, nullable = false, length = 100)
    private String email;

    @Column(name = "education", nullable = false, length = 100)
    private String education;

    @Column(name = "work_experience", nullable = false, length = 100)
    private Integer workExperience;

    @Column(name = "professional_skills ", nullable = false, length = 100)
    private String professionalSkills;
}
