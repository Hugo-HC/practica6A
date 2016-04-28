package edu.uacm.domain;

import org.springframework.data.repository.CrudRepository;

public interface VehiculoRepository extends CrudRepository<Vehiculo, Long> {

}

/*
new = ServiceImp(); No porque spring ya lo hace
 

@Autowired
Service
*/