package com.keepcoding.web.mvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.keepcoding.web.mvc.entity.Empleado;

@Repository
public interface EmpleadoRepository  extends JpaRepository<Empleado, Long>{

}
