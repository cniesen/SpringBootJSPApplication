package com.niesens.sample.SpringBootJSP;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

import java.io.IOException;
import java.io.StringWriter;

public class SampleFooterTag extends SimpleTagSupport {
    private StringWriter stringWriter = new StringWriter();

    public void doTag() throws JspException, IOException {
        getJspBody().invoke(stringWriter);
        JspWriter out = getJspContext().getOut();
        out.println("<hr/>" + stringWriter.toString());
    }
}
