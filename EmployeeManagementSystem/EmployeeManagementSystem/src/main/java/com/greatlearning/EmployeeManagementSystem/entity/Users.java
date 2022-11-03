package com.greatlearning.EmployeeManagementSystem.entity;

import java.util.ArrayList;
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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@Setter
public class Users {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name="username")
private String username;
@Column(name="password")
private String password;

@ManyToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id"))
private List<Roles>listOfRoles=new ArrayList<Roles>();


}
