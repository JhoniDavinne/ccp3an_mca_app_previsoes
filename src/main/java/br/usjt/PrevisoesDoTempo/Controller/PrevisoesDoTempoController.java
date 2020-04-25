package br.usjt.PrevisoesDoTempo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.PrevisoesDoTempo.Repository.PrevisoesDoTempoRepository;
import br.usjt.PrevisoesDoTempo.Model.PrevisoesDoTempo;

@Controller
public class PrevisoesDoTempoController {

	@Autowired
	private PrevisoesDoTempoRepository previsaoRepository;
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/previsoes";
	}
	
		@GetMapping("/previsoes")
		public ModelAndView listarPrevisoes() {
			ModelAndView mv = new ModelAndView("previsoes_listagem");
			List<PrevisoesDoTempo> previsoesTempo = previsaoRepository.findAll();
			mv.addObject("previsoesTemp", previsoesTempo);
			mv.addObject(new PrevisoesDoTempo());

			return mv;

	}
}
