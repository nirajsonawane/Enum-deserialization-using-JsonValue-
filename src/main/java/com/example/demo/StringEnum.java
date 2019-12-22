package com.example.demo;

import com.fasterxml.jackson.annotation.JsonValue;

public enum  StringEnum {

    FIRST("first"),SECOND("second");
    @JsonValue
    private final String stringValue;

    StringEnum(String second) {
        this.stringValue=second;
    }
}
