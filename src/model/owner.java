package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owner")
public class owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OWNER_ID")
	private int id;
	@Column(name = "OWNER_PHONE")
	private String ownerPhone;

	public owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public owner(int id, String ownerPhone) {
		super();
		this.id = id;
		this.ownerPhone = ownerPhone;
	}

	public owner(String ownerPhone) {
		super();
		this.ownerPhone = ownerPhone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerPhone() {
		return ownerPhone;
	}

	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	@Override
	public String toString() {
		return "owner [id=" + id + ", ownerPhone=" + ownerPhone + "]";
	}

}