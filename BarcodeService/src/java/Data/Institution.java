package Data;
// Generated Jan 6, 2012 2:21:37 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Institution generated by hbm2java
 */
public class Institution  implements java.io.Serializable {


     private long id;
     private Serializable name;
     private Serializable division;
     private Serializable companyNumber;
     private Serializable profile;
     private Serializable address;
     private Integer adressId;
     private Serializable telephoneNumber;
     private Serializable faxNumber;
     private Serializable emailAddress;
     private Serializable websiteUrl;
     private Serializable publisherNumber;
     private boolean isActive;
     private Date dateCreated;
     private Set<Customer> customers = new HashSet<Customer>(0);
     private Set<BookSourceForOrder> bookSourceForOrders = new HashSet<BookSourceForOrder>(0);

    public Institution() {
    }

	
    public Institution(long id, Serializable name, boolean isActive, Date dateCreated) {
        this.id = id;
        this.name = name;
        this.isActive = isActive;
        this.dateCreated = dateCreated;
    }
    public Institution(long id, Serializable name, Serializable division, Serializable companyNumber, Serializable profile, Serializable address, Integer adressId, Serializable telephoneNumber, Serializable faxNumber, Serializable emailAddress, Serializable websiteUrl, Serializable publisherNumber, boolean isActive, Date dateCreated, Set<Customer> customers, Set<BookSourceForOrder> bookSourceForOrders) {
       this.id = id;
       this.name = name;
       this.division = division;
       this.companyNumber = companyNumber;
       this.profile = profile;
       this.address = address;
       this.adressId = adressId;
       this.telephoneNumber = telephoneNumber;
       this.faxNumber = faxNumber;
       this.emailAddress = emailAddress;
       this.websiteUrl = websiteUrl;
       this.publisherNumber = publisherNumber;
       this.isActive = isActive;
       this.dateCreated = dateCreated;
       this.customers = customers;
       this.bookSourceForOrders = bookSourceForOrders;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Serializable getName() {
        return this.name;
    }
    
    public void setName(Serializable name) {
        this.name = name;
    }
    public Serializable getDivision() {
        return this.division;
    }
    
    public void setDivision(Serializable division) {
        this.division = division;
    }
    public Serializable getCompanyNumber() {
        return this.companyNumber;
    }
    
    public void setCompanyNumber(Serializable companyNumber) {
        this.companyNumber = companyNumber;
    }
    public Serializable getProfile() {
        return this.profile;
    }
    
    public void setProfile(Serializable profile) {
        this.profile = profile;
    }
    public Serializable getAddress() {
        return this.address;
    }
    
    public void setAddress(Serializable address) {
        this.address = address;
    }
    public Integer getAdressId() {
        return this.adressId;
    }
    
    public void setAdressId(Integer adressId) {
        this.adressId = adressId;
    }
    public Serializable getTelephoneNumber() {
        return this.telephoneNumber;
    }
    
    public void setTelephoneNumber(Serializable telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public Serializable getFaxNumber() {
        return this.faxNumber;
    }
    
    public void setFaxNumber(Serializable faxNumber) {
        this.faxNumber = faxNumber;
    }
    public Serializable getEmailAddress() {
        return this.emailAddress;
    }
    
    public void setEmailAddress(Serializable emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Serializable getWebsiteUrl() {
        return this.websiteUrl;
    }
    
    public void setWebsiteUrl(Serializable websiteUrl) {
        this.websiteUrl = websiteUrl;
    }
    public Serializable getPublisherNumber() {
        return this.publisherNumber;
    }
    
    public void setPublisherNumber(Serializable publisherNumber) {
        this.publisherNumber = publisherNumber;
    }
    public boolean isIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Set<Customer> getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
    public Set<BookSourceForOrder> getBookSourceForOrders() {
        return this.bookSourceForOrders;
    }
    
    public void setBookSourceForOrders(Set<BookSourceForOrder> bookSourceForOrders) {
        this.bookSourceForOrders = bookSourceForOrders;
    }




}


