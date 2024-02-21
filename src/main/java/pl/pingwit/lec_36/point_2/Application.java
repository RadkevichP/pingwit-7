package pl.pingwit.lec_36.point_2;

import pl.pingwit.lec_35.point_1.User;

import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        CrudRepository<Integer, User> userRepository = new UserRepository();
        ProductRepository productRepository = new ProductRepository();

        Optional<User> byId = userRepository.findById(77);
    }
}
