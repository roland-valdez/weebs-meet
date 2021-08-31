//package Services;
//
//import Models.User;
//import Models.UsersWithRoles;
//import dao.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsLoader implements UserDetailsService {
//    private final UserRepository users;
//
//
//    public UserDetailsLoader(UserRepository users) {
//        this.users = users;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = users.findByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("No user found for " + username);
//        }
//
//        return new UsersWithRoles(user);
//    }
//
//}
