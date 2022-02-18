package com.fathur.springboot.test.repo;

import org.springframework.data.repository.CrudRepository;
import com.fathur.springboot.test.model.Identity;


public interface IdentityRepos extends CrudRepository<Identity, Integer>{

}
