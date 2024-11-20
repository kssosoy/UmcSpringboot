package org.example.umcspringworkbook4.apiPayload.exception.handler;

import org.example.umcspringworkbook4.apiPayload.code.BaseErrorCode;
import org.example.umcspringworkbook4.apiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

	public TempHandler(BaseErrorCode errorCode) {
		super(errorCode);
	}
}
