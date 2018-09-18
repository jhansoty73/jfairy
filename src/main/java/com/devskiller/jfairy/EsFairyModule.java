package com.devskiller.jfairy;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.RandomGenerator;
import com.devskiller.jfairy.producer.VATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.company.locale.es.EsVATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.person.*;
import com.devskiller.jfairy.producer.person.locale.NoNationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.locale.es.EsAddressProvider;
import com.devskiller.jfairy.producer.person.locale.es.EsNationalIdentityCardNumberProvider;
import com.devskiller.jfairy.producer.person.locale.es.EsPassportNumberProvider;

/**
 * @author graux
 * @since 26.04.15
 */
public class EsFairyModule extends FairyModule {

	public EsFairyModule(DataMaster dataMaster, RandomGenerator randomGenerator) {
		super(dataMaster, randomGenerator);
	}

	@Override
	protected void configure() {
		super.configure();
		bind(NationalIdentificationNumberFactory.class).to(NoNationalIdentificationNumberFactory.class);
		bind(NationalIdentityCardNumberProvider.class).to(EsNationalIdentityCardNumberProvider.class);
		bind(VATIdentificationNumberProvider.class).to(EsVATIdentificationNumberProvider.class);
		bind(AddressProvider.class).to(EsAddressProvider.class);
		bind(PassportNumberProvider.class).to(DefaultPassportNumberProvider.class);
	}
}
