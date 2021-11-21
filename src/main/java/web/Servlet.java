
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//La anotacion WebServlet sirve para "nombrar" al Servlet y con este nombres lo llamas en el index
@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    
    //Metodo doPost, ya que es el metodo de envio que utilize
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Con esto digo que la respuesta sera en HTML y le doy el juego de caracteres
        response.setContentType("text/html;charset=UTF-8");
        
        //Request para recuperar datos enviados desde el front
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        String tecnologias[] = request.getParameterValues("tecnologias");
        String genero = request.getParameter("genero");
        String ocupacion = request.getParameter("ocupacion");
        String musica[] = request.getParameterValues("musica");
        String comentario = request.getParameter("comentario");
        
        //Con printWriter creas un objeto de salida para enviar la respuesta a la web
        PrintWriter out = response.getWriter(); 
        //Respuesta en HTML como escribi arriba
        out.print("<html lang='en'>");
        out.print("<head>");
        out.print("<title>Resultado del Servlet</title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Parametros procesados por el Servlet<h/1>");
        out.print("<br/>");
        out.print("<table border='1'>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Usuario: ");
        out.print("</td>");
        out.print("<td>");
        out.print(user);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Password: ");
        out.print("</td>");
        out.print("<td>");
        out.print(password);
        out.print("</td>");
        out.print("</tr>");
        //Utilizo for ya que lo que devuelve es un arreglo
        out.print("<tr>");
        out.print("<td>");
        out.print("Tecnologia: ");
        out.print("</td>");
        out.print("<td>");
        for (String tec : tecnologias) {
            out.print(tec);
            out.print(" / ");
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Genero: ");
        out.print("</td>");
        out.print("<td>");
        out.print(genero);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Ocupacion: ");
        out.print("</td>");
        out.print("<td>");
        out.print(ocupacion);
        out.print("</td>");
        out.print("</tr>");
        //Aca uso IF porque no es obligatorio marcar esto
        out.print("<tr>");
        out.print("<td>");
        out.print("Musica: ");
        out.print("</td>");
        out.print("<td>");
        if(musica == null){
            out.print("Valor no proporcionado"); 
        } 
        if(musica != null){
            for (String musc : musica) {
                out.print(musc);
                out.print(" / ");
            }
        }
        out.print("</td>");
        out.print("</tr>");
        
        out.print("<tr>");
        out.print("<td>");
        out.print("Comentario: ");
        out.print("</td>");
        out.print("<td>");
        out.print(comentario);
        out.print("</td>");
        out.print("</tr>");
        
        out.print("</table>");
        out.print("</body>");
        out.print("</html>");
        
        //Tambien aclaro que el html que devuelvo es bastante malo ya que esto no se suele hacer
        //Esto no se hace porque ya ves lo complejo que es. Lo que se suele utilizar es JSP y aca otra cosa
        //Pero lo hice para mostrar que se puede
    }
    
}
