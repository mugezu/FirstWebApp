package controller;

import com.google.gson.Gson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 15.11.2016.
 */
public class Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Gson gson= new Gson();
        StringBuilder string=new StringBuilder();
        int c;
        FileReader reader= new FileReader(new File("C:\\Users\\user\\IdeaProjects\\web\\src\\main\\webapp\\front.html"));
        while((c=reader.read())!=-1)
            string.append((char)c);
        response.getWriter().write(string.toString());
    }
}
