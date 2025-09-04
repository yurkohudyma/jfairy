
package com.devskiller.jfairy.producer.person.locale.uk;

import com.devskiller.jfairy.producer.person.locale.ContinentalAddress;

public class UkAddress extends ContinentalAddress {

	public UkAddress(String street, String streetNumber, String apartmentNumber, String postalCode, String city) {
		super(street, streetNumber, apartmentNumber, postalCode, city);
	}

	@Override
	protected String getApartmentMark() {
		return ", ";
	}
}
