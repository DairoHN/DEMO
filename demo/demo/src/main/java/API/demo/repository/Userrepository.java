package API.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import API.demo.entity.User;

@Repository
public interface Userrepository extends JpaRepository <User, Integer>{
    
}
