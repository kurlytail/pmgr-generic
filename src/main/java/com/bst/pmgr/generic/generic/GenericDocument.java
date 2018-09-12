package com.bst.pmgr.generic.generic;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.bst.pmgr.generic.entities.Document;

@Entity
@DiscriminatorValue("Generic")
public class GenericDocument extends Document {

}
