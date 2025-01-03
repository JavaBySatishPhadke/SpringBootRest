package com.sp.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Farmer {

	private Integer fid;
	private String fname;
	private String faddrs;
	private String[] colors;
	private boolean indian;
	private String cropName;
	private List<String> nickName;
	private Set<Long> phones;
	private Map<String, Object> idDetails;
	private Land landDetails;

}
