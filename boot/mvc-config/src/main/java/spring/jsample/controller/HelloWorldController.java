package spring.jsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	/**
	 * Following controller will map with these URLs -
	 * 
	 * http://localhost:8080/ 
	 * http://localhost:8080/hello
	 * http://localhost:8080/?param=Spring 
	 * http://localhost:8080/hello?param=Spring
	 * 
	 * URLs are case sensitive.
	 */
	@RequestMapping(value = { "/", "/hello" })
	/**
	 * It can accept one optional parameter with name - "param".
	 * 
	 * If other parameters are also passed, they will be ignored.
	 * 
	 * If multiple parameters with name "param" are passed, value of each parameter
	 * will be appended and separated by "," in variable "paramValue"
	 * 
	 * E.g. URL http://localhost:8080/hello?param=Spring&param=MVC
	 * 
	 * will result in "Spring,MVC"
	 * 
	 */
	public String hello(@RequestParam(value = "param", required = false, defaultValue = "World") String param,
			Model model) {
		model.addAttribute("name", param);
		return "hellospring";

	}
}