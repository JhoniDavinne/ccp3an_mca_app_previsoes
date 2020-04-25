package br.usjt.PrevisoesDoTempo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.PrevisoesDoTempo.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public Usuario findOneByLoginAndSenha(String login, String senha);
	
}
