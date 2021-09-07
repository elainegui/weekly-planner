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
		// String sql = "INSERT INTO task (id, description, start_date_time,
		// finish_date_time, id_priority) VALUES(?,?,?,?,?)";
		// int result = jdbcTemplate.update(sql, "25", "volleyball", "2021-08-26
		// 16:00:00", "2021-08-26 17:30:00", "2");

		// String sql2 = "";


		// if (result > 0) {
		// System.out.println("A new row has been inserted");
		// }


	}

}