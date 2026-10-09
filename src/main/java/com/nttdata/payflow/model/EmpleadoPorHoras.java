package com.nttdata.payflow.model;

/**
 * Empleado que cobra por horas trabajadas.
 */
public class EmpleadoPorHoras extends Empleado {

    // TODO 11: declara los atributos privados tarifaHora (final) y horasTrabajadas.
    //          En el constructor valida tarifaHora > 0 (IllegalArgumentException).

    public EmpleadoPorHoras(String id, String nombre, Area area, double tarifaHora) {
        super(id, nombre, area);
    }

    // TODO 12: registra las horas; si son negativas lanza IllegalArgumentException.
    public void registrarHoras(int horas) {
        throw new UnsupportedOperationException("TODO 12");
    }

    // TODO 13 (RN-04): hasta 160 horas se pagan a la tarifa normal;
    //          las horas que superan 160 se pagan al 150% de la tarifa.
    @Override
    public double calcularPagoMensual() {
        throw new UnsupportedOperationException("TODO 13");
    }

    // TODO 14: debe devolver "Por horas".
    @Override
    public String getTipo() {
        throw new UnsupportedOperationException("TODO 14");
    }
}
