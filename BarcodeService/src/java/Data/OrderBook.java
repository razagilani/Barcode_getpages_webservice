package Data;
// Generated Jan 6, 2012 2:21:37 PM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * OrderBook generated by hbm2java
 */
public class OrderBook  implements java.io.Serializable {


     private long id;
     private BookSourceForOrder bookSourceForOrder;
     private Project project;
     private BookScanner bookScanner;
     private OrderBook orderBook;
     private WorkflowStep workflowStep;
     private Long jobId;
     private Date jobAssignDate;
     private Serializable isbn13;
     private Serializable isbn10;
     private Serializable customerBarcode;
     private Serializable kirtasBarcode;
     private Serializable publisher;
     private Serializable title;
     private Serializable author;
     private Short numberOfPages;
     private Short numberOfColorPages;
     private Short numberOfGrayPages;
     private Short numberOfBwpages;
     private Long mobileContainerId;
     private Long fixedLocationId;
     private Date moveInDate;
     private Long prevMobileContainerId;
     private Long prevFixedLocationId;
     private Date prevMoveInDate;
     private Date isBookCurrentlyLockedDateTime;
     private Long currentlyOpenPersonId;
     private boolean isOcr;
     private boolean isWatermark;
     private Long duplicateOrderBookId;
     private Serializable customerBookId;
     private Serializable customerPublisherNum;
     private Serializable customerStatusId;
     private Serializable customerTargetStatusId;
     private Boolean customerIsException;
     private Serializable customerStatusToReport;
     private Boolean customerStatusHasToBeReported;
     private Date customerStatusReportedDateTime;
     private Serializable customerExceptionType;
     private Date customerLastModifiedDateTime;
     private Date modifiedDateAndTime;
     private Date dateCreated;
     private Boolean isIsbninMsmanifest;
     private Boolean isDblocationValid;
     private Boolean doesBookManifestExist;
     private Boolean isBookManifestNameSameAsIsbn;
     private Boolean isDbjpgcountDifferent;
     private Boolean wasAnyPathFound;
     private Serializable operatorNotes;
     private Boolean isFoldout;
     private Boolean isFoldoutScanned;
     private Short numOfFoldoutImages;
     private Serializable locationCode;
     private Serializable callNumber;
     private Boolean isMetsException;
     private Serializable bookFolderName;
     private Boolean isMultiVersionBook;
     private Boolean isQaStepSkipped;
     private Serializable imageType;
     private Set<OrderBook> orderBooks = new HashSet<OrderBook>(0);

    public OrderBook() {
    }

	
    public OrderBook(long id, BookSourceForOrder bookSourceForOrder, Project project, WorkflowStep workflowStep, boolean isOcr, boolean isWatermark, Date dateCreated) {
        this.id = id;
        this.bookSourceForOrder = bookSourceForOrder;
        this.project = project;
        this.workflowStep = workflowStep;
        this.isOcr = isOcr;
        this.isWatermark = isWatermark;
        this.dateCreated = dateCreated;
    }
    public OrderBook(long id, BookSourceForOrder bookSourceForOrder, Project project, BookScanner bookScanner, OrderBook orderBook, WorkflowStep workflowStep, Long jobId, Date jobAssignDate, Serializable isbn13, Serializable isbn10, Serializable customerBarcode, Serializable kirtasBarcode, Serializable publisher, Serializable title, Serializable author, Short numberOfPages, Short numberOfColorPages, Short numberOfGrayPages, Short numberOfBwpages, Long mobileContainerId, Long fixedLocationId, Date moveInDate, Long prevMobileContainerId, Long prevFixedLocationId, Date prevMoveInDate, Date isBookCurrentlyLockedDateTime, Long currentlyOpenPersonId, boolean isOcr, boolean isWatermark, Long duplicateOrderBookId, Serializable customerBookId, Serializable customerPublisherNum, Serializable customerStatusId, Serializable customerTargetStatusId, Boolean customerIsException, Serializable customerStatusToReport, Boolean customerStatusHasToBeReported, Date customerStatusReportedDateTime, Serializable customerExceptionType, Date customerLastModifiedDateTime, Date modifiedDateAndTime, Date dateCreated, Boolean isIsbninMsmanifest, Boolean isDblocationValid, Boolean doesBookManifestExist, Boolean isBookManifestNameSameAsIsbn, Boolean isDbjpgcountDifferent, Boolean wasAnyPathFound, Serializable operatorNotes, Boolean isFoldout, Boolean isFoldoutScanned, Short numOfFoldoutImages, Serializable locationCode, Serializable callNumber, Boolean isMetsException, Serializable bookFolderName, Boolean isMultiVersionBook, Boolean isQaStepSkipped, Serializable imageType, Set<OrderBook> orderBooks) {
       this.id = id;
       this.bookSourceForOrder = bookSourceForOrder;
       this.project = project;
       this.bookScanner = bookScanner;
       this.orderBook = orderBook;
       this.workflowStep = workflowStep;
       this.jobId = jobId;
       this.jobAssignDate = jobAssignDate;
       this.isbn13 = isbn13;
       this.isbn10 = isbn10;
       this.customerBarcode = customerBarcode;
       this.kirtasBarcode = kirtasBarcode;
       this.publisher = publisher;
       this.title = title;
       this.author = author;
       this.numberOfPages = numberOfPages;
       this.numberOfColorPages = numberOfColorPages;
       this.numberOfGrayPages = numberOfGrayPages;
       this.numberOfBwpages = numberOfBwpages;
       this.mobileContainerId = mobileContainerId;
       this.fixedLocationId = fixedLocationId;
       this.moveInDate = moveInDate;
       this.prevMobileContainerId = prevMobileContainerId;
       this.prevFixedLocationId = prevFixedLocationId;
       this.prevMoveInDate = prevMoveInDate;
       this.isBookCurrentlyLockedDateTime = isBookCurrentlyLockedDateTime;
       this.currentlyOpenPersonId = currentlyOpenPersonId;
       this.isOcr = isOcr;
       this.isWatermark = isWatermark;
       this.duplicateOrderBookId = duplicateOrderBookId;
       this.customerBookId = customerBookId;
       this.customerPublisherNum = customerPublisherNum;
       this.customerStatusId = customerStatusId;
       this.customerTargetStatusId = customerTargetStatusId;
       this.customerIsException = customerIsException;
       this.customerStatusToReport = customerStatusToReport;
       this.customerStatusHasToBeReported = customerStatusHasToBeReported;
       this.customerStatusReportedDateTime = customerStatusReportedDateTime;
       this.customerExceptionType = customerExceptionType;
       this.customerLastModifiedDateTime = customerLastModifiedDateTime;
       this.modifiedDateAndTime = modifiedDateAndTime;
       this.dateCreated = dateCreated;
       this.isIsbninMsmanifest = isIsbninMsmanifest;
       this.isDblocationValid = isDblocationValid;
       this.doesBookManifestExist = doesBookManifestExist;
       this.isBookManifestNameSameAsIsbn = isBookManifestNameSameAsIsbn;
       this.isDbjpgcountDifferent = isDbjpgcountDifferent;
       this.wasAnyPathFound = wasAnyPathFound;
       this.operatorNotes = operatorNotes;
       this.isFoldout = isFoldout;
       this.isFoldoutScanned = isFoldoutScanned;
       this.numOfFoldoutImages = numOfFoldoutImages;
       this.locationCode = locationCode;
       this.callNumber = callNumber;
       this.isMetsException = isMetsException;
       this.bookFolderName = bookFolderName;
       this.isMultiVersionBook = isMultiVersionBook;
       this.isQaStepSkipped = isQaStepSkipped;
       this.imageType = imageType;
       this.orderBooks = orderBooks;
    }
   
    public long getId() {
        return this.id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    public BookSourceForOrder getBookSourceForOrder() {
        return this.bookSourceForOrder;
    }
    
    public void setBookSourceForOrder(BookSourceForOrder bookSourceForOrder) {
        this.bookSourceForOrder = bookSourceForOrder;
    }
    public Project getProject() {
        return this.project;
    }
    
    public void setProject(Project project) {
        this.project = project;
    }
    public BookScanner getBookScanner() {
        return this.bookScanner;
    }
    
    public void setBookScanner(BookScanner bookScanner) {
        this.bookScanner = bookScanner;
    }
    public OrderBook getOrderBook() {
        return this.orderBook;
    }
    
    public void setOrderBook(OrderBook orderBook) {
        this.orderBook = orderBook;
    }
    public WorkflowStep getWorkflowStep() {
        return this.workflowStep;
    }
    
    public void setWorkflowStep(WorkflowStep workflowStep) {
        this.workflowStep = workflowStep;
    }
    public Long getJobId() {
        return this.jobId;
    }
    
    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }
    public Date getJobAssignDate() {
        return this.jobAssignDate;
    }
    
    public void setJobAssignDate(Date jobAssignDate) {
        this.jobAssignDate = jobAssignDate;
    }
    public Serializable getIsbn13() {
        return this.isbn13;
    }
    
    public void setIsbn13(Serializable isbn13) {
        this.isbn13 = isbn13;
    }
    public Serializable getIsbn10() {
        return this.isbn10;
    }
    
    public void setIsbn10(Serializable isbn10) {
        this.isbn10 = isbn10;
    }
    public Serializable getCustomerBarcode() {
        return this.customerBarcode;
    }
    
    public void setCustomerBarcode(Serializable customerBarcode) {
        this.customerBarcode = customerBarcode;
    }
    public Serializable getKirtasBarcode() {
        return this.kirtasBarcode;
    }
    
    public void setKirtasBarcode(Serializable kirtasBarcode) {
        this.kirtasBarcode = kirtasBarcode;
    }
    public Serializable getPublisher() {
        return this.publisher;
    }
    
    public void setPublisher(Serializable publisher) {
        this.publisher = publisher;
    }
    public Serializable getTitle() {
        return this.title;
    }
    
    public void setTitle(Serializable title) {
        this.title = title;
    }
    public Serializable getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Serializable author) {
        this.author = author;
    }
    public Short getNumberOfPages() {
        return this.numberOfPages;
    }
    
    public void setNumberOfPages(Short numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public Short getNumberOfColorPages() {
        return this.numberOfColorPages;
    }
    
    public void setNumberOfColorPages(Short numberOfColorPages) {
        this.numberOfColorPages = numberOfColorPages;
    }
    public Short getNumberOfGrayPages() {
        return this.numberOfGrayPages;
    }
    
    public void setNumberOfGrayPages(Short numberOfGrayPages) {
        this.numberOfGrayPages = numberOfGrayPages;
    }
    public Short getNumberOfBwpages() {
        return this.numberOfBwpages;
    }
    
    public void setNumberOfBwpages(Short numberOfBwpages) {
        this.numberOfBwpages = numberOfBwpages;
    }
    public Long getMobileContainerId() {
        return this.mobileContainerId;
    }
    
    public void setMobileContainerId(Long mobileContainerId) {
        this.mobileContainerId = mobileContainerId;
    }
    public Long getFixedLocationId() {
        return this.fixedLocationId;
    }
    
    public void setFixedLocationId(Long fixedLocationId) {
        this.fixedLocationId = fixedLocationId;
    }
    public Date getMoveInDate() {
        return this.moveInDate;
    }
    
    public void setMoveInDate(Date moveInDate) {
        this.moveInDate = moveInDate;
    }
    public Long getPrevMobileContainerId() {
        return this.prevMobileContainerId;
    }
    
    public void setPrevMobileContainerId(Long prevMobileContainerId) {
        this.prevMobileContainerId = prevMobileContainerId;
    }
    public Long getPrevFixedLocationId() {
        return this.prevFixedLocationId;
    }
    
    public void setPrevFixedLocationId(Long prevFixedLocationId) {
        this.prevFixedLocationId = prevFixedLocationId;
    }
    public Date getPrevMoveInDate() {
        return this.prevMoveInDate;
    }
    
    public void setPrevMoveInDate(Date prevMoveInDate) {
        this.prevMoveInDate = prevMoveInDate;
    }
    public Date getIsBookCurrentlyLockedDateTime() {
        return this.isBookCurrentlyLockedDateTime;
    }
    
    public void setIsBookCurrentlyLockedDateTime(Date isBookCurrentlyLockedDateTime) {
        this.isBookCurrentlyLockedDateTime = isBookCurrentlyLockedDateTime;
    }
    public Long getCurrentlyOpenPersonId() {
        return this.currentlyOpenPersonId;
    }
    
    public void setCurrentlyOpenPersonId(Long currentlyOpenPersonId) {
        this.currentlyOpenPersonId = currentlyOpenPersonId;
    }
    public boolean isIsOcr() {
        return this.isOcr;
    }
    
    public void setIsOcr(boolean isOcr) {
        this.isOcr = isOcr;
    }
    public boolean isIsWatermark() {
        return this.isWatermark;
    }
    
    public void setIsWatermark(boolean isWatermark) {
        this.isWatermark = isWatermark;
    }
    public Long getDuplicateOrderBookId() {
        return this.duplicateOrderBookId;
    }
    
    public void setDuplicateOrderBookId(Long duplicateOrderBookId) {
        this.duplicateOrderBookId = duplicateOrderBookId;
    }
    public Serializable getCustomerBookId() {
        return this.customerBookId;
    }
    
    public void setCustomerBookId(Serializable customerBookId) {
        this.customerBookId = customerBookId;
    }
    public Serializable getCustomerPublisherNum() {
        return this.customerPublisherNum;
    }
    
    public void setCustomerPublisherNum(Serializable customerPublisherNum) {
        this.customerPublisherNum = customerPublisherNum;
    }
    public Serializable getCustomerStatusId() {
        return this.customerStatusId;
    }
    
    public void setCustomerStatusId(Serializable customerStatusId) {
        this.customerStatusId = customerStatusId;
    }
    public Serializable getCustomerTargetStatusId() {
        return this.customerTargetStatusId;
    }
    
    public void setCustomerTargetStatusId(Serializable customerTargetStatusId) {
        this.customerTargetStatusId = customerTargetStatusId;
    }
    public Boolean getCustomerIsException() {
        return this.customerIsException;
    }
    
    public void setCustomerIsException(Boolean customerIsException) {
        this.customerIsException = customerIsException;
    }
    public Serializable getCustomerStatusToReport() {
        return this.customerStatusToReport;
    }
    
    public void setCustomerStatusToReport(Serializable customerStatusToReport) {
        this.customerStatusToReport = customerStatusToReport;
    }
    public Boolean getCustomerStatusHasToBeReported() {
        return this.customerStatusHasToBeReported;
    }
    
    public void setCustomerStatusHasToBeReported(Boolean customerStatusHasToBeReported) {
        this.customerStatusHasToBeReported = customerStatusHasToBeReported;
    }
    public Date getCustomerStatusReportedDateTime() {
        return this.customerStatusReportedDateTime;
    }
    
    public void setCustomerStatusReportedDateTime(Date customerStatusReportedDateTime) {
        this.customerStatusReportedDateTime = customerStatusReportedDateTime;
    }
    public Serializable getCustomerExceptionType() {
        return this.customerExceptionType;
    }
    
    public void setCustomerExceptionType(Serializable customerExceptionType) {
        this.customerExceptionType = customerExceptionType;
    }
    public Date getCustomerLastModifiedDateTime() {
        return this.customerLastModifiedDateTime;
    }
    
    public void setCustomerLastModifiedDateTime(Date customerLastModifiedDateTime) {
        this.customerLastModifiedDateTime = customerLastModifiedDateTime;
    }
    public Date getModifiedDateAndTime() {
        return this.modifiedDateAndTime;
    }
    
    public void setModifiedDateAndTime(Date modifiedDateAndTime) {
        this.modifiedDateAndTime = modifiedDateAndTime;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Boolean getIsIsbninMsmanifest() {
        return this.isIsbninMsmanifest;
    }
    
    public void setIsIsbninMsmanifest(Boolean isIsbninMsmanifest) {
        this.isIsbninMsmanifest = isIsbninMsmanifest;
    }
    public Boolean getIsDblocationValid() {
        return this.isDblocationValid;
    }
    
    public void setIsDblocationValid(Boolean isDblocationValid) {
        this.isDblocationValid = isDblocationValid;
    }
    public Boolean getDoesBookManifestExist() {
        return this.doesBookManifestExist;
    }
    
    public void setDoesBookManifestExist(Boolean doesBookManifestExist) {
        this.doesBookManifestExist = doesBookManifestExist;
    }
    public Boolean getIsBookManifestNameSameAsIsbn() {
        return this.isBookManifestNameSameAsIsbn;
    }
    
    public void setIsBookManifestNameSameAsIsbn(Boolean isBookManifestNameSameAsIsbn) {
        this.isBookManifestNameSameAsIsbn = isBookManifestNameSameAsIsbn;
    }
    public Boolean getIsDbjpgcountDifferent() {
        return this.isDbjpgcountDifferent;
    }
    
    public void setIsDbjpgcountDifferent(Boolean isDbjpgcountDifferent) {
        this.isDbjpgcountDifferent = isDbjpgcountDifferent;
    }
    public Boolean getWasAnyPathFound() {
        return this.wasAnyPathFound;
    }
    
    public void setWasAnyPathFound(Boolean wasAnyPathFound) {
        this.wasAnyPathFound = wasAnyPathFound;
    }
    public Serializable getOperatorNotes() {
        return this.operatorNotes;
    }
    
    public void setOperatorNotes(Serializable operatorNotes) {
        this.operatorNotes = operatorNotes;
    }
    public Boolean getIsFoldout() {
        return this.isFoldout;
    }
    
    public void setIsFoldout(Boolean isFoldout) {
        this.isFoldout = isFoldout;
    }
    public Boolean getIsFoldoutScanned() {
        return this.isFoldoutScanned;
    }
    
    public void setIsFoldoutScanned(Boolean isFoldoutScanned) {
        this.isFoldoutScanned = isFoldoutScanned;
    }
    public Short getNumOfFoldoutImages() {
        return this.numOfFoldoutImages;
    }
    
    public void setNumOfFoldoutImages(Short numOfFoldoutImages) {
        this.numOfFoldoutImages = numOfFoldoutImages;
    }
    public Serializable getLocationCode() {
        return this.locationCode;
    }
    
    public void setLocationCode(Serializable locationCode) {
        this.locationCode = locationCode;
    }
    public Serializable getCallNumber() {
        return this.callNumber;
    }
    
    public void setCallNumber(Serializable callNumber) {
        this.callNumber = callNumber;
    }
    public Boolean getIsMetsException() {
        return this.isMetsException;
    }
    
    public void setIsMetsException(Boolean isMetsException) {
        this.isMetsException = isMetsException;
    }
    public Serializable getBookFolderName() {
        return this.bookFolderName;
    }
    
    public void setBookFolderName(Serializable bookFolderName) {
        this.bookFolderName = bookFolderName;
    }
    public Boolean getIsMultiVersionBook() {
        return this.isMultiVersionBook;
    }
    
    public void setIsMultiVersionBook(Boolean isMultiVersionBook) {
        this.isMultiVersionBook = isMultiVersionBook;
    }
    public Boolean getIsQaStepSkipped() {
        return this.isQaStepSkipped;
    }
    
    public void setIsQaStepSkipped(Boolean isQaStepSkipped) {
        this.isQaStepSkipped = isQaStepSkipped;
    }
    public Serializable getImageType() {
        return this.imageType;
    }
    
    public void setImageType(Serializable imageType) {
        this.imageType = imageType;
    }
    public Set<OrderBook> getOrderBooks() {
        return this.orderBooks;
    }
    
    public void setOrderBooks(Set<OrderBook> orderBooks) {
        this.orderBooks = orderBooks;
    }




}


