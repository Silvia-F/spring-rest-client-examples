package guru.springframework.api.domain;

import java.io.Serializable;

public class Card implements Serializable {

    private String type;

    private String number;

    private ExpirationDate expirationDate;

    private String iban;

    private String swift;

    public Card(String type, String number, ExpirationDate expirationDate, String iban, String swift) {
        this.type = type;
        this.number = number;
        this.expirationDate = expirationDate;
        this.iban = iban;
        this.swift = swift;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwift() {
        return swift;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }
}
