package com.nttdata.payflow.servicio;

import com.nttdata.payflow.model.Area;
import com.nttdata.payflow.model.Boleta;
import com.nttdata.payflow.model.Empleado;

import java.util.ArrayList;
import java.util.List;

/**
 * La nómina contiene y administra a los empleados.
 */
public class Nomina {
    private final List<Empleado> empleados = new ArrayList<>();

    // TODO 18 (RN-07): si ya existe un empleado con el mismo id, lanza IllegalArgumentException.
    public void agregar(Empleado empleado) {
        empleados.add(empleado);
    }

    // TODO 19: protege la lista interna: devuelve una vista de solo lectura.
    public List<Empleado> getEmpleados() {
        return empleados;
    }

    // TODO 20: suma el pago mensual de todos los empleados (usa polimorfismo, sin instanceof).
    public double totalNomina() {
        throw new UnsupportedOperationException("TODO 20");
    }

    // TODO 20: suma el pago mensual de los empleados del área indicada.
    public double totalPorArea(Area area) {
        throw new UnsupportedOperationException("TODO 20");
    }

    // TODO 21 (RN-08): crea una Boleta por empleado (id, nombre, tipo, pago), en el orden de registro.
    public List<Boleta> generarBoletas() {
        throw new UnsupportedOperationException("TODO 21");
    }
}
