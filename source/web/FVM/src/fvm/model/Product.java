package fvm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7109942876923812085L;

	@Id
	@GeneratedValue
	@Column(name = "Id_Product")
	private int id;

	@Column(name = "Name_Product", length = 20, nullable = false, unique = true)
	private String name;

	@Column(name = "Description_Product", length = 80, nullable = false, unique = true)
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", description=" + description + "]";
	}
	
	

}