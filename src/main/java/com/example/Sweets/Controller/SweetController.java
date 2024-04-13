package com.example.Sweets.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Sweets.Entity.Sweets;
import com.example.Sweets.Service.SweetsService;

@RestController
@RequestMapping("/Anusha")
public class SweetController {
	@Autowired
     SweetsService SweetsService;
	
	@PostMapping("/Sweets/add")
	public Sweets addNewSweets(@RequestBody Sweets sweets) {
		//System.out.println("image List--->"+sweets.getImgesList());
		return SweetsService.addSweetsToDB(sweets);
	}
	@PostMapping("/Sweets/all")
	public List<Sweets> addAllNewSWeets(@RequestBody List<Sweets> sweetsList) {
		
		return SweetsService.addAllSweetstoDB(sweetsList);
	}
	
	@GetMapping("/Sweets/get")
	public List<Sweets> getAll(){
		return SweetsService.getAllSweets();
	}
	
	@GetMapping("/Sweets/{id}")
	public Sweets geSweetsById(@PathVariable int id) {
		return SweetsService.getSweetsbyID(id);
	}

} 
