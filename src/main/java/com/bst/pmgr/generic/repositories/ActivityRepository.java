package com.bst.pmgr.generic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.generic.entities.Activity;

@RepositoryRestResource
public interface ActivityRepository extends CrudRepository<Activity, Long> {
}
