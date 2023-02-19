package com.cosati.expenses.data;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="ENTITY")
public class Entry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ENTRY_ID")
    private long id;
    @Column(name="DESCRIPTION")
    private String description;
    @Column(name="ENTRY_DATE")
    private Date entryDate;
    @Column(name="TOTAL")
    private Double total;
    @Column(name="CATEGORY_ID")
    private long categoryId;
    @Column(name="ENTRY_TYPE")
    private String entryType;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", entryDate=" + entryDate +
                ", total=" + total +
                ", categoryId=" + categoryId +
                ", entryType='" + entryType + '\'' +
                '}';
    }
}
