package cl.praxis.Tuiter.model.service;

import cl.praxis.Tuiter.model.dto.Tuit;
import cl.praxis.Tuiter.model.repository.TuitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuitServiceImpl implements TuitService {

  TuitRepository repository;

  public TuitServiceImpl(TuitRepository repository) {
    this.repository = repository;
  }

  @Override
  public List<Tuit> findAll() {
    return repository.findAll();
  }
}
