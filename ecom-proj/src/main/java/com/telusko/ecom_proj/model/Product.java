package com.telusko.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Product entity mapped to a database table using JPA
 */
@Entity                 // Marks this class as a JPA entity (table in DB)
@Data                   // Lombok: generates getters, setters, toString, equals, hashCode
@AllArgsConstructor     // Lombok: generates constructor with all fields
@NoArgsConstructor      // Lombok: generates default constructor
public class Product {

    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name = "description")
    private String description;

    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;

    private Date releaseDate;
    private boolean available;
    private int quantity;

//to store image
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageDate;

}

