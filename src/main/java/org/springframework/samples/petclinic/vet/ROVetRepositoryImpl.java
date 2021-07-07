//package org.springframework.samples.petclinic.vet;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Collection;
//
//
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//
//public class ROVetRepositoryImpl implements ROVetRepository {
//	private JdbcTemplate jdbcTemplate;
//
//	protected ROVetRepositoryImpl(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}
//
//	@Override
//	public Collection<VetDto> findAll() throws DataAccessException {
//		return jdbcTemplate.query("SELECT * FROM Vets INNER JOIN vet_specialties ON vet_id ", new VetDtoRowMapper());
//	}
//
//	class VetDtoRowMapper implements RowMapper<VetDto> {
//		@Override
//		public VetDto mapRow(ResultSet rs, int rowNum) throws SQLException {
////			Integer id, String firstName, String lastName, Collection<Specialty> specialties
//			return new VetDto(rs.getInt("id"), rs.getString("firstName"), rs.getString("lastName"), rs.get);
//		}
//	}
//
//}
