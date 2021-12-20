package com.asimkilic.secondhomeworkasimkilic.entity;


import javax.persistence.*;

@Entity
@Table(name = "CATEGORY")
public class Category {
    @SequenceGenerator(name = "category_generator", sequenceName = "CATEGORY_ID_SEQ",allocationSize = 1)
    @Id
    @GeneratedValue(generator = "category_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "BREAKDOWN")
    private Long breakdown;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOP_CATEGORY_ID",foreignKey = @ForeignKey(name = "FK_CATEGORY_TOP_CATEGORY_ID"))
    private Category topCategory;

    public Category() {
    }

    public Category(Long id, String name, Long breakdown, Category topCategory) {
        this.id = id;
        this.name = name;
        this.breakdown = breakdown;
        this.topCategory = topCategory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBreakdown() {
        return breakdown;
    }

    public void setBreakdown(Long breakdown) {
        this.breakdown = breakdown;
    }

    public Category getTopCategory() {
        return topCategory;
    }

    public void setTopCategory(Category topCategory) {
        this.topCategory = topCategory;
    }

    @Override
    public String toString() {
        return id == null ? "" : id.toString();
    }
}
