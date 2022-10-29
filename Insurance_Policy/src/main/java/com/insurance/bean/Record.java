package com.insurance.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

import lombok.Data;
@Entity
@Data
public class Record {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int recordno;
		private String policyname;
		private String category;
		private String customername;
		private String status;
		@Type(type="date")
		private Date date;
		public int getRecordno() {
			return recordno;
		}
		public void setRecordno(int recordno) {
			this.recordno = recordno;
		}
		public String getPolicyname() {
			return policyname;
		}
		public void setPolicyname(String policyname) {
			this.policyname = policyname;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getCustomername() {
			return customername;
		}
		public void setCustomername(String customername) {
			this.customername = customername;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
	
}
