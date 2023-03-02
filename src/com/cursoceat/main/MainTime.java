package com.cursoceat.main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainTime {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);
		System.out.println("Descanso: " + ahora.getMinute());
		// A la hora actual le sumamos 10 segundos
		for (int i = 1; i <= 10; i++) {
			ahora = ahora.plus(1, ChronoUnit.SECONDS);
			System.out.println(ahora);
		}
		// Desglosamos la hora en hora, minutos y segundos aplicando métodos
		int hora = ahora.getHour();  // Me lo pasa a entero
		int minutos = ahora.getMinute();
		int segundos = ahora.getSecond();
		// Restamos 10 horas a la hora actual
		ahora = LocalTime.now();
		for (int i = 1; i <= 10; i++) {
			ahora = ahora.minus(1, ChronoUnit.HOURS);
			System.out.println(ahora);
		}
		// El pattern si quiero mostrar los milisegundos hh:mm:ss:SSS
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("hh:mm:ss");
		System.out.println("La hora actual formateada es " + LocalTime.now().format(formato));
		
		
	}
	

}
