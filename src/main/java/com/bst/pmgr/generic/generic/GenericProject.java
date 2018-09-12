package com.bst.pmgr.generic.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.generic.entities.Project;

@Entity
@DiscriminatorValue("generic-project")
public class GenericProject extends Project {

}
