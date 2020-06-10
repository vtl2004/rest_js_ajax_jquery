/*package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.Role;
import web.model.User;

import web.repository.UserRepository;
import web.service.RoleService;
import web.service.UserService;

import java.util.HashSet;
import java.util.Set;

@Controller
@RequestMapping("/admin/")
public class AdminController {

    private UserService userService;
    private RoleService roleService;
    @Autowired
    public AdminController(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }*/


    /*@RequestMapping(value = "users", method = RequestMethod.GET)
    public String getAllUsers(Model model, Authentication authentication) {
        String username = ((UserDetails) authentication.getPrincipal()).getUsername();
        model.addAttribute("username", username);
        model.addAttribute("userlist", userService.findAllUsers());
        model.addAttribute("roles", roleService.findAllRoles());
        model.addAttribute("user_role", authentication.getAuthorities());
        return "userlist_page";
    }*/

   /* @RequestMapping(value = "user-save", method = RequestMethod.POST)
    public String saveUser(@RequestParam(name = "role") String[] roles,
                           User user){
        Set<Role> rolSet = new HashSet<>();
        for (String strRole : roles) {
            Role role = roleService.findByRole(strRole);
            rolSet.add(role);
        }
        user.setRoles(rolSet);
        userService.addUser(user);
        return "redirect:/admin/users";
    }*/

    /*@RequestMapping(value = "user-save", method = RequestMethod.GET)
    public String saveUserPage(Model model) {
        model.addAttribute("roles", roleService.findAllRoles());

        return "add_page";
    }*/

    /*@RequestMapping(value = "user-update", method = RequestMethod.POST)
    public String updateUser(@RequestParam(name = "role") String[] roles,
                             User user) {
        Set<Role> rolSett = new HashSet<>();
        for (String strRole : roles) {
            Role role = roleService.findByRole(strRole);
            rolSett.add(role);
        }
        user.setRoles(rolSett);
        userService.updateUser(user);
        return "redirect:/admin/users";
    }*/

   /* @RequestMapping(value = "user-update", method = RequestMethod.GET)
    public String updateUserPage(Model model) {
        model.addAttribute("roles", roleService.findAllRoles());

        return "update_page";
    }*/

   /* @RequestMapping(value = "user-delete/{id}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable Long id) {
       userService.deleteUser(id);
        return "redirect:/admin/users";
    }

}*/
