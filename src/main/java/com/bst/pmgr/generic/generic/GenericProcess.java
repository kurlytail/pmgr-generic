package com.bst.pmgr.generic.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.generic.entities.Process;

@Entity
@DiscriminatorValue("Generic")
public class GenericProcess extends Process {

}
