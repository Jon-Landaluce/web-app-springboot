package com.keepcoding.web.mvc.servicio;

import java.util.List;

import com.keepcoding.web.mvc.entity.Empleado;

public interface EmpleadoService {
	
	public List<Empleado> listarEmpleados();
	
	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado obtenerEmpleadoPorId(Long id);
	
	public void eliminarEmpleado(Long id);
}
