package com.riwi.learning.infrastructure.helpers;

import com.riwi.learning.utils.exceptions.BadRequestException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public class ServiceHelpers {

    public <Entity, ID> Object find(ID id, JpaRepository<Entity, ID> repository, String name) {
        return repository.findById(id).orElseThrow(()-> new BadRequestException(name));
    }
}
