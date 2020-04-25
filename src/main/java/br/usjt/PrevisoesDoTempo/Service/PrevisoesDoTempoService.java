package br.usjt.PrevisoesDoTempo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisoesDoTempo.Model.PrevisoesDoTempo;
import br.usjt.PrevisoesDoTempo.Repository.PrevisoesDoTempoRepository;


@Service
public class PrevisoesDoTempoService {
	@Autowired
	private PrevisoesDoTempoRepository previsoesDoTempoRepositoy;
	public List<PrevisoesDoTempo> listarTudo(){		
		return previsoesDoTempoRepositoy.findAll();
	}
	public void salvar(PrevisoesDoTempo previsoesDoTempo) {	
		previsoesDoTempoRepositoy.save(previsoesDoTempo);
	}
}
