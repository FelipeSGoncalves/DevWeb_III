package br.edu.ifpr.foz.lista_de_exercicios_i;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworld")
public class HelloWorld extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();
        String urlVoltar = "./";

        writer.println("<html>");
        writer.println("<p>Hello World</p>");
        writer.println("<a href="+ urlVoltar +">Voltar</a>");
        writer.println("</html>");
    }
}

