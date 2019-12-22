package com.example.demo;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum IntEnum {
    ONE(1), TEN(10);

    @JsonValue
    private final int intValue;

    IntEnum(int i) {
        this.intValue = i;
    }

    @JsonCreator
    public static IntEnum fromNumber(int number) {
        for (IntEnum b : IntEnum.values()) {
            if (b.intValue == number) {
                return b;
            }
        }
        return null;
    }

}
