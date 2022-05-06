package com.example.ParsingProject.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Data
@XmlRootElement(name = "Valute")
@XmlAccessorType(XmlAccessType.FIELD)
public class CourseDtoOnce {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @XmlElement(name = "NumCode")
    private String numCode;

    @XmlElement(name = "CharCode")
    private String charCode;

    @XmlElement(name = "Nominal")
    private int nominal;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Value")
    @JsonIgnore
    @Transient
    private String _Value;

    private double value;

   }
