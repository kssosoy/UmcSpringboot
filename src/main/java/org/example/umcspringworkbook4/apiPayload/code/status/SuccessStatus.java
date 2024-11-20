package org.example.umcspringworkbook4.apiPayload.code.status;

import org.example.umcspringworkbook4.apiPayload.code.BaseCode;
import org.example.umcspringworkbook4.apiPayload.code.ReasonDTO;
import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SuccessStatus implements BaseCode {
	_OK(HttpStatus.OK, "COMMON200", "성공입니다.");
	private final HttpStatus httpStatus;
	private final String code;
	private final String message;

	@Override
	public ReasonDTO getReason(){
		return ReasonDTO.builder()
			.message(message)
			.code(code)
			.isSuccess(true)
			.build();

	}

	@Override
	public ReasonDTO getReasonHttpStatus(){
		return ReasonDTO.builder()
			.message(message)
			.code(code)
			.isSuccess(true)
			.httpStatus(httpStatus)
			.build();
	}
}
