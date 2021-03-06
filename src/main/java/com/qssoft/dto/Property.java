package com.qssoft.dto;

import java.math.BigDecimal;

public class Property
{
    private Integer id;
    private String title;
    private String description;
    private Integer dealTypeId;
    private BigDecimal price;
    private Integer ownerId;
    private String address;
    private String nearbyLocations;
    private String adminNote;
    private Integer statusId;
    private Float latitude;
    private Float longitude;
    private String statusDescription;
    private String ownerName;
    private String dealDescription;
    private String pictureCode;
    private String city;
    private Integer propertyTypeId;
    private String propertyTypeName;
    private String img1;
    private String img2;
    private String img3;
    private String img4;
    private String img5;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNearbyLocations() {
        return nearbyLocations;
    }

    public void setNearbyLocations(String nearbyLocations) {
        this.nearbyLocations = nearbyLocations;
    }

    public String getAdminNote() {
        return adminNote;
    }

    public void setAdminNote(String adminNote) {
        this.adminNote = adminNote;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getDealTypeId() {
        return dealTypeId;
    }

    public void setDealTypeId(Integer dealTypeId) {
        this.dealTypeId = dealTypeId;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDealDescription() {
        return dealDescription;
    }

    public void setDealDescription(String dealDescription) {
        this.dealDescription = dealDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPictureCode() {
        return pictureCode;
    }

    public void setPictureCode(String pictureCode) {
        this.pictureCode = pictureCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPropertyTypeId() {
        return propertyTypeId;
    }

    public void setPropertyTypeId(Integer propertyTypeId) {
        this.propertyTypeId = propertyTypeId;
    }

    public String getPropertyTypeName() {
        return propertyTypeName;
    }

    public void setPropertyTypeName(String propertyTypeName) {
        this.propertyTypeName = propertyTypeName;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public String getImg5() {
        return img5;
    }

    public void setImg5(String img5) {
        this.img5 = img5;
    }

    public Property() {}

    public Property(Integer id, String title, String description, Integer dealTypeId, BigDecimal price, Integer
            ownerId, String address, String nearbyLocations, String adminNote, Integer statusId, Float latitude,
                    Float longitude, String statusDescription, String ownerName, String dealDescription, String
                            pictureCode) {
        this(id, title, description, dealTypeId, price, ownerId, address, nearbyLocations, adminNote, statusId, latitude,
                longitude, statusDescription, ownerName, dealDescription, pictureCode, null, null, null);
    }

    public Property(Integer id, String title, String description, Integer dealTypeId, BigDecimal price, Integer
            ownerId, String address, String nearbyLocations, String adminNote, Integer statusId, Float latitude,
            Float longitude, String statusDescription, String ownerName, String dealDescription, String pictureCode,
            String city, Integer propertyTypeId, String propertyTypeName) {
        this(id, title, description, dealTypeId, price, ownerId, address, nearbyLocations, adminNote, statusId, latitude,
                longitude, statusDescription, ownerName, dealDescription, pictureCode, city, propertyTypeId, propertyTypeName,
                null, null, null, null, null);
    }

    public Property(Integer id, String title, String description, Integer dealTypeId, BigDecimal price, Integer ownerId,
                    String address, String nearbyLocations, String adminNote, Integer statusId, Float latitude,
                    Float longitude, String statusDescription, String ownerName, String dealDescription, String pictureCode,
                    String city, Integer propertyTypeId, String propertyTypeName, String img1, String img2, String img3,
                    String img4, String img5) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dealTypeId = dealTypeId;
        this.price = price;
        this.ownerId = ownerId;
        this.address = address;
        this.nearbyLocations = nearbyLocations;
        this.adminNote = adminNote;
        this.statusId = statusId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.statusDescription = statusDescription;
        this.ownerName = ownerName;
        this.dealDescription = dealDescription;
        this.pictureCode = pictureCode;
        this.city = city;
        this.propertyTypeId = propertyTypeId;
        this.propertyTypeName = propertyTypeName;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.img5 = img5;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", dealTypeId=" + dealTypeId +
                ", price=" + price +
                ", ownerId=" + ownerId +
                ", address='" + address + '\'' +
                ", nearbyLocations='" + nearbyLocations + '\'' +
                ", adminNote='" + adminNote + '\'' +
                ", statusId=" + statusId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", statusDescription='" + statusDescription + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", dealDescription='" + dealDescription + '\'' +
                ", pictureCode='" + pictureCode + '\'' +
                '}';
    }
}
