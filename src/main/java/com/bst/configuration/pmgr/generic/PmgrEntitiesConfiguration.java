package com.bst.configuration.pmgr.generic;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.bst.pmgr.generic.entities")
@EnableJpaRepositories("com.bst.pmgr.generic.repositories")
public class PmgrEntitiesConfiguration {

}
