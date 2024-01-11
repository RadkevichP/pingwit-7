package pl.pingwit.lec_27.point_4;

import pl.pingwit.lec_13.point_4.PingwitException;

public class UserServiceImpl implements UserService {

    private final Repository<Long, UserEntity> userRepository;
    private final UserConverter userConverter;

    public UserServiceImpl(Repository<Long, UserEntity> userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    public UserDTO findUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id)
                .orElseThrow(() -> new PingwitException("User not found: " + id));
        return userConverter.convertToDto(userEntity);
    }

    @Override
    public Long saveUser(UserDTO userDTO) {
        UserEntity userEntity = userConverter.convertToEntity(userDTO);
        return userRepository.save(userEntity);
    }
}
