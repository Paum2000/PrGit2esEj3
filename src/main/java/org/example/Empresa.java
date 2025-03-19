package org.example;

public class Empresa {
    public static void main(String[] args) {
        Empleado e1= new Empleado("Juan", 33, 25000.6 );
        System.out.println(e1);
        String nombre = "Informática";
        Departamento d1= new Departamento(nombre);
        d1.setNombre("Informática");
        d1.setNumEmpleados(25);
        d1.setNumEmpleados(d1.getNumEmpleados()+1);
        d1.anadir(e1);
        System.out.println(d1);
    }
}
