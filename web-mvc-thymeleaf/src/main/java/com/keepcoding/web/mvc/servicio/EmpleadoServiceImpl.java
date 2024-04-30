package com.keepcoding.web.mvc.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keepcoding.web.mvc.dao.EmpleadoRepository;
import com.keepcoding.web.mvc.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	@Override
	public List<Empleado> listarEmpleados() {
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return empleadoRepository.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		return empleadoRepository.findById(id).get();
	}

	@Override
	public void eliminarEmpleado(Long id) {
		empleadoRepository.deleteById(id);
		
	}

}
