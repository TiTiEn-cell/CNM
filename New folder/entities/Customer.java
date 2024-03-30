package entities;

import java.time.LocalDate;
import java.util.List;

public class Customer {
	private String customerId;
	private String firstName;
	private String lastName;
	private String emailName;
	private Address address;
	private LocalDate registrationDate;
	private List<Phone> phones;

	public Customer() {
	}

	/**
	 * 
	 * @param customerId
	 * @param firstName
	 * @param lastName
	 * @param emailName
	 * @param address
	 * @param registrationDate
	 * @param phones
	 */
	public Customer(String customerId, String firstName, String lastName, LocalDate registrationDate) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;		
		this.registrationDate = registrationDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailName() {
		return emailName;
	}

	public void setEmailName(String emailName) {
		this.emailName = emailName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", emailName=" + emailName + ", address=" + address + ", registrationDate=" + registrationDate
				+ ", phones=" + phones + "]";
	}
}
