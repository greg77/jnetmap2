package org.apache.jsp.WEB_002dINF.views.outlets;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(5);
    _jspx_dependants.add("/WEB-INF/tags/form/list.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/table.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/pagination.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/column.tagx");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_page_005flist_005f0(_jspx_page_context))
        return;
      out.write("</div>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_page_005flist_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  page:list
    org.apache.jsp.tag.web.form.list_tagx _jspx_th_page_005flist_005f0 = new org.apache.jsp.tag.web.form.list_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_page_005flist_005f0);
    _jspx_th_page_005flist_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/outlets/list.jspx(5,106) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005flist_005f0.setZ("eHIpztqjBM60SyR5VEg3T8G2jIk=");
    // /WEB-INF/views/outlets/list.jspx(5,106) name = items type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005flist_005f0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${outlets}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/outlets/list.jspx(5,106) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_page_005flist_005f0.setId("pl_org_sio_jnetmap_domain_Outlet");
    _jspx_th_page_005flist_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_page_005flist_005f0, null));
    _jspx_th_page_005flist_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_page_005flist_005f0);
    return false;
  }

  private boolean _jspx_meth_table_005ftable_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:table
    org.apache.jsp.tag.web.form.fields.table_tagx _jspx_th_table_005ftable_005f0 = new org.apache.jsp.tag.web.form.fields.table_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005ftable_005f0);
    _jspx_th_table_005ftable_005f0.setJspContext(_jspx_page_context);
    _jspx_th_table_005ftable_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/outlets/list.jspx(6,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setZ("4vguJEiuXhraKI4YPVtz0oSGshk=");
    // /WEB-INF/views/outlets/list.jspx(6,126) name = path type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setPath("/outlets");
    // /WEB-INF/views/outlets/list.jspx(6,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setId("l_org_sio_jnetmap_domain_Outlet");
    // /WEB-INF/views/outlets/list.jspx(6,126) name = data type = java.util.Collection reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005ftable_005f0.setData((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${outlets}", java.util.Collection.class, (PageContext)_jspx_page_context, null, false));
    _jspx_th_table_005ftable_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_table_005ftable_005f0, null));
    _jspx_th_table_005ftable_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005ftable_005f0);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f0 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f0);
    _jspx_th_table_005fcolumn_005f0.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/outlets/list.jspx(7,117) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f0.setZ("+vH/W6MZD3OyRcV+cTwWS0rji4Y=");
    // /WEB-INF/views/outlets/list.jspx(7,117) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f0.setProperty("num");
    // /WEB-INF/views/outlets/list.jspx(7,117) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f0.setId("c_org_sio_jnetmap_domain_Outlet_num");
    _jspx_th_table_005fcolumn_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f0);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f1 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f1);
    _jspx_th_table_005fcolumn_005f1.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/outlets/list.jspx(8,119) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f1.setZ("L1DwnVzcKKVySxguAPfSNfJ7uNA=");
    // /WEB-INF/views/outlets/list.jspx(8,119) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f1.setProperty("room");
    // /WEB-INF/views/outlets/list.jspx(8,119) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f1.setId("c_org_sio_jnetmap_domain_Outlet_room");
    _jspx_th_table_005fcolumn_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f1);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f2 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f2);
    _jspx_th_table_005fcolumn_005f2.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f2.setParent(_jspx_parent);
    // /WEB-INF/views/outlets/list.jspx(9,119) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f2.setZ("jjLSxWuW9y3P29Fjw2Hw2D5KLH0=");
    // /WEB-INF/views/outlets/list.jspx(9,119) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f2.setProperty("band");
    // /WEB-INF/views/outlets/list.jspx(9,119) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f2.setId("c_org_sio_jnetmap_domain_Outlet_band");
    _jspx_th_table_005fcolumn_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f2);
    return false;
  }

  private boolean _jspx_meth_table_005fcolumn_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  table:column
    org.apache.jsp.tag.web.form.fields.column_tagx _jspx_th_table_005fcolumn_005f3 = new org.apache.jsp.tag.web.form.fields.column_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f3);
    _jspx_th_table_005fcolumn_005f3.setJspContext(_jspx_page_context);
    _jspx_th_table_005fcolumn_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/outlets/list.jspx(10,119) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f3.setZ("cPxr6GmwnaJZwGukdJ+3SevSo8U=");
    // /WEB-INF/views/outlets/list.jspx(10,119) name = property type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f3.setProperty("port");
    // /WEB-INF/views/outlets/list.jspx(10,119) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_table_005fcolumn_005f3.setId("c_org_sio_jnetmap_domain_Outlet_port");
    _jspx_th_table_005fcolumn_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_table_005fcolumn_005f3);
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_table_005ftable_005f0(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_table_005fcolumn_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_table_005fcolumn_005f3(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
          case 1:
            invoke1( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
