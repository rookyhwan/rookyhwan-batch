package me.blog.rookyhwan.model;

import java.util.List;

import lombok.Data;

@Data
public class SampleModel {
	private String updateTime;
	private String name;
	private Integer population;
	private List<String> states;
}
