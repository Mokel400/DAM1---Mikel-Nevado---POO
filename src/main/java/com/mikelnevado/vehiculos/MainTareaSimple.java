package com.mikelnevado.vehiculos;

public class MainTareaSimple {

	public static void main(String args[]) {

		TareaSimple tarea1 = new TareaSimple("Poner la lavadora", false, 20);
		TareaSimple tarea2 = new TareaSimple();

		System.out.println(tarea1.getTitulo());
		System.out.println(tarea1.isCompletada());
		System.out.println(tarea1.getTiempo());
		System.out.println("----------------------");
		System.out.println(tarea2.getTitulo());
		System.out.println(tarea2.isCompletada());
		System.out.println(tarea2.getTiempo());

		tarea1.mostrarTarea();

		tarea1.setTitulo("Tender");
		System.out.println(tarea1.getTitulo());
		tarea1.mostrarTarea();
	}
}
