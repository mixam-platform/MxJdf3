package com.mixam.mxjdf.sdk;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaperWeightUnit {
    INVALID(0),
    GSM(1),
    LIBRA_COVER(2),
    LIBRA_TEXT(3),
    LIBRA_CARD(4),
    ;

    private final int value;

    PaperWeightUnit(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

}
