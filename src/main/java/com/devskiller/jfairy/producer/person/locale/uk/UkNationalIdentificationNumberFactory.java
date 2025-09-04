package com.devskiller.jfairy.producer.person.locale.uk;

import com.devskiller.jfairy.producer.BaseProducer;
import com.devskiller.jfairy.producer.DateProducer;
import com.devskiller.jfairy.producer.person.NationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.NationalIdentificationNumberProperties;
import com.devskiller.jfairy.producer.person.NationalIdentificationNumberProvider;
import com.devskiller.jfairy.producer.person.locale.pl.PlNationalIdentificationNumberProvider;

import javax.inject.Inject;

public class UkNationalIdentificationNumberFactory implements NationalIdentificationNumberFactory {

	private final BaseProducer baseProducer;
	private final DateProducer dateProducer;

	@Inject
	public UkNationalIdentificationNumberFactory(BaseProducer baseProducer, DateProducer dateProducer) {
		this.baseProducer = baseProducer;
		this.dateProducer = dateProducer;
	}

	@Override
	public UkNationalIdentificationNumberProvider produceNationalIdentificationNumberProvider(NationalIdentificationNumberProperties.Property... properties) {
		return new UkNationalIdentificationNumberProvider(dateProducer, baseProducer, properties);
	}

}
