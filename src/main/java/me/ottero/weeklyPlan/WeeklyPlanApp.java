package me.ottero.weeklyPlan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class WeeklyPlanApp implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(WeeklyPlanApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// String sql = "INSERT INTO task ()"

	}

}