package com.prowings.secondlevelcache;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class EntityClass {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		int id;
		@Column
		String name;
		@Column
		String address;
		@Column
		String department;
		
		
		public EntityClass() {
			super();
			// TODO Auto-generated constructor stub
		}


		public EntityClass(String name, String address, String department) {
			super();
			this.name = name;
			this.address = address;
			this.department = department;
		}


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


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}


		@Override
		public String toString() {
			return "Entity [id=" + id + ", name=" + name + ", address=" + address + ", department=" + department + "]";
		}
		
		
		
	
	
}
