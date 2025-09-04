package com.devskiller.jfairy;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.RandomGenerator;
import com.devskiller.jfairy.producer.VATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.company.locale.uk.UKVATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.person.AddressProvider;
import com.devskiller.jfairy.producer.person.NationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.NationalIdentityCardNumberProvider;
import com.devskiller.jfairy.producer.person.PassportNumberProvider;
import com.devskiller.jfairy.producer.person.locale.uk.UkAddressProvider;
import com.devskiller.jfairy.producer.person.locale.uk.UkNationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.locale.uk.UkNationalIdentityCardNumberProvider;
import com.devskiller.jfairy.producer.person.locale.uk.UkPassportNumberProvider;

public class UkFairyModule extends FairyModule {
	public UkFairyModule(DataMaster dataMaster, RandomGenerator randomGenerator) {
		super(dataMaster, randomGenerator);
	}

	@Override
	protected void configure() {
		super.configure();
		bind(NationalIdentificationNumberFactory.class).to(UkNationalIdentificationNumberFactory.class);
		bind(NationalIdentityCardNumberProvider.class).to(UkNationalIdentityCardNumberProvider.class);
		bind(VATIdentificationNumberProvider.class).to(UKVATIdentificationNumberProvider.class);
		bind(AddressProvider.class).to(UkAddressProvider.class);
		bind(PassportNumberProvider.class).to(UkPassportNumberProvider.class);

	}
}
