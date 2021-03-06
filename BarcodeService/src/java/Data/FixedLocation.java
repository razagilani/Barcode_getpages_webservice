package Data;
// Generated Jan 6, 2012 2:21:37 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FixedLocation generated by hbm2java
 */
public class FixedLocation  implements java.io.Serializable {


     private long id;
     private long parentId;
     private long genericLocationId;
     private Serializable name;
     private Serializable description;
     private Date dateCreated;
     private Set<BookScanner> bookScanners = new HashSet<BookScanner>(0);

    public FixedLocation() {
    }

	
    public FixedLocation(long id, long parentId, long genericLocationId, Serializable name, Date dateCreated) {
        this.id = id;
        this.parentId = parentId;
        this.genericLocationId = genericLocationId;
        this.name = name;
        this.dateCreated = dateCreated;
    }
    public FixedLocation(long id, long parentId, long genericLocationId, Serializable name, Serializable description, Date dateCreated, Set<BookScanner> bookScanners) {
       this.id = id;
       this.parentId = parentId;
       this.genericLocationId = genericLocationId;
       this.name = name;
       this.description = description;
       this.dateCreated = dateCreated;
       this.bookScanners = bookScanners;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public long getParentId() {
        return this.parentId;
    }
    
    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
    public long getGenericLocationId() {
        return this.genericLocationId;
    }
    
    public void setGenericLocationId(long genericLocationId) {
        this.genericLocationId = genericLocationId;
    }
    public Serializable getName() {
        return this.name;
    }
    
    public void setName(Serializable name) {
        this.name = name;
    }
    public Serializable getDescription() {
        return this.description;
    }
    
    public void setDescription(Serializable description) {
        this.description = description;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Set<BookScanner> getBookScanners() {
        return this.bookScanners;
    }
    
    public void setBookScanners(Set<BookScanner> bookScanners) {
        this.bookScanners = bookScanners;
    }




}


