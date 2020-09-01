package com.springframework.sample.sfgpetclinic.services;

import com.springframework.sample.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
