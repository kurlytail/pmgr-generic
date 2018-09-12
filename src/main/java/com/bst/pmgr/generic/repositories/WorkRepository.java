package com.bst.pmgr.generic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.generic.entities.Work;
import com.google.common.base.Optional;

@RepositoryRestResource
public interface WorkRepository extends CrudRepository<Work, Long> {
	Optional<Work> findByName(final String name);
}
