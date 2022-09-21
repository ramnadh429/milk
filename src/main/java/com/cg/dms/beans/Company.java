package com.cg.dms.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter

@AllArgsConstructor
@NoArgsConstructor
public class Company {
	@Override
	public String toString() {
		return "Company [companyName=" + companyName + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}
	private String companyName;
    private String email;
    private int mobileNumber;
}
