package pl.pingwit.lec_27.point_4;

public class UserConverter {

    public UserEntity convertToEntity(UserDTO dto) {
        return new UserEntity(dto.getId(), dto.getName(), dto.getSurname());
    }

    public UserDTO convertToDto(UserEntity entity) {
        return new UserDTO(entity.getId(), entity.getName(), entity.getSurname());
    }
}
