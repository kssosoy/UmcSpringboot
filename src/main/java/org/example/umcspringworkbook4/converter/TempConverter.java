package org.example.umcspringworkbook4.converter;

import org.example.umcspringworkbook4.web.dto.TempResponse;

public class TempConverter {
	public static TempResponse.TempTestDTO toTempTestDTO(){
		return TempResponse.TempTestDTO.builder()
			.testString("This is Test!")
			.build();
	}

	public static TempResponse.TempExceptionDTO toTempExceptionDTO(Integer flag){
		return TempResponse.TempExceptionDTO.builder()
			.flag(flag)
			.build();
	}
}
