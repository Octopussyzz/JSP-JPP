package fr.wildcodeschool.githubtracker.controller;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "GithubersServlet")
public class GithubersServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Githuber andre = new Githuber("Andre", "andre@andre.andre", "Andy", "coucouandy", "www.google.com/images");
        Githuber jean = new Githuber("Jean", "jean@jean.jean", "Jean", "coucoujean", "www.google.com/images");
        Githuber jacques = new Githuber("Jacques", "jacques@jacques.jacques", "Jack", "coucoujack", "www.google.com/images");
        Githuber gold = new Githuber("Gold", "gold@gold.gold", "Goldy", "coucougoldy", "www.google.com/images");
        Githuber man = new Githuber("Man", "man@man.man", "Manu", "coucoumanu", "www.google.com/images");

        ArrayList<Githuber> githubers = new ArrayList<Githuber>();
        githubers.add(andre);
        githubers.add(jean);
        githubers.add(jacques);
        githubers.add(gold);
        githubers.add(man);


        request.setAttribute("githubers", githubers);
        request.getRequestDispatcher("/githubers.jsp").forward(request, response);
    }

}
