package me.blog.rookyhwan.task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import me.blog.rookyhwan.model.SampleModel;

@Slf4j
@Component
public class SampleTask {

	// 1. @Scheduled - Cron
//	@Scheduled(cron="*/10 * * * * *")	
//	public void task1() {
//		System.out.println("task1 : " + LocalDateTime.now());
//	}
	
	@Scheduled(cron="*/10 * * * * *")
	public void task2() {
		
		System.out.println(">>>>>>>>>>>>> task2 : " + LocalDateTime.now());
		
		SampleModel sampleModel = new SampleModel();  
		sampleModel.setName("India");
		sampleModel.setPopulation(1000000);

	    List<String> listOfStates = new ArrayList<String>();  
	    listOfStates.add("Madhya Pradesh");  
	    listOfStates.add("Maharastra");  
	    listOfStates.add("Rajasthan");
	    sampleModel.setStates(listOfStates);
	    
	    sampleModel.setUpdateTime(LocalDateTime.now().toString());
	    
	    ObjectMapper mapper = new ObjectMapper();
	    
	    try {
	    	String path = "target/json/sample/sample.json";
	    	ClassPathResource resource = new ClassPathResource(path);
	    	byte[] encoded = Files.readAllBytes(Paths.get(resource.getURI()));
			System.out.println("-----------> " + new String(encoded));
	        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(resource.getURI()), sampleModel);

	    } catch (IOException e) {  
	        e.printStackTrace();  
	    }
	}
}