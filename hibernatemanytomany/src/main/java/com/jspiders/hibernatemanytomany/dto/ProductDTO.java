package com.jspiders.hibernatemanytomany.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data

public class ProductDTO {
	@Id
	private int id;
	private long price;
	private String pack_date;
	private String name;

}
