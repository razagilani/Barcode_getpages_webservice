package Data;
// Generated Jan 6, 2012 2:21:37 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Customer generated by hbm2java
 */
public class Customer  implements java.io.Serializable {


     private long id;
     private Institution institution;
     private Serializable bookPlate;
     private Serializable folderName;
     private Serializable statusUpdateType;
     private boolean activeStatus;
     private Date dateCreated;
     private Serializable customerFolderName;
     private Set<CustomerOrder> customerOrders = new HashSet<CustomerOrder>(0);

    public Customer() {
    }

	
    public Customer(long id, Institution institution, boolean activeStatus, Date dateCreated, Serializable customerFolderName) {
        this.id = id;
        this.institution = institution;
        this.activeStatus = activeStatus;
        this.dateCreated = dateCreated;
        this.customerFolderName = customerFolderName;
    }
    public Customer(long id, Institution institution, Serializable bookPlate, Serializable folderName, Serializable statusUpdateType, boolean activeStatus, Date dateCreated, Serializable customerFolderName, Set<CustomerOrder> customerOrders) {
       this.id = id;
       this.institution = institution;
       this.bookPlate = bookPlate;
       this.folderName = folderName;
       this.statusUpdateType = statusUpdateType;
       this.activeStatus = activeStatus;
       this.dateCreated = dateCreated;
       this.customerFolderName = customerFolderName;
       this.customerOrders = customerOrders;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public Institution getInstitution() {
        return this.institution;
    }
    
    public void setInstitution(Institution institution) {
        this.institution = institution;
    }
    public Serializable getBookPlate() {
        return this.bookPlate;
    }
    
    public void setBookPlate(Serializable bookPlate) {
        this.bookPlate = bookPlate;
    }
    public Serializable getFolderName() {
        return this.folderName;
    }
    
    public void setFolderName(Serializable folderName) {
        this.folderName = folderName;
    }
    public Serializable getStatusUpdateType() {
        return this.statusUpdateType;
    }
    
    public void setStatusUpdateType(Serializable statusUpdateType) {
        this.statusUpdateType = statusUpdateType;
    }
    public boolean isActiveStatus() {
        return this.activeStatus;
    }
    
    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Serializable getCustomerFolderName() {
        return this.customerFolderName;
    }
    
    public void setCustomerFolderName(Serializable customerFolderName) {
        this.customerFolderName = customerFolderName;
    }
    public Set<CustomerOrder> getCustomerOrders() {
        return this.customerOrders;
    }
    
    public void setCustomerOrders(Set<CustomerOrder> customerOrders) {
        this.customerOrders = customerOrders;
    }




}


