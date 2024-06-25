package fr.afpa.employees;
import java.time.LocalDate;

/*
Objectif :
L’objectif de ce TP est de concevoir un programme en console basé sur une approche objet et
permettant de gérer (vraiment très basiquement) des salariés d’une entreprise.

Vous allez écrire une classe représentant les salariés d'une entreprise.
Vous pourrez vous aider du PDF disponible sur pour obtenir des informations sur la façon de faire.
*/
// on est passé de 30 à 15 erreurs c'est déjà ça :'(
class Employee {
	/**
	 * Matricule de l'employé + attributs
	 */
	private String registrationNumber;
	private String lastName;
	private String firstName;
	// ici on ne met pas int on met double car on peut avoir une valeur à virgule
	private double saLary;
	private static final int socialParticipation = 30;
	// ici on met l'attribut pour la date d'anniversaire
	private LocalDate birthDay;

	// comment implémenter les données de chacun ? on doit faire reginum1 par
	// exemple ?
	// compléter le constructeur de la classe (ça m'a l'air bon)
	// constructeur de la classe
	public Employee(String registrationNumber, String lastName, String firstName, double saLary) {
		this.registrationNumber = registrationNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.saLary = saLary;
		//  la classe localDate nous permet de manipuler des dates 
		this.birthDay = LocalDate.parse(birthDay);
	}

	// compléter les attributs comme présenté dans le PDF done je crois
	// est-ce qu'ici le code sait à qui appartient les informations ?
	// // Employee employee1 = new Employee("123456", "Jebot", "Thomas", "1800",
	// "0.3");
	// Employee employee2 = new Employee("654321", "Tobej", "Samoht", "3000",
	// "0.3");
	// Employee employee3 = new Employee("153426", "Komta", "Karine", "2600",
	// "0.3");
	// Employee employee4 = new Employee("426153", "Atmok", "Enirak", "3300",
	// "0.3");

	// implémenter les setters et getters de la classe permet d'accéder aux
	// attributs privés (m'a l'air bon ? )

	// 1) Getters :

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public double getSaLary() {
		return saLary;
	}

	public int getSocialParticipation1() {
		return socialParticipation;
	}

	public String getFirstName() {
		return firstName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	// 2) Setters :
	public void setRegistrationNumber(String registrationNumber) {
		// throws Exception
		this.registrationNumber = registrationNumber;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSaLary(int saLary) {
		this.saLary = saLary;
	}

	public void setSocialParticipation(int socialParticipation) {
		this.socialParticipation = socialParticipation;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setBirthDay(String birthDay) throws Exception {
		if (!checkDateFormat(birthDay)) {
			throw new Exception("Le format de la date est incorrect. Utilisez le format AAAA-MM-JJ.");
		}
		this.birthDay = LocalDate.parse(birthDay);
	}

	// ajouter les getters et les setters

	// public Employee(String registrationNumber, String lastName, String firstName,
	// int saLary) {
	// this.registrationNumber = registrationNumber;
	// this.lastName = lastName;
	// this.firstName = firstName;
	// this.saLary = saLary;
	// }

	@Override
	public String toString() {

		return "Employee { "
				+ " \nMatricule " + getRegistrationNumber()
				// + "\nverifie le matricule "+ checkRegistrationNumber(registrationNumber)
				+ " \nNom " + getLastName()
				+ " \nPrenom " + getFirstName()
				+ " \nSalaire " + getSalary()
				// + " \nDate d'anniversaire " + getBirthDay()
				// + "\nSalaire net " + netSalary()
				// + "\nJours avant prochain anniversaire " + daysBeforeBirthday()
				+ '}';
	}

	// méthode pour uniquement le nom + prénom ?
	public Employee(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		System.out.println(lastName + firstName);
	}

	// méthode pour obtenir le salaire net du salaire brut
	public double toNetsalary() {
		return this.saLary - this.saLary * (socialParticipation / 100);
	}
}
// public String toString(){
// return "Employee [registrationNumber=" + registrationNumber + ", lastName=" +
// lastName +", firstName=" + firstName +", saLaray=" + salary +",
// socialParticipation=" + socialParticipation +"]";

// implémenter la méthode "toString()" qui renvoie une chaîne de caractère
// qui représente un objet de la classe employé
// plus d'information sur la méthode "toString()" ->
// https://codegym.cc/fr/groups/posts/fr.986.mthode-java-tostring
