package com.example.test_repo_jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestRepoJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRepoJenkinsApplication.class, args);
	}

	public static void test(){
		System.out.println("Testing app....");
	}

}
