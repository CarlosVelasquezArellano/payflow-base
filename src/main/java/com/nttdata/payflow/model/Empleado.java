package com.nttdata.payflow.model;

/**
 * Clase base de todos los tipos de empleado.
 */
// TODO 1: convierte la clase en abstracta (no debe poder instanciarse).
public class Empleado {

    // TODO 2: encapsula los atributos: deben ser private y final.
    String id;
    String nombre;
    Area area;

    // TODO 3: valida (RN-01) y lanza IllegalArgumentException si:
    //         id o nombre son null o están vacíos, o area es null.
    protected Empleado(String id, String nombre, Area area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
    }

    // TODO 4: convierte estos dos métodos en abstractos (sin cuerpo).
    public double calcularPagoMensual() {
        return 0;
    }

    public String getTipo() {
        return "Empleado";
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Area getArea() {
        return area;
    }
}
