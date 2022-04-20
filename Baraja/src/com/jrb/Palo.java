package com.jrb;

import java.util.Locale;

public enum Palo {
        BASTOS, COPAS, ESPADAS, OROS;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
