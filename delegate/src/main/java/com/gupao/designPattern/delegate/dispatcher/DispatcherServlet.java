package com.gupao.designPattern.delegate.dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: wensp
 * @Version: v1.0 2019-3-26
 */
public class DispatcherServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        try{
            doDispatch(req,res);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void doDispatch(HttpServletRequest req, HttpServletResponse res)throws Exception {
        String uri = req.getRequestURI();
        String mid = req.getParameter("mid");

        if(uri.equals("getMemberById")){
            new MemberController().getMemberById(mid);
        }else if(uri.equals("getOrderById")){
            new OrderController().getOrderById(mid);
        }else if(uri.equals("logOut")){
            new SystemController().logOut();
        }else{
            res.getWriter().write("404 not found!");
        }
    }
}
