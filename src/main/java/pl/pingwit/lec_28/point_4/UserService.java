package pl.pingwit.lec_28.point_4;

public interface UserService {

    UserDTO findUserById(Long id);

    Long saveUser(UserDTO userDTO);
}
