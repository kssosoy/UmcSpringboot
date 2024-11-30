package org.example.umcspringworkbook4.validation.validator;

import org.example.umcspringworkbook4.apiPayload.code.status.ErrorStatus;
import org.example.umcspringworkbook4.domain.Store;
import org.example.umcspringworkbook4.repository.StoreRepository.StoreRepository;
import org.example.umcspringworkbook4.validation.annotation.ExistStore;
import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class StoresExistValidator implements ConstraintValidator<ExistStore, Long> {
	private final StoreRepository storeRepository;
	@Override
	public void initialize(ExistStore constraintAnnotation) {
		ConstraintValidator.super.initialize(constraintAnnotation);
	}

	@Override
	public boolean isValid(Long storeId, ConstraintValidatorContext context) {
		if (storeId == null) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("Store ID cannot be null.")
				.addConstraintViolation();
			return false;
		}

		boolean isValid = storeRepository.existsById(storeId);

		if (!isValid) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(ErrorStatus.STORE_NOT_FOUND.toString()).addConstraintViolation();
		}

		return isValid;
	}
}
