package com.unicrom.babycare.domain.utilities;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * @author Georman
 *
 */
@Converter(autoApply=true)
public class BooleanToIntegerConverter implements AttributeConverter<Boolean, Integer> {

	public Integer convertToDatabaseColumn(Boolean attribute) {
		if(Boolean.TRUE.equals(attribute)){
			return 1;
		}else{
			return 0;
		}
		
	}

	public Boolean convertToEntityAttribute(Integer dbData) {

		if(dbData.equals(1)){
			return Boolean.TRUE.booleanValue();
		}else{
			return Boolean.FALSE.booleanValue();
		}
		
		
	}

}
