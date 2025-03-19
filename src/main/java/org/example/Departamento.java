package org.example;


import lombok.Data;

public @Data class Departamento {
    private String nombre;
    private int numEmpleados;
    private Empleado[] empleados = new Empleado[2];
    void anadir(Empleado v){
        empleados[0]=v;
    }
    Departamento(String nombre) {}
}