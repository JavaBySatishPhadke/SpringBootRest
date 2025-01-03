package com.sp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Land {
	private Integer passBookNo;
	private String landArea;
	private String villeage;
	private String type;
}
