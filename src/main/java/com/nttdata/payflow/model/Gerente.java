package com.nttdata.payflow.model;

/**
 * Un gerente es un empleado de planilla con bono de gestión.
 */
// TODO 15: un Gerente ES UN EmpleadoPlanilla: cambia la herencia y llama al constructor
//          correcto con super(...). Luego ELIMINA calcularPagoMensual() de esta clase:
//          el cálculo del pago se hereda de EmpleadoPlanilla.
public class Gerente extends Empleado {

    public Gerente(String id, String nombre, Area area,
                   double sueldoBase, boolean tieneHijos, int evaluacion) {
        super(id, nombre, area);
    }

    @Override
    public double calcularPagoMensual() {
        throw new UnsupportedOperationException("TODO 15");
    }

    // TODO 16 (RN-05): sobrescribe calcularBono(): bono del padre + 20% del sueldo base.

    // TODO 17: debe devolver "Gerente".
    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("TODO 17");
    }
}
