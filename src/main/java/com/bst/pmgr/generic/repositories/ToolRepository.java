package com.bst.pmgr.generic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.generic.entities.Tool;

@RepositoryRestResource
public interface ToolRepository extends CrudRepository<Tool, Long> {
}
