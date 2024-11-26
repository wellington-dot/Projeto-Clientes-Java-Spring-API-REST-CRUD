package com.desafiocrud.clientes.dto;

public class FieldMessageErrors {

    private String field;
    private String message;

    public FieldMessageErrors(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public String getMessage() {
        return message;
    }

}
