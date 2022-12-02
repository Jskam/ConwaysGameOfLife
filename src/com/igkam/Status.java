package com.igkam;

public enum Status {
    NONE, // First step
    BORN, // Second step
    LIVE, // First step
    DIED; // Second step

    public Status firstStep(int around) {
        return switch (this) {
            case NONE -> (around == 3) ? BORN : NONE;
            case LIVE -> (around <= 1 || around >= 4) ? DIED : LIVE;
            default -> this;
        };
    }

    public Status secondStep() {
        return switch (this) {
            case BORN -> LIVE;
            case DIED -> NONE;
            default -> this;
        };
    }

    public boolean isCell() {
        return this == LIVE || this == DIED;
    }
}
