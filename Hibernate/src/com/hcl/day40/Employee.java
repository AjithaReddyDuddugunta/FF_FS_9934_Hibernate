package com.hcl.day40;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author dudduguntaaji.reddy
 *
 */
@Entity
@Table(name="EMPDEC")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empno")
		private int empId;
	@Column
		private String empName;
	@OneToMany(/*mappedBy="EMPDESC",*/cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private List<Address> addresses;
		/**
		 * 
		 * @param empId
		 * @param empName
		 */
		public Employee(int empId, String empName) {
			this.empId=empId;
			this.empName=empName;
		}
		public Employee() {
			super();
		}
		/**
		 * 
		 * @param empId
		 */
		public void setEmpId(int empId) {
			this.empId=empId;
		}
		/**
		 * 
		 * @return
		 */
		public int getEmpId() {
			return empId;
		}
		/**
		 * 
		 * @param empName
		 */
		public void setEmpName(String empName) {
			this.empName=empName;
		}
		/**
		 * 
		 * @return
		 */
		public String getEmpName() {
			return empName;
		}
		
		public List<Address> getAddress() {
			return addresses;
			
		}
		public void setAddress(List<Address> addresses) {
			this.addresses=addresses;
			
		}
}
