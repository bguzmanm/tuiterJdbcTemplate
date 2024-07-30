package cl.praxis.Tuiter.model.repository;

import cl.praxis.Tuiter.model.dto.Tuit;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TuitRepositoryImpl implements TuitRepository {

  JdbcTemplate template;

  public TuitRepositoryImpl(JdbcTemplate template) {
    this.template = template;
  }

  @Override
  public List<Tuit> findAll() {
    return template.query("select id, mensaje from tuit",
            new BeanPropertyRowMapper<>(Tuit.class));
  }
}
