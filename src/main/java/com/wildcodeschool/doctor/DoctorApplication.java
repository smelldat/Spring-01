package com.wildcodeschool.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class DoctorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorApplication.class, args);
	}


		@RequestMapping("/")
		@ResponseBody
		public List<String> index() {
			List<String> doctors = new ArrayList<>();
			doctors.add("<a href='http://localhost:8080/1'>William Hartnell</a>");
			doctors.add("<a href='http://localhost:8080/2>Patrick Troughton</a>");
			doctors.add("<a href='http://localhost:8080/3'>Jon Pertwee</a>");
			doctors.add("<a href='http://localhost:8080/4'>Tom Baker</a>");
			return doctors;
		}

	@RequestMapping("/1")
	@ResponseBody
	public String pageOne() {
		return "William Hartnell";
	}

	@RequestMapping("/2")
	@ResponseBody
	public String pageTwo() {
		return "Patrick Troughton";
	}

	@RequestMapping("/3")
	@ResponseBody
	public String pageThree() {
		return "Jon Pertwee";
	}

	@RequestMapping("/4")
	@ResponseBody
	public String pageFour() {
		return "Tom Baker";
	}
}
