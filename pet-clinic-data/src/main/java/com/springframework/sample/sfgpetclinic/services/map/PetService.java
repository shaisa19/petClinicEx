package com.springframework.sample.sfgpetclinic.services.map;

import com.springframework.sample.sfgpetclinic.model.Pet;
import com.springframework.sample.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
