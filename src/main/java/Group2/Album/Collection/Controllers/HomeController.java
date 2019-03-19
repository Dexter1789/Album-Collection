package Group2.Album.Collection.Controllers;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

//	@GetMapping("/")
	public String home() {
		return "index";
	}
}