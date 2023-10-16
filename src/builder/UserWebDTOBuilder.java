package builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
//TODO implement builder
public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;

	private String age;

	private String addressAStr;

	private UserWebDTO dto;

	@Override
	public UserDTOBuilder withFirstName(String fname) {

		firstName = fname;

		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lname) {

		lastName = lname;
		return this;
	}

	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {

		Period ageInYears = Period.between(date, LocalDate.now());

		String age = ageInYears.toString();

		this.age = age;

		return this;
	}

	@Override
	public UserDTOBuilder withAddress(Address address) {

		addressAStr = String.format("%s, %s, %s, %s (%s)", address.getHouseNumber(), address.getCity(),
				address.getState(), address.getStreet(), address.getZipcode());

		return this;
	}

	@Override
	public UserDTO build() {

		dto = new UserWebDTO(firstName + " " + lastName, addressAStr, age);

		return dto;
	}

	@Override
	public UserDTO getUserDTO() {

		return dto;
	}

}
