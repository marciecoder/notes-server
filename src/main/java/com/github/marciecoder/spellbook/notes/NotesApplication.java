package com.github.marciecoder.spellbook.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.support.WebStack;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableHypermediaSupport(
		type = EnableHypermediaSupport.HypermediaType.HAL_FORMS,
		stacks = WebStack.WEBFLUX
)
@EnableWebMvc
@SpringBootApplication
public class NotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesApplication.class, args);
	}

}
