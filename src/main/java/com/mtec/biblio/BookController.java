package com.mtec.biblio;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/biblioteca")
public class BookController {

	@GetMapping("/book")
	public String getBook(Model model) {
	    Book book = new Book("El Ser y la Nada", "Sartre");
	    model.addAttribute("book", book);
	    return "book";
	}
}

