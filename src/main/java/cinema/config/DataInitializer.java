package cinema.config;

import java.util.Set;
import javax.annotation.PostConstruct;
import cinema.model.User;
import cinema.service.UserService;
import cinema.model.Role;
import cinema.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@admin.admin");
        admin.setPassword("admin");
        admin.setRoles(Set.of(adminRole));
        userService.add(admin);
        User user = new User();
        user.setEmail("user@gmail.com");
        user.setPassword("qwerty");
        user.setRoles(Set.of(userRole));
        userService.add(user);
    }
}
