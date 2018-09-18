package com.devskiller.jfairy.producer.person;

import javax.inject.Inject;

import com.devskiller.jfairy.data.DataMaster;
import com.devskiller.jfairy.producer.BaseProducer;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;
import org.apache.commons.lang3.RandomStringUtils;

public class DefaultPassportNumberProvider implements PassportNumberProvider {

	@VisibleForTesting
	String PASSPORT_NUMBER_FORMAT = "passport_number_format";

	private DataMaster dataMaster;
	private BaseProducer baseProducer;

	@Inject
	public DefaultPassportNumberProvider(DataMaster dataMaster, BaseProducer baseProducer) {
		this.dataMaster = dataMaster;
		this.baseProducer = baseProducer;
	}

	@Override
	public String get() {
		String passportNumberFormat = dataMaster.getString(PASSPORT_NUMBER_FORMAT);
		if (Strings.isNullOrEmpty(passportNumberFormat)) {
			return RandomStringUtils.randomAlphanumeric(9).toUpperCase();
		}
		else {
			return baseProducer.bothify(passportNumberFormat).toUpperCase();
		}
	}
}
