/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fvgprinc.app.web.reggastos.actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

/**
 *
 * @author garfi
 */

@Namespace(value = "/")
@Action(value ="testaction", results = {
    @Result(name = SUCCESS, location = "/test.jsp")})
public class TestAction extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
