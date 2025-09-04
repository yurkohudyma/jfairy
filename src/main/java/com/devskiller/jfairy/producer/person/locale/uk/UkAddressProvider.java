package com.devskiller.jfairy.producer.person.locale.uk;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.BaseProducer;
import com.devskiller.jfairy.producer.person.AbstractAddressProvider;

import javax.inject.Inject;

public class UkAddressProvider extends AbstractAddressProvider {

	@Inject
	public UkAddressProvider(DataMaster dataMaster, BaseProducer baseProducer) {
		super(dataMaster, baseProducer);
	}

	@Override
	public UkAddress get() {
		return new UkAddress(getStreet(), getStreetNumber(), getApartmentNumber(),
				getPostalCode(), getCity());
	}

}
