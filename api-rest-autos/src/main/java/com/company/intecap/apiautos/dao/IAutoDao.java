package com.company.intecap.apiautos.dao;

import com.company.intecap.apiautos.model.Auto;
import org.springframework.data.repository.CrudRepository;

public interface IAutoDao extends CrudRepository<Auto, Long> {
}
