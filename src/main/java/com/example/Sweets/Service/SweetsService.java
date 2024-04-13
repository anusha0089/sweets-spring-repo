package com.example.Sweets.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Sweets.Entity.Sweets;
import com.example.Sweets.Repo.SweetsRepo;
@Service
public class SweetsService {
@Autowired
SweetsRepo sweetsrepo;


public Sweets addSweetsToDB(Sweets sweets) {
	return sweetsrepo.save(sweets);
}

public List<Sweets> getAllSweets() {
	return sweetsrepo.findAll();
}
public Sweets getSweetsbyID(int id) {
	// TODO Auto-generated method stub
	return sweetsrepo.findById(id).orElse(new Sweets());
}
public List<Sweets> addAllSweetstoDB(List<Sweets> sweetsList) {
	// TODO Auto-generated method stub
	return sweetsrepo.saveAll(sweetsList);
}
}
