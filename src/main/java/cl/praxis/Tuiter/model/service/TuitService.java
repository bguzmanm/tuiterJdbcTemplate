package cl.praxis.Tuiter.model.service;

import cl.praxis.Tuiter.model.dto.Tuit;

import java.util.List;

public interface TuitService {
  List<Tuit> findAll();
}
