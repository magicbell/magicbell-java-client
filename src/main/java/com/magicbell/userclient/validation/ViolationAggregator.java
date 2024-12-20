package com.magicbell.userclient.validation;

import com.magicbell.userclient.validation.exceptions.ValidationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViolationAggregator {

  List<Violation> violations = new ArrayList<>();

  public <T> ViolationAggregator add(Violation[] violations) {
    this.violations.addAll(Arrays.asList(violations));
    return this;
  }

  public Violation[] aggregate() {
    return violations.toArray(new Violation[0]);
  }

  public void validateAll() {
    if (!violations.isEmpty()) {
      throw new ValidationException(aggregate());
    }
  }
}
