package cl.praxis.Tuiter.model.repository;

import cl.praxis.Tuiter.model.dto.Tuit;

import java.util.List;

public interface TuitRepository {
  List<Tuit> findAll();
}
