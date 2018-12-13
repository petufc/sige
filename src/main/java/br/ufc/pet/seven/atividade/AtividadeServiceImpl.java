package br.ufc.pet.seven.atividade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class AtividadeServiceImpl implements AtividadeService {
	@Autowired
	AtividadeRepository repo;
	
	@Override
	public List<Atividade> readAtividades() {
		return repo.findAll();
	}

	@Override
	public Atividade readAtividadeById(int id) {
		return repo.getById(id);
	}

	@Override
	public Atividade createAtividade(Atividade atividade) {
		return repo.save(atividade);
	}

	@Override
	public void deleteAtividade(Atividade atividade) {
		repo.delete(atividade);
	}

	@Override
	public Atividade updateAtividade(Atividade atividade) {
		return null;
	}

}