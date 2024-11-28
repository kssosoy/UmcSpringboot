package org.example.umcspringworkbook4.apiPayload.exception.handler;

import org.example.umcspringworkbook4.apiPayload.code.BaseErrorCode;
import org.example.umcspringworkbook4.apiPayload.exception.GeneralException;

public class StoreHandler extends GeneralException {
	public StoreHandler(BaseErrorCode errorCode) {
		super(errorCode);
	}
}
