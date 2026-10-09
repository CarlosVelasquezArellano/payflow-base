package com.nttdata.payflow.model;

/**
 * Empleado con sueldo fijo mensual.
 */
// TODO 5: implementa la interfaz Bonificable.
public class EmpleadoPlanilla extends Empleado {

    // TODO 6: declara los atributos privados y finales: sueldoBase, tieneHijos y evaluacion.

    public EmpleadoPlanilla(String id, String nombre, Area area,
                            double sueldoBase, boolean tieneHijos, int evaluacion) {
        super(id, nombre, area);
        // TODO 7: valida sueldoBase > 0 y evaluacion entre 1 y 5 (IllegalArgumentException)
        //         y asigna los atributos.
    }

    // TODO 8 (RN-03): bono = 10% del sueldo base si la evaluación es 4 o 5; en otro caso, 0.
    public double calcularBono() {
        throw new UnsupportedOperationException("TODO 8");
    }

    // TODO 9 (RN-02): pago = sueldo base + asignación familiar (100.00 si tiene hijos) + bono.
    @Override
    public double calcularPagoMensual() {
        throw new UnsupportedOperationException("TODO 9");
    }

    // TODO 10: getTipo() debe devolver "Planilla" y getSueldoBase() el sueldo base.
    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("TODO 10");
    }

    public double getSueldoBase() {
        throw new UnsupportedOperationException("TODO 10");
    }
}
