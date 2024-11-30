package org.example.umcspringworkbook4.validation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.example.umcspringworkbook4.validation.validator.CheckStatusValidator;
import org.example.umcspringworkbook4.validation.validator.StoresExistValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = CheckStatusValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckStatus {
	String message() default "이미 도전중인 미션입니다.";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {};
}
