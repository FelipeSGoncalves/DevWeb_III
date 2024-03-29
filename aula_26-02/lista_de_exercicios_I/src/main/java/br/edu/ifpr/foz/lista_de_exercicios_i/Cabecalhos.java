package br.edu.ifpr.foz.lista_de_exercicios_i;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cabecalhos", value = "/cabecalhos")
public class Cabecalhos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String host = req.getHeader("host");
        String cliente = req.getHeader("user-agent");
        String codificacao = req.getHeader("accept-encoding");
        String idioma = req.getHeader("accept-language");
        String urlVoltar = "./";

        writer.println("<html>");
        writer.println("<p> host: " + host +"</p>");
        writer.println("<p> usuario: " + cliente +"</p>");
        writer.println("<p> codificacao: " + codificacao +"</p>");
        writer.println("<p> idioma: " + idioma+"</p>");
        writer.println("<a href="+ urlVoltar +">Voltar</a>");

        writer.println("</html>");
    }
}
