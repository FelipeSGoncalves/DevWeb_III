package br.edu.ifpr.foz.lista_de_exercicios_i;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/requisicao")
public class Requisicao extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintWriter writer = resp.getWriter();

        String metodo = req.getMethod();
        String url = req.getRequestURI();
        String protocolo = req.getProtocol();
        String endereco = req.getRemoteAddr();
        String urlVoltar = "./";

        writer.println("<html>");
        writer.println("<p> metodo: " + metodo +"</p>");
        writer.println("<p> url: " + url +"</p>");
        writer.println("<p> protocolo: " + protocolo +"</p>");
        writer.println("<p> endereco: " + endereco +"</p>");
        writer.println("<a href="+ urlVoltar +">Voltar</a>");

        writer.println("</html>");

    }
}
