package com.springframework.sample.sfgpetclinic.services.map;

import com.springframework.sample.sfgpetclinic.model.Owner;
import com.springframework.sample.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long>
implements OwnerService{


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
