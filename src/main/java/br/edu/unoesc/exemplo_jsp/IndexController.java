package br.edu.unoesc.exemplo_jsp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/jsp")
	String jsp(Model model) {
		Produto p1 = new Produto("Mesa", 10, new BigDecimal("3.33"));
		Produto p2 = new Produto("Cadeira", 20, new BigDecimal("33.33"));
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(p1);
		produtos.add(p2);
		
		model.addAttribute("produto", p1);
		model.addAttribute("produtos", produtos);
		
		return "index";
	}
}
