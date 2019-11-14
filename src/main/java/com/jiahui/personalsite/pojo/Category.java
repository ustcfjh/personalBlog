package com.jiahui.personalsite.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
@JsonIgnoreProperties({ "handler","hibernateLazyInitializer" })
public class Category {

}
