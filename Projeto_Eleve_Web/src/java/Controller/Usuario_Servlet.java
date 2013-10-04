/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import dao.DAOUsuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Leonardo
 */
@WebServlet(name = "Usuario_Servlet", urlPatterns = {"/Usuario_Servlet"})
public class Usuario_Servlet extends HttpServlet {

    String op;
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
        
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        op = request.getParameter(op);
        HttpSession session = request.getSession();
        
        DAOUsuario daoUsuario = new DAOUsuario();
        
        if (op.equals("insert")){
            String Pnome = request.getParameter("Pnome");
            String Snome = request.getParameter("Snome");
            String dia = request.getParameter("dia");
            String mes = request.getParameter("mes");
            String ano = request.getParameter("ano");
            String sexo = request.getParameter("sexo");
            String cidade = request.getParameter("cidade");
            String estado = request.getParameter("uf");
            String telefone = request.getParameter("telefone");
            String celular = request.getParameter("celular");
            String representacao = request.getParameter("representacao");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            Usuario u = new Usuario();
            u.setPrimeiroNome(request.getParameter("Pnome"));
            u.setSobrenome(request.getParameter("Snome"));
            //u.setDataNascimento("data");
            
        }
        
        
        
        
    }

      
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
