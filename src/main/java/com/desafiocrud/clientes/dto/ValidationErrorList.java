package com.desafiocrud.clientes.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationErrorList extends CustomError{

    List<FieldMessageErrors> fieldMessageErrorsList = new ArrayList<>();

    public ValidationErrorList(Instant timestamp, int status, String error, String path) {
        super(timestamp, status, error, path);
    }

    public List<FieldMessageErrors> getFieldMessageErrorsList() {
        return fieldMessageErrorsList;
    }

    public void addErrors(String fieldName, String message) {
        fieldMessageErrorsList.add(new FieldMessageErrors(fieldName, message));
    }
}
