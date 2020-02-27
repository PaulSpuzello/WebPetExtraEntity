package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="list_details")
public class ListDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OWNER_ID")
	private int id;
	@Column(name="OWNER_PHONE")
	private String ownerPhone;
	private String listName;
	@ManyToOne
	@JoinColumn(name="ID")
	private owner owner;
	
	@OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
	@JoinTable
	  (
	      name="PETS_ON_LIST",
	      joinColumns={ @JoinColumn(name="OWNER_ID", referencedColumnName="OWNER_ID") },
	      inverseJoinColumns={ @JoinColumn(name="PET_ID", referencedColumnName="ID", unique=true) }
	  )
	private List<ListPet> listOfPets;

	public ListDetails() {
		super();
	}
	
	public ListDetails(int id, String ownerPhone, String listName, owner owner, List<ListPet> listOfPets) {
		this.id = id;
		this.ownerPhone = ownerPhone;
		this.listName = listName;
		this.owner = owner;
		this.listOfPets = listOfPets;
	}
	
	public ListDetails(String ownerPhone, String listName, owner owner, List<ListPet> listOfPets) {
		this.ownerPhone = ownerPhone;
		this.listName = listName;
		this.owner = owner;
		this.listOfPets = listOfPets;
	}

	public ListDetails(String ownerPhone, String listName, owner owner) {
		this.ownerPhone = ownerPhone;
		this.listName = listName;
		this.owner = owner;
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

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public owner getOwner() {
		return owner;
	}

	public void setOwner(owner owner) {
		this.owner = owner;
	}

	public List<ListPet> getListOfPets() {
		return listOfPets;
	}

	public void setListOfPets(List<ListPet> listOfPets) {
		this.listOfPets = listOfPets;
	}
	
	@Override
	public String toString() {
		return "ListDetails [id=" + id + ", ownerPhone=" + ownerPhone + ", listName=" + listName + ", owner=" + owner
				+ ", listOfPets=" + listOfPets + "]";
	}
}
