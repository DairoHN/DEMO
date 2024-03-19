package API.demo.service;
import org.springframework.stereotype.Service;
import API.demo.entity.User;
import API.demo.repository.Userrepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final Userrepository userRepo;
    public void createUsuario (User user)
    {
        userRepo.save(user);
    }
}
