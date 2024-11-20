package org.example.umcspringworkbook4.service.TempService;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.apiPayload.exception.handler.TempHandler;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{
	@Override
	public void CheckFlag(Integer flag){
		if (flag==1)
			throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
	}
}
