package com.nttdata.payflow.servicio;

import com.nttdata.payflow.model.Area;
import com.nttdata.payflow.model.Boleta;
import com.nttdata.payflow.model.Empleado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * La nómina contiene y administra a los empleados.
 */
public class Nomina {
    private final List<Empleado> empleados = new ArrayList<>();

    // TODO 18 (RN-07): si ya existe un empleado con el mismo id, lanza IllegalArgumentException.
    public void agregar(Empleado empleado) {
        for (Empleado existente : empleados) {
            if (existente.getId().equals(empleado.getId())) {
                throw new IllegalArgumentException("Ya existe un empleado con el id " + empleado.getId());
            }
        }
        empleados.add(empleado);
    }

    // TODO 19: protege la lista interna: devuelve una vista de solo lectura.
    public List<Empleado> getEmpleados() {
        return Collections.unmodifiableList(empleados);
    }

    // TODO 20: suma el pago mensual de todos los empleados (usa polimorfismo, sin instanceof).
    public double totalNomina() {
        double total = 0;
        for (Empleado empleado : empleados) {
            total += empleado.calcularPagoMensual();
        }
        return total;
    }

    // TODO 20: suma el pago mensual de los empleados del área indicada.
    public double totalPorArea(Area area) {
        double total = 0;
        for (Empleado empleado : empleados) {
            if (empleado.getArea() == area) {
                total += empleado.calcularPagoMensual();
            }
        }
        return total;
    }

    // TODO 21 (RN-08): crea una Boleta por empleado (id, nombre, tipo, pago), en el orden de registro.
    public List<Boleta> generarBoletas() {

        List<Boleta> boletas = new ArrayList<>();

        for (Empleado e : empleados) {
            boletas.add(new Boleta(
                    e.getId(),
                    e.getNombre(),
                    e.getTipo(),
                    e.calcularPagoMensual()
            ));
        }
        return boletas;
    }
}
