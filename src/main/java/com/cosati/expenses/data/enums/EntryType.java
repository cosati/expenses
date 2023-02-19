package com.cosati.expenses.data.enums;

public enum EntryType {

    DEBIT(1, "Debit"),
    CREDIT(2, "Credit");

    private int cod;
    private String description;

    private EntryType(int cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static EntryType toEnum(Integer cod) {
        if (cod == null) {
            return null;
        }

        for (EntryType entryType : EntryType.values()) {
            if (cod.equals(entryType.getCod())) {
                return entryType;
            }
        }

        throw new IllegalArgumentException("Invalid Entry Type: " + cod);
    }
}
