package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;

public @Data @AllArgsConstructor class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;


}

