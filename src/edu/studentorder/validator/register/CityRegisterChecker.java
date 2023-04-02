package edu.studentorder.validator.register;

import edu.studentorder.domain.register.CityRegisterResponse;
import edu.studentorder.domain.Person;
import edu.studentorder.exeption.CityRegisterException;

public interface CityRegisterChecker {
    CityRegisterResponse checkPerson(Person person) throws CityRegisterException;
}
