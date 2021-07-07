package org.springframework.samples.petclinic.visit;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ROVisitRepositoryImpl implements ROVisitRepository {

	private JdbcTemplate jdbcTemplate;

	protected ROVisitRepositoryImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	class VisitDtoRowMapper implements RowMapper<Visit> {
		@Override
		public VisitRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new VisitRecord(rs.getInt("id"),
					LocalDate.parse(rs.getString("visit_date"), DateTimeFormatter.ofPattern("yyyy-MM-dd")),
					rs.getString("description"), rs.getInt("pet_id"));
		}
	}

	@Override
	public List<Visit> findByPetId(Integer petId) {
		return jdbcTemplate.query("SELECT * FROM Visits WHERE pet_id = ?", new VisitDtoRowMapper(), petId);
	}

}