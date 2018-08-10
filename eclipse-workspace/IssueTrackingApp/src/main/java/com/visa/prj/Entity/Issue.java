package com.visa.prj.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="issues")
public class Issue {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="issue_id")
	private int issueId;
	
	private String description;
	
	private String solution;
	
	@Column(name="raised_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date raisedDate=new Date();
	
	@Column(name="resolveddate")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolvedDate;
	
	@ManyToOne
	@JoinColumn(name="raised_by")  //foreign key, refers to Employee
	private Employee raisedBy;
	
	
	@ManyToOne
	@JoinColumn(name="resolved_by") //foreign key, refers to Employee
	private Employee resolvedBy;
	
	public Issue() {
	}

	public Issue(int issueId, String description, String solution, Date raisedDate, Date resolvedDate,
			Employee raisedBy, Employee resolvedBy) {
		super();
		this.issueId = issueId;
		this.description = description;
		this.solution = solution;
		this.raisedDate = raisedDate;
		this.resolvedDate = resolvedDate;
		this.raisedBy = raisedBy;
		this.resolvedBy = resolvedBy;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSolution() {
		return solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
	}

	public Date getRaisedDate() {
		return raisedDate;
	}

	public void setRaisedDate(Date raisedDate) {
		this.raisedDate = raisedDate;
	}

	public Date getResolvedDate() {
		return resolvedDate;
	}

	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	public Employee getRaisedBy() {
		return raisedBy;
	}

	public void setRaisedBy(Employee raisedBy) {
		this.raisedBy = raisedBy;
	}

	public Employee getResolvedBy() {
		return resolvedBy;
	}

	public void setResolvedBy(Employee resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", description=" + description + ", solution=" + solution + ", raisedDate="
				+ raisedDate + ", resolvedDate=" + resolvedDate + ", raisedBy=" + raisedBy + ", resolvedBy="
				+ resolvedBy + "]";
	}

}
