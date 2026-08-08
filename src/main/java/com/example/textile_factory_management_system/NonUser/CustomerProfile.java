package com.example.textile_factory_management_system.NonUser;

public class CustomerProfile {
    private int customerId;
    private String companyName,email,contactInfo;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public CustomerProfile(int customerId, String companyName, String email, String contactInfo) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.email = email;
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "CustomerProfile{" +
                "customerId=" + customerId +
                ", companyName='" + companyName + '\'' +
                ", email='" + email + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }
}
