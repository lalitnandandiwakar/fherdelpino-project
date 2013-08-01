/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.taglib;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author delpinof
 */
public class TagHandler extends SimpleTagSupport {
    private String name;

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            // TODO: insert code to write html before writing the body content.
            // e.g.:
            //
            out.println("<strong>" + name + "</strong>");
             out.println("    <blockquote>");

            JspFragment f = getJspBody();
            if (f != null) {
                f.invoke(out);
            }

            // TODO: insert code to write html after writing the body content.
            // e.g.:
            //
             out.println(" hola "+ name +"   </blockquote>");

        } catch (java.io.IOException ex) {
            throw new JspException("Error in TagHandler tag", ex);
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}
