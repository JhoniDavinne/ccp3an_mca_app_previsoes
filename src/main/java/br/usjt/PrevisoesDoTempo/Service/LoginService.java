package br.usjt.PrevisoesDoTempo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.PrevisoesDoTempo.Model.Usuario;
import br.usjt.PrevisoesDoTempo.Repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	
	public boolean entrada (Usuario usuario) {
		
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}
