package com.devskiller.jfairy;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.RandomGenerator;
import com.devskiller.jfairy.producer.VATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.company.locale.sv.SvVATIdentificationNumberProvider;
import com.devskiller.jfairy.producer.person.*;
import com.devskiller.jfairy.producer.person.locale.sv.SvAddressProvider;
import com.devskiller.jfairy.producer.person.locale.sv.SvNationalIdentificationNumberFactory;
import com.devskiller.jfairy.producer.person.locale.sv.SvNationalIdentityCardNumberProvider;
import com.devskiller.jfairy.producer.person.locale.sv.SvPassportNumberProvider;

public class SvFairyModule extends FairyModule {

	public SvFairyModule(DataMaster dataMaster, RandomGenerator randomGenerator) {
		super(dataMaster, randomGenerator);
	}

	@Override
	protected void configure() {
		super.configure();
		bind(NationalIdentificationNumberFactory.class).to(SvNationalIdentificationNumberFactory.class);
		bind(NationalIdentityCardNumberProvider.class).to(SvNationalIdentityCardNumberProvider.class);
		bind(VATIdentificationNumberProvider.class).to(SvVATIdentificationNumberProvider.class);
		bind(AddressProvider.class).to(SvAddressProvider.class);
		bind(PassportNumberProvider.class).to(DefaultPassportNumberProvider.class);
	}

}
