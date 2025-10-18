package com.algaworks.algashop.ordering.domain.entity;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

public class Customer {

    private UUID id;
    private String fullName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String document;
    private Boolean promotionNotificationAllowed;
    private Boolean archived;
    private OffsetDateTime registredAt;
    private Integer loyaltyPoints;

    // Construtor completo
    public Customer(UUID id, String fullName, LocalDate birthDate, String email, String phone,
                    String document, Boolean promotionNotificationAllowed,
                    OffsetDateTime registredAt) {

        setId(id);
        setFullName(fullName);
        setBirthDate(birthDate);
        setEmail(email);
        setPhone(phone);
        setDocument(document);
        setPromotionNotificationAllowed(promotionNotificationAllowed);
        setArchived(false);
        setRegistredAt(registredAt);
        setLoyaltyPoints(0);
    }

    // ---------------------
    // Métodos de comportamento
    // ---------------------

    public void archive() {
        setArchived(true);
    }

    public void addLoayltyPoints(Integer points) {
        if (points != null && points > 0) {
            setLoyaltyPoints(this.loyaltyPoints + points);
        }
    }

    public void enablePromotionNotifications() {
        setPromotionNotificationAllowed(true);
    }

    public void disablePromotionNotification() {
        setPromotionNotificationAllowed(false);
    }

    public void changeName(String newName) {
        if (newName != null && !newName.isBlank()) {
            setFullName(newName);
        }
    }

    public void changeEmail(String newEmail) {
        if (newEmail != null && !newEmail.isBlank()) {
            setEmail(newEmail);
        }
    }

    public void changePhone(String newPhone) {
        if (newPhone != null && !newPhone.isBlank()) {
            setPhone(newPhone);
        }
    }

    // ---------------------
    // Getters (expostos)
    // ---------------------

    public UUID id() {
        return id;
    }

    public String fullName() {
        return fullName;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

    public String document() {
        return document;
    }

    public Boolean isPromotionNotificationAllowed() {
        return promotionNotificationAllowed;
    }

    public Boolean isArchived() {
        return archived;
    }

    public OffsetDateTime registredAt() {
        return registredAt;
    }

    public Integer loyaltyPoints() {
        return loyaltyPoints;
    }


    // ---------------------
    // Setters privados
    // ---------------------

    private void setId(UUID id) {
        this.id = (id != null) ? id : UUID.randomUUID();
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private void setDocument(String document) {
        this.document = document;
    }

    private void setPromotionNotificationAllowed(Boolean promotionNotificationAllowed) {
        this.promotionNotificationAllowed = (promotionNotificationAllowed != null)
                ? promotionNotificationAllowed : Boolean.TRUE;
    }

    private void setArchived(Boolean archived) {
        this.archived = (archived != null) ? archived : Boolean.FALSE;
    }

    private void setRegistredAt(OffsetDateTime registredAt) {
        this.registredAt = (registredAt != null) ? registredAt : OffsetDateTime.now();
    }

    private void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = (loyaltyPoints != null) ? loyaltyPoints : 0;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
