package org.learn.servelet;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.learn.model.User;
import org.learn.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");

        if(id == null || name == null || email == null || mobile == null){
            response.setStatus(400);
            response.setContentType("application/json");
            response.getWriter().write("\"{\n" +
                    "    message:\"all the fields are required\"\n" +
                    "}");

            return;
        }

        User user = new User(id,name,email,mobile);

        User createdUser = userService.createUser(user);

        response.setStatus(201);
        response.setContentType("application/json");
        response.getWriter().write("\"{\n" +
                "    message:\"User added successfully\"\n" +
                "}");


    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        String idparam = request.getParameter("id");

            if(idparam == null){
                List<User> users = userService.getAllUsers();
                response.setStatus(200);
                response.setContentType("application/json");
                response.getWriter().write(usersToJson(users));
                return;
            }
        Integer id = Integer.parseInt(idparam);

            User userRes = userService.getUserById(id);

            if(userRes == null){
                response.setStatus(404);
                response.setContentType("application/json");
                return;
            }

            response.setStatus(200);
            response.setContentType("application/json");

        response.getWriter().write(userToJson(userRes));

    }

    @Override
    public void doPut(HttpServletRequest request, HttpServletResponse response){

    }

    @Override
    public void doDelete(HttpServletRequest request, HttpServletResponse response){

    }


    public String userToJson(User user){
        return "{\n" +
                "    \"id\": " + user.getId() + ",\n" +
                "    \"name\": \"" + user.getName() + "\",\n" +
                "    \"email\": \"" + user.getEmail() + "\",\n" +
                "    \"mobile\": \"" + user.getMobile() + "\"\n" +
                "}";
    }

    public String usersToJson(List<User> users){
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for(int i = 0; i<users.size(); i++){
            sb.append(userToJson(users.get(i)));


            if(i < users.size() -1){
                sb.append(",");
            }

        }

        sb.append("]");
        return sb.toString();

    }
}
