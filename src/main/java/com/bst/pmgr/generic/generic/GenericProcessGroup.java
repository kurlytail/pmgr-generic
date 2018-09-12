package com.bst.pmgr.generic.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.generic.entities.ProcessGroup;

@Entity
@DiscriminatorValue("Generic")
public class GenericProcessGroup extends ProcessGroup {

}
