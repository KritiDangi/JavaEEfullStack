package com.visa.prj.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.visa.prj.entity.Address;
import com.visa.prj.entity.Book;

@Controller
public class BookController {
	
	@Autowired
	private BookValidator validator;
	
	@RequestMapping("bookForm.do")
	public String getBookForm(Model model) {
		model.addAttribute("book",new Book());  //create a model, empty book
		return "bookForm.jsp";   //return the view..server side redirection
	}
	
	@RequestMapping("addBook.do")
	public String addBook(@ModelAttribute("book") Book b, BindingResult errors) {
		
		validator.validate(b, errors);
		if(errors.hasErrors()) {
			return "bookForm.jsp";   //server side redirection
			//dont use client side redirection, error messages will be lost
		}else {
			System.out.println(b);
			System.out.println(b.getPublishedDate());
			System.out.println(b.getPublisherAddress().getCity());
			return "index.jsp";   //return the view..server side redirection
			//return "redirect:index.jsp";   //return the view..client side redirection
			//But the data inside the response(form data) will be gone.
		}
	}
	
	@InitBinder
	public void registrationBinder (WebDataBinder binder) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, false));
		binder.registerCustomEditor(Address.class, new AddressPropertyEditor());
	}
}
