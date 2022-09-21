package com.cg.dms.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Farmer {
	private int farmerId;
	private String companyName;
	private String email;
	private String mobileNumber;

}
