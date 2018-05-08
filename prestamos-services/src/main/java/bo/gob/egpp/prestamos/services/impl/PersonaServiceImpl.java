package bo.gob.egpp.prestamos.services.impl;

import java.util.List;
import bo.gob.egpp.prestamos.*;
import bo.gob.egpp.prestamos.model.Persona;
import bo.gob.egpp.prestamos.services.PersonaService;
import org.springframework.stereotype.Service;
import bo.gob.egpp.prestamos.repositories.PersonaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {
	//inyectar el been del repositorio de acceso a datos
	@Autowired // estamos diciendole que busque una implementacion q se adecue
	PersonaRepositories PeRepository;

	
	public Persona get(Integer id) {
		// TODO Auto-generated method stub
		return PeRepository.findOne(id) ;
	}

	
	public List<Persona> list() {
		// TODO Auto-generated method stub
		return PeRepository.findAll();
	}

	@Transactional
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		//borrado fisico
		PeRepository.delete(id);
	}

	@Transactional
	public Persona persist(Persona persona) {
		// TODO Auto-generated method stub
		if (persona.getId() != 0)
		{
			//Consultar a la bd si el ci para comparar con el ci enviado
		}
			
		return PeRepository.saveAndFlush(persona);
	}

}
