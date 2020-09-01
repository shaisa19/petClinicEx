package com.springframework.sample.sfgpetclinic.services;

import com.springframework.sample.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
