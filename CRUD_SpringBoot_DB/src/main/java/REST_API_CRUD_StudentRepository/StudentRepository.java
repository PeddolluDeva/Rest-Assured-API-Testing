package REST_API_CRUD_StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import REST_API_CRUD_Entity.stud;


public interface StudentRepository extends JpaRepository<stud, Integer>{

	
	
}
