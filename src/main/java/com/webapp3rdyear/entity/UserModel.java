package com.webapp3rdyear.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;

@Entity
@Table(name = "USER")
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID")
	private int userId;

	@Column(name = "FirstName", length = 45)
	private String firstName;

	@Column(name = "LastName", length = 45)
	private String lastName;

	@Lob
	@Column(name = "Address", length = 1000)
	private String address;

	@Column(name = "Gender")
	private Boolean gender;

	@Column(name = "Phone", length = 11)
	private String phone;

	@Column(name = "DoB")
	private Date dateOfBirth;

	@Column(name = "CID", length = 12)
	private String cid;

	@Lob
	@Column(name = "Avatar", length = 1000)
	private String avatar;

	@Column(name = "Type")
	private int type;

	@Column(name = "KPI")
	private int kpi;

	@Column(name = "Area", length = 100)
	private String area;

	@Email
	@Column(name = "Email", length = 100)
	private String email;

	/*
	 * @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) private
	 * Set<VoucherCustomerModel> voucherUsers = new HashSet<>();
	 * 
	 * @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL) private
	 * Set<CartModel> cart = new HashSet<>();
	 */
	// Constructors
	public UserModel() {
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getKpi() {
		return kpi;
	}

	public void setKpi(int kpi) {
		this.kpi = kpi;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * public Set<VoucherCustomerModel> getVoucherUsers() { return voucherUsers; }
	 * 
	 * public void setVoucherUsers(Set<VoucherCustomerModel> voucherUsers) {
	 * this.voucherUsers = voucherUsers; }
	 */

}
