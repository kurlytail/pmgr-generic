package com.bst.pmgr.generic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bst.pmgr.generic.entities.Project;
import com.google.common.base.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	Optional<Project> findByName(final String name);
}
