package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "sevletTab" , value = "/servletTab")
public class SevletTab extends HttpServlet {


    private List<Person> person;

    @Override
    public void init() throws ServletException {

        person = new ArrayList<>();

        Person person1 = new Person("tata","tata",20);
        Person person2 = new Person("toto","toto",25);
        Person person3 = new Person("titi","titi",30);

        person.add(person1);
        person.add(person2);
        person.add(person3);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("person" , person);


        getServletContext().getRequestDispatcher("/WEB-INF/tableauPersonne.jsp").forward(req,resp);

    }
}
