package fr.afpa.employees;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class EmployeeMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		//  instanciez 4 objets de la classe "Employee" (une fois celle-ci implémentée)
		Employee employee1 = new Employee("123456", "Jebot", "Thomas", "1800", "0.3");
		Employee employee2 = new Employee("654321", "Tobej", "Samoht", "3000", "0.3");
		Employee employee3 = new Employee("153426", "Komta", "Karine", "2600", "0.3");
		Employee employee4 = new Employee("426153", "Atmok", "Enirak", "3300", "0.3");
	
		//  afficher les informations des employés avec System.out.println
		System.out.println("voilà les données du premier employé" + employee1 );
	    System.out.println("voilà les données du deuxième employé" + employee2 );
	    System.out.println("voilà les données du troisième employé" + employee3 );
	    System.out.println("voilà les données du quatrième employé"+ employee4 );
	}
}

