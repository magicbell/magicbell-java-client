package com.magicbell.magicbelluserclient.validation.validators;

import com.magicbell.magicbelluserclient.validation.Violation;
import lombok.Getter;

public abstract class AbstractValidator<T> implements Validator<T> {

  @Getter
  private String fieldName;

  @Getter
  private boolean isRequired = false;

  public AbstractValidator(String fieldName) {
    this.fieldName = fieldName;
  }

  public AbstractValidator() {
    this.fieldName = "";
  }

  public AbstractValidator<T> required() {
    this.isRequired = true;
    return this;
  }

  public AbstractValidator<T> optional() {
    this.isRequired = false;
    return this;
  }

  public AbstractValidator<T> setFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  protected Violation validateRequired(T value) {
    if (isRequired() && value == null) {
      return new Violation(getFieldName(), "is required");
    }
    return null;
  }
}
