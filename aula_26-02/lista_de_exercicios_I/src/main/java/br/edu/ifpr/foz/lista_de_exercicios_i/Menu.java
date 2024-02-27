package br.edu.ifpr.foz.lista_de_exercicios_i;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("")
public class Menu extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        String url2 = "./helloworld";
        String url3 = "./requisicao";
        String url4 = "./cabecalhos";


        writer.println("<html>");
        writer.println("<a href="+ url2 + ">HelloWorld</a>");
        writer.println("<br>");
        writer.println("<a href="+ url3 + ">Informacoes Requisicao</a>");
        writer.println("<br>");
        writer.println("<a href="+ url4 + ">Informacoes Cabecalhos</a>");
        writer.println("</html>");

    }
}
