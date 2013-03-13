package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/WEB-INF/tags/menu/menu.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/category.tagx");
    _jspx_dependants.add("/WEB-INF/tags/menu/item.tagx");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.release();
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

      out.write("<div version=\"2.0\" id=\"menu\">");
      if (_jspx_meth_menu_005fmenu_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_menu_005fmenu_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:menu
    org.apache.jsp.tag.web.menu.menu_tagx _jspx_th_menu_005fmenu_005f0 = new org.apache.jsp.tag.web.menu.menu_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fmenu_005f0);
    _jspx_th_menu_005fmenu_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/menu.jspx(5,60) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fmenu_005f0.setZ("nZaf43BjUg1iM0v70HJVEsXDopc=");
    // /WEB-INF/views/menu.jspx(5,60) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fmenu_005f0.setId("_menu");
    _jspx_th_menu_005fmenu_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_menu_005fmenu_005f0, null));
    _jspx_th_menu_005fmenu_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fmenu_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f0 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f0);
    _jspx_th_menu_005fcategory_005f0.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f0.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(6,69) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f0.setZ("sXSj/u1XD51SshWmn7N8rGrks5U=");
    // /WEB-INF/views/menu.jspx(6,69) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f0.setId("c_vlan");
    _jspx_th_menu_005fcategory_005f0.setJspBody(new Helper( 1, _jspx_page_context, _jspx_th_menu_005fcategory_005f0, null));
    _jspx_th_menu_005fcategory_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f0);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(7,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f0.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f0 = _jspx_th_sec_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f0(_jspx_th_sec_005fauthorize_005f0, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f0 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f0);
    _jspx_th_menu_005fitem_005f0.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f0.setParent(_jspx_th_sec_005fauthorize_005f0);
    // /WEB-INF/views/menu.jspx(8,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setZ("kA2BwEY9NKeP5qjczZSmG9B37hw=");
    // /WEB-INF/views/menu.jspx(8,126) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setUrl("/vlans?form");
    // /WEB-INF/views/menu.jspx(8,126) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(8,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f0.setId("i_vlan_new");
    _jspx_th_menu_005fitem_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f0);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f1 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f1);
    _jspx_th_menu_005fitem_005f1.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(10,173) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setZ("GQi1u7Zx9uInDWKt9ItYQptl2QA=");
    // /WEB-INF/views/menu.jspx(10,173) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/vlans?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(10,173) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(10,173) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f1.setId("i_vlan_list");
    _jspx_th_menu_005fitem_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f1 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f1);
    _jspx_th_menu_005fcategory_005f1.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f1.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(12,71) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f1.setZ("XAewNV7PCgJY1RCekB0UJBh21cc=");
    // /WEB-INF/views/menu.jspx(12,71) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f1.setId("c_outlet");
    _jspx_th_menu_005fcategory_005f1.setJspBody(new Helper( 2, _jspx_page_context, _jspx_th_menu_005fcategory_005f1, null));
    _jspx_th_menu_005fcategory_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f1);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f1.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(13,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f1.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f1 = _jspx_th_sec_005fauthorize_005f1.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f2(_jspx_th_sec_005fauthorize_005f1, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f1);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f1);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f2 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f2);
    _jspx_th_menu_005fitem_005f2.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f2.setParent(_jspx_th_sec_005fauthorize_005f1);
    // /WEB-INF/views/menu.jspx(14,130) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setZ("SwaibcxWtcLUdXZCcnJ3guto0sA=");
    // /WEB-INF/views/menu.jspx(14,130) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setUrl("/outlets?form");
    // /WEB-INF/views/menu.jspx(14,130) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(14,130) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f2.setId("i_outlet_new");
    _jspx_th_menu_005fitem_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f2);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f3 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f3);
    _jspx_th_menu_005fitem_005f3.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(16,177) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setZ("UtCK4o4rHYnBsIL+WM2UsUkIjRo=");
    // /WEB-INF/views/menu.jspx(16,177) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/outlets?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(16,177) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(16,177) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f3.setId("i_outlet_list");
    _jspx_th_menu_005fitem_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f3);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f2 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f2);
    _jspx_th_menu_005fcategory_005f2.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f2.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(18,69) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f2.setZ("AQtGIFFAfHYtB3sbUGtQkNHYCSE=");
    // /WEB-INF/views/menu.jspx(18,69) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f2.setId("c_band");
    _jspx_th_menu_005fcategory_005f2.setJspBody(new Helper( 3, _jspx_page_context, _jspx_th_menu_005fcategory_005f2, null));
    _jspx_th_menu_005fcategory_005f2.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f2);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f2.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(19,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f2.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f2 = _jspx_th_sec_005fauthorize_005f2.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f4(_jspx_th_sec_005fauthorize_005f2, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f2);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f2);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f4 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f4);
    _jspx_th_menu_005fitem_005f4.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f4.setParent(_jspx_th_sec_005fauthorize_005f2);
    // /WEB-INF/views/menu.jspx(20,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setZ("IQePhXteNP7QMSX9GsMXlnPbq+k=");
    // /WEB-INF/views/menu.jspx(20,126) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setUrl("/bands?form");
    // /WEB-INF/views/menu.jspx(20,126) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(20,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f4.setId("i_band_new");
    _jspx_th_menu_005fitem_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f4);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f5 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f5);
    _jspx_th_menu_005fitem_005f5.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f5.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(22,173) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setZ("2hMT1vNy6HEgQvK+34jteQSWzXo=");
    // /WEB-INF/views/menu.jspx(22,173) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/bands?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(22,173) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(22,173) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f5.setId("i_band_list");
    _jspx_th_menu_005fitem_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f5);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f3 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f3);
    _jspx_th_menu_005fcategory_005f3.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f3.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(24,70) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f3.setZ("fMQIKVbE+qOUgIHSPASj4cw4lVM=");
    // /WEB-INF/views/menu.jspx(24,70) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f3.setId("c_sonde");
    _jspx_th_menu_005fcategory_005f3.setJspBody(new Helper( 4, _jspx_page_context, _jspx_th_menu_005fcategory_005f3, null));
    _jspx_th_menu_005fcategory_005f3.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f3);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f3.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(25,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f3.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f3 = _jspx_th_sec_005fauthorize_005f3.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f6(_jspx_th_sec_005fauthorize_005f3, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f3);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f3);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f6 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f6);
    _jspx_th_menu_005fitem_005f6.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f6.setParent(_jspx_th_sec_005fauthorize_005f3);
    // /WEB-INF/views/menu.jspx(26,128) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setZ("GWZx9vdVFGpmv7CrZciNnQySpI0=");
    // /WEB-INF/views/menu.jspx(26,128) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setUrl("/sondes?form");
    // /WEB-INF/views/menu.jspx(26,128) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(26,128) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f6.setId("i_sonde_new");
    _jspx_th_menu_005fitem_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f6);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f7 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f7);
    _jspx_th_menu_005fitem_005f7.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f7.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(28,175) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setZ("wEBHchF7x/O5XL5ewRsxyARfbyI=");
    // /WEB-INF/views/menu.jspx(28,175) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/sondes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(28,175) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(28,175) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f7.setId("i_sonde_list");
    _jspx_th_menu_005fitem_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f7);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f4 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f4);
    _jspx_th_menu_005fcategory_005f4.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f4.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(30,69) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f4.setZ("z1MhI2/6D1CKWHgDQf09mE6g7GM=");
    // /WEB-INF/views/menu.jspx(30,69) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f4.setId("c_port");
    _jspx_th_menu_005fcategory_005f4.setJspBody(new Helper( 5, _jspx_page_context, _jspx_th_menu_005fcategory_005f4, null));
    _jspx_th_menu_005fcategory_005f4.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f4);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f4 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f4.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(31,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f4.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f4 = _jspx_th_sec_005fauthorize_005f4.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f8(_jspx_th_sec_005fauthorize_005f4, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f4);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f4);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f8 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f8);
    _jspx_th_menu_005fitem_005f8.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f8.setParent(_jspx_th_sec_005fauthorize_005f4);
    // /WEB-INF/views/menu.jspx(32,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setZ("/BJyKFyVBMHXU7BdqDkWL5vwV9Y=");
    // /WEB-INF/views/menu.jspx(32,126) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setUrl("/ports?form");
    // /WEB-INF/views/menu.jspx(32,126) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(32,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f8.setId("i_port_new");
    _jspx_th_menu_005fitem_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f8);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f9 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f9);
    _jspx_th_menu_005fitem_005f9.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f9.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(34,173) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setZ("9q3jy8Hd1umRO+iZjYBEfJv45PQ=");
    // /WEB-INF/views/menu.jspx(34,173) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/ports?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(34,173) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(34,173) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f9.setId("i_port_list");
    _jspx_th_menu_005fitem_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f9);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f5 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f5);
    _jspx_th_menu_005fcategory_005f5.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f5.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(36,69) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f5.setZ("e3e6qTdks0EVUaGbVSSNbM0HcXc=");
    // /WEB-INF/views/menu.jspx(36,69) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f5.setId("c_room");
    _jspx_th_menu_005fcategory_005f5.setJspBody(new Helper( 6, _jspx_page_context, _jspx_th_menu_005fcategory_005f5, null));
    _jspx_th_menu_005fcategory_005f5.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f5);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f5 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f5.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(37,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f5.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f5 = _jspx_th_sec_005fauthorize_005f5.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f10(_jspx_th_sec_005fauthorize_005f5, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f5);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f5);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f10 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f10);
    _jspx_th_menu_005fitem_005f10.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f10.setParent(_jspx_th_sec_005fauthorize_005f5);
    // /WEB-INF/views/menu.jspx(38,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setZ("fvAkKg908k/4/1ftKfhIuAeNmjE=");
    // /WEB-INF/views/menu.jspx(38,126) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setUrl("/rooms?form");
    // /WEB-INF/views/menu.jspx(38,126) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(38,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f10.setId("i_room_new");
    _jspx_th_menu_005fitem_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f10);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f11 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f11);
    _jspx_th_menu_005fitem_005f11.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f11.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(40,173) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setZ("M5XFOS8myAtDzhNTcTwqAph0QtQ=");
    // /WEB-INF/views/menu.jspx(40,173) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/rooms?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(40,173) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(40,173) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f11.setId("i_room_list");
    _jspx_th_menu_005fitem_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f11);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f6 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f6);
    _jspx_th_menu_005fcategory_005f6.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f6.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(42,73) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f6.setZ("J9clnJj+tz7CpJ+H0c4cOuO6+NY=");
    // /WEB-INF/views/menu.jspx(42,73) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f6.setId("c_building");
    _jspx_th_menu_005fcategory_005f6.setJspBody(new Helper( 7, _jspx_page_context, _jspx_th_menu_005fcategory_005f6, null));
    _jspx_th_menu_005fcategory_005f6.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f6);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f6 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f6.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(43,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f6.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f6 = _jspx_th_sec_005fauthorize_005f6.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f12(_jspx_th_sec_005fauthorize_005f6, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f6);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f6);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f12 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f12);
    _jspx_th_menu_005fitem_005f12.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f12.setParent(_jspx_th_sec_005fauthorize_005f6);
    // /WEB-INF/views/menu.jspx(44,134) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setZ("W9U4jfbgN6FR3/HJqEl19rKCnl4=");
    // /WEB-INF/views/menu.jspx(44,134) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setUrl("/buildings?form");
    // /WEB-INF/views/menu.jspx(44,134) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(44,134) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f12.setId("i_building_new");
    _jspx_th_menu_005fitem_005f12.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f12);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f13 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f13);
    _jspx_th_menu_005fitem_005f13.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f13.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(46,181) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setZ("C+A3s/AOSJHp8jjl/SXK0jf0D9c=");
    // /WEB-INF/views/menu.jspx(46,181) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/buildings?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(46,181) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(46,181) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f13.setId("i_building_list");
    _jspx_th_menu_005fitem_005f13.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f13);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f7 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f7);
    _jspx_th_menu_005fcategory_005f7.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f7.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(48,75) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f7.setZ("EFsCDrXCfGAzfelby9W2Aj0uTxQ=");
    // /WEB-INF/views/menu.jspx(48,75) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f7.setId("c_dispatcher");
    _jspx_th_menu_005fcategory_005f7.setJspBody(new Helper( 8, _jspx_page_context, _jspx_th_menu_005fcategory_005f7, null));
    _jspx_th_menu_005fcategory_005f7.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f7);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f7 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f7.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(49,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f7.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f7 = _jspx_th_sec_005fauthorize_005f7.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f14(_jspx_th_sec_005fauthorize_005f7, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f7);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f7);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f14 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f14);
    _jspx_th_menu_005fitem_005f14.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f14.setParent(_jspx_th_sec_005fauthorize_005f7);
    // /WEB-INF/views/menu.jspx(50,138) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setZ("LzopdlKwmpNL6lOvpF8OQXduCCY=");
    // /WEB-INF/views/menu.jspx(50,138) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setUrl("/dispatchers?form");
    // /WEB-INF/views/menu.jspx(50,138) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(50,138) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f14.setId("i_dispatcher_new");
    _jspx_th_menu_005fitem_005f14.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f14);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f15 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f15);
    _jspx_th_menu_005fitem_005f15.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f15.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(52,185) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setZ("nL3GNjp1KeWFtj2lhQbAlsyby3g=");
    // /WEB-INF/views/menu.jspx(52,185) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/dispatchers?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(52,185) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(52,185) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f15.setId("i_dispatcher_list");
    _jspx_th_menu_005fitem_005f15.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f15);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f8 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f8);
    _jspx_th_menu_005fcategory_005f8.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f8.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(54,74) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f8.setZ("BtIKieAwCoo5ZkGn3rpXP9MevWo=");
    // /WEB-INF/views/menu.jspx(54,74) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f8.setId("c_netmodule");
    _jspx_th_menu_005fcategory_005f8.setJspBody(new Helper( 9, _jspx_page_context, _jspx_th_menu_005fcategory_005f8, null));
    _jspx_th_menu_005fcategory_005f8.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f8);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f8 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f8.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(55,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f8.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f8 = _jspx_th_sec_005fauthorize_005f8.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f16(_jspx_th_sec_005fauthorize_005f8, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f8);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f8);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f16(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f16 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f16);
    _jspx_th_menu_005fitem_005f16.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f16.setParent(_jspx_th_sec_005fauthorize_005f8);
    // /WEB-INF/views/menu.jspx(56,136) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f16.setZ("KfKcRbzzYzBVmZAHBxC5PCDtRwA=");
    // /WEB-INF/views/menu.jspx(56,136) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f16.setUrl("/netmodules?form");
    // /WEB-INF/views/menu.jspx(56,136) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f16.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(56,136) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f16.setId("i_netmodule_new");
    _jspx_th_menu_005fitem_005f16.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f16);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f17 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f17);
    _jspx_th_menu_005fitem_005f17.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f17.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(58,183) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f17.setZ("j8oOCcTrfLnZCP/ie+YLeOeHkuk=");
    // /WEB-INF/views/menu.jspx(58,183) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f17.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/netmodules?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(58,183) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f17.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(58,183) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f17.setId("i_netmodule_list");
    _jspx_th_menu_005fitem_005f17.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f17);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f9 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f9);
    _jspx_th_menu_005fcategory_005f9.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f9.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(60,74) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f9.setZ("P7keCSL44Y/TM02CMQZEeDP5zcI=");
    // /WEB-INF/views/menu.jspx(60,74) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f9.setId("c_netswitch");
    _jspx_th_menu_005fcategory_005f9.setJspBody(new Helper( 10, _jspx_page_context, _jspx_th_menu_005fcategory_005f9, null));
    _jspx_th_menu_005fcategory_005f9.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f9);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f9 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f9.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(61,54) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f9.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f9 = _jspx_th_sec_005fauthorize_005f9.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fitem_005f18(_jspx_th_sec_005fauthorize_005f9, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f9);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f9);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f18(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f18 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f18);
    _jspx_th_menu_005fitem_005f18.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f18.setParent(_jspx_th_sec_005fauthorize_005f9);
    // /WEB-INF/views/menu.jspx(62,137) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f18.setZ("+2PRlZ6ctRQd6Vv4hjA7FCeVyqY=");
    // /WEB-INF/views/menu.jspx(62,137) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f18.setUrl("/netswitches?form");
    // /WEB-INF/views/menu.jspx(62,137) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f18.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(62,137) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f18.setId("i_netswitch_new");
    _jspx_th_menu_005fitem_005f18.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f18);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f19 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f19);
    _jspx_th_menu_005fitem_005f19.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f19.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(64,184) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f19.setZ("FdI4cs+fHyAklqImyRqf9q0kkQo=");
    // /WEB-INF/views/menu.jspx(64,184) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f19.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/netswitches?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(64,184) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f19.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(64,184) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f19.setId("i_netswitch_list");
    _jspx_th_menu_005fitem_005f19.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f19);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f10 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f10);
    _jspx_th_menu_005fcategory_005f10.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f10.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(66,75) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f10.setZ("nj8Dm3hojIyIEyPkwE1UMDIs+K8=");
    // /WEB-INF/views/menu.jspx(66,75) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f10.setId("c_controller");
    _jspx_th_menu_005fcategory_005f10.setJspBody(new Helper( 11, _jspx_page_context, _jspx_th_menu_005fcategory_005f10, null));
    _jspx_th_menu_005fcategory_005f10.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f10);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f20 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f20);
    _jspx_th_menu_005fitem_005f20.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f20.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(67,145) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f20.setZ("BHbX3r1ZN+RhTwLKW6r8G97gKzc=");
    // /WEB-INF/views/menu.jspx(67,145) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f20.setUrl("/uc/admin/index");
    // /WEB-INF/views/menu.jspx(67,145) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f20.setMessageCode("global_generic");
    // /WEB-INF/views/menu.jspx(67,145) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f20.setId("i_controller__uc_adminindex_id");
    _jspx_th_menu_005fitem_005f20.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f20);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f21 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f21);
    _jspx_th_menu_005fitem_005f21.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f21.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(68,141) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f21.setZ("cT41N2WKKsGAzvyNr0cCqwEa3f0=");
    // /WEB-INF/views/menu.jspx(68,141) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f21.setUrl("/mobile/index");
    // /WEB-INF/views/menu.jspx(68,141) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f21.setMessageCode("global_generic");
    // /WEB-INF/views/menu.jspx(68,141) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f21.setId("i_controller__mobileindex_id");
    _jspx_th_menu_005fitem_005f21.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f21);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f22 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f22);
    _jspx_th_menu_005fitem_005f22.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f22.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(69,141) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f22.setZ("Rr2P0bqq8h2TImrqyyTAYCJ8lLY=");
    // /WEB-INF/views/menu.jspx(69,141) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f22.setUrl("/search/index");
    // /WEB-INF/views/menu.jspx(69,141) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f22.setMessageCode("global_generic");
    // /WEB-INF/views/menu.jspx(69,141) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f22.setId("i_controller__searchindex_id");
    _jspx_th_menu_005fitem_005f22.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f22);
    return false;
  }

  private boolean _jspx_meth_sec_005fauthorize_005f10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_sec_005fauthorize_005f10 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_sec_005fauthorize_005f10.setPageContext(_jspx_page_context);
    _jspx_th_sec_005fauthorize_005f10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/menu.jspx(71,50) name = ifAllGranted type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sec_005fauthorize_005f10.setIfAllGranted("ROLE_ADMIN");
    int _jspx_eval_sec_005fauthorize_005f10 = _jspx_th_sec_005fauthorize_005f10.doStartTag();
    if (_jspx_eval_sec_005fauthorize_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_meth_menu_005fcategory_005f11(_jspx_th_sec_005fauthorize_005f10, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f12(_jspx_th_sec_005fauthorize_005f10, _jspx_page_context))
        return true;
    }
    if (_jspx_th_sec_005fauthorize_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f10);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fsec_005fauthorize_0026_005fifAllGranted.reuse(_jspx_th_sec_005fauthorize_005f10);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f11 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f11);
    _jspx_th_menu_005fcategory_005f11.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f11.setParent(_jspx_th_sec_005fauthorize_005f10);
    // /WEB-INF/views/menu.jspx(72,73) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f11.setZ("LPygIx2EuEArCzqsfpQQev0lHyc=");
    // /WEB-INF/views/menu.jspx(72,73) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f11.setId("c_role");
    _jspx_th_menu_005fcategory_005f11.setJspBody(new Helper( 12, _jspx_page_context, _jspx_th_menu_005fcategory_005f11, null));
    _jspx_th_menu_005fcategory_005f11.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f11);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f23 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f23);
    _jspx_th_menu_005fitem_005f23.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f23.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(73,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f23.setZ("WNB2HvnzvtbOA3r7qL1gqrUOq8g=");
    // /WEB-INF/views/menu.jspx(73,126) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f23.setUrl("/roles?form");
    // /WEB-INF/views/menu.jspx(73,126) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f23.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(73,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f23.setId("i_role_new");
    _jspx_th_menu_005fitem_005f23.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f23);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f24 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f24);
    _jspx_th_menu_005fitem_005f24.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f24.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(74,177) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f24.setZ("DVFtqj4xcHbEiJh6bgI7Tyre3ec=");
    // /WEB-INF/views/menu.jspx(74,177) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f24.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/roles?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(74,177) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f24.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(74,177) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f24.setId("i_role_list");
    _jspx_th_menu_005fitem_005f24.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f24);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_sec_005fauthorize_005f10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f12 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f12);
    _jspx_th_menu_005fcategory_005f12.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f12.setParent(_jspx_th_sec_005fauthorize_005f10);
    // /WEB-INF/views/menu.jspx(76,73) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f12.setZ("uoTSf/uIZ821ZppidzS9aO776yk=");
    // /WEB-INF/views/menu.jspx(76,73) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f12.setId("c_user");
    _jspx_th_menu_005fcategory_005f12.setJspBody(new Helper( 13, _jspx_page_context, _jspx_th_menu_005fcategory_005f12, null));
    _jspx_th_menu_005fcategory_005f12.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f12);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f25 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f25);
    _jspx_th_menu_005fitem_005f25.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f25.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(77,126) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f25.setZ("Zv1m8u2rG+JFKcvJ+AHVVK0ey24=");
    // /WEB-INF/views/menu.jspx(77,126) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f25.setUrl("/users?form");
    // /WEB-INF/views/menu.jspx(77,126) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f25.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(77,126) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f25.setId("i_user_new");
    _jspx_th_menu_005fitem_005f25.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f25);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f26 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f26);
    _jspx_th_menu_005fitem_005f26.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f26.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(78,177) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f26.setZ("4MY4uybxa60Q1G2rlI5bOwg+sm0=");
    // /WEB-INF/views/menu.jspx(78,177) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f26.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/users?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(78,177) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f26.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(78,177) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f26.setId("i_user_list");
    _jspx_th_menu_005fitem_005f26.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f26);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f13 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f13);
    _jspx_th_menu_005fcategory_005f13.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f13.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(81,70) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f13.setZ("ci2oqgLTbQbT+fsJYWuxv+fLnZU=");
    // /WEB-INF/views/menu.jspx(81,70) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f13.setId("c_probe");
    _jspx_th_menu_005fcategory_005f13.setJspBody(new Helper( 14, _jspx_page_context, _jspx_th_menu_005fcategory_005f13, null));
    _jspx_th_menu_005fcategory_005f13.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f13);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f27 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f27);
    _jspx_th_menu_005fitem_005f27.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f27.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(82,124) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f27.setZ("4XsiE47hONyxbIQmEeb2XydLPiI=");
    // /WEB-INF/views/menu.jspx(82,124) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f27.setUrl("/sondes?form");
    // /WEB-INF/views/menu.jspx(82,124) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f27.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(82,124) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f27.setId("i_probe_new");
    _jspx_th_menu_005fitem_005f27.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f27);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f28 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f28);
    _jspx_th_menu_005fitem_005f28.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f28.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(83,175) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f28.setZ("pD8wpm4O+gQRR8lNOJ1PCz8WUIU=");
    // /WEB-INF/views/menu.jspx(83,175) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f28.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/sondes?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(83,175) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f28.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(83,175) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f28.setId("i_probe_list");
    _jspx_th_menu_005fitem_005f28.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f28);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f14 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f14);
    _jspx_th_menu_005fcategory_005f14.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f14.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(85,76) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f14.setZ("Ma5xmQ72n0GkUCcZPx8HPFoe5kM=");
    // /WEB-INF/views/menu.jspx(85,76) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f14.setId("c_vlantaggued");
    _jspx_th_menu_005fcategory_005f14.setJspBody(new Helper( 15, _jspx_page_context, _jspx_th_menu_005fcategory_005f14, null));
    _jspx_th_menu_005fcategory_005f14.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f14);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f29 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f29);
    _jspx_th_menu_005fitem_005f29.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f29.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(86,136) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f29.setZ("PGOkCzZgai7628CJ02eTkp3CbZQ=");
    // /WEB-INF/views/menu.jspx(86,136) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f29.setUrl("/vlantaggueds?form");
    // /WEB-INF/views/menu.jspx(86,136) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f29.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(86,136) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f29.setId("i_vlantaggued_new");
    _jspx_th_menu_005fitem_005f29.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f29);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f30 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f30);
    _jspx_th_menu_005fitem_005f30.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f30.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(87,187) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f30.setZ("jDWWij1VRbSc33anV55sdqew9aA=");
    // /WEB-INF/views/menu.jspx(87,187) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f30.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/vlantaggueds?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(87,187) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f30.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(87,187) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f30.setId("i_vlantaggued_list");
    _jspx_th_menu_005fitem_005f30.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f30);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f15 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f15);
    _jspx_th_menu_005fcategory_005f15.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f15.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(89,78) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f15.setZ("NtzHLDzjorGi35I0Nc7GZterQyU=");
    // /WEB-INF/views/menu.jspx(89,78) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f15.setId("c_vlanuntaggued");
    _jspx_th_menu_005fcategory_005f15.setJspBody(new Helper( 16, _jspx_page_context, _jspx_th_menu_005fcategory_005f15, null));
    _jspx_th_menu_005fcategory_005f15.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f15);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f31 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f31);
    _jspx_th_menu_005fitem_005f31.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f31.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(90,140) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f31.setZ("+mu/adqspSOmPE9qK/27RXbYRJY=");
    // /WEB-INF/views/menu.jspx(90,140) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f31.setUrl("/vlanuntaggueds?form");
    // /WEB-INF/views/menu.jspx(90,140) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f31.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(90,140) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f31.setId("i_vlanuntaggued_new");
    _jspx_th_menu_005fitem_005f31.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f31);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f32(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f32 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f32);
    _jspx_th_menu_005fitem_005f32.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f32.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(91,191) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f32.setZ("AMERnM3EDzdLUNRyurlSZuX/YcA=");
    // /WEB-INF/views/menu.jspx(91,191) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f32.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/vlanuntaggueds?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(91,191) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f32.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(91,191) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f32.setId("i_vlanuntaggued_list");
    _jspx_th_menu_005fitem_005f32.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f32);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f16 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f16);
    _jspx_th_menu_005fcategory_005f16.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f16.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(93,73) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f16.setZ("0Q42NVbjLX2uD4DuBymNjZeeuGg=");
    // /WEB-INF/views/menu.jspx(93,73) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f16.setId("c_switches");
    _jspx_th_menu_005fcategory_005f16.setJspBody(new Helper( 17, _jspx_page_context, _jspx_th_menu_005fcategory_005f16, null));
    _jspx_th_menu_005fcategory_005f16.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f16);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f33(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f33 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f33);
    _jspx_th_menu_005fitem_005f33.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f33.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(94,132) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f33.setZ("F+jt/9lde/Juesb/z3ld8B1ELNM=");
    // /WEB-INF/views/menu.jspx(94,132) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f33.setUrl("/netswitches?form");
    // /WEB-INF/views/menu.jspx(94,132) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f33.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(94,132) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f33.setId("i_switches_new");
    _jspx_th_menu_005fitem_005f33.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f33);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f34 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f34);
    _jspx_th_menu_005fitem_005f34.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f34.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(95,183) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f34.setZ("q5pgyDwDswHGmFDarFilTKT7+30=");
    // /WEB-INF/views/menu.jspx(95,183) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f34.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/netswitches?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(95,183) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f34.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(95,183) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f34.setId("i_switches_list");
    _jspx_th_menu_005fitem_005f34.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f34);
    return false;
  }

  private boolean _jspx_meth_menu_005fcategory_005f17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:category
    org.apache.jsp.tag.web.menu.category_tagx _jspx_th_menu_005fcategory_005f17 = new org.apache.jsp.tag.web.menu.category_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f17);
    _jspx_th_menu_005fcategory_005f17.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fcategory_005f17.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(97,72) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f17.setZ("XfCH+Jhm9JK/d06qH/QyigDpUEw=");
    // /WEB-INF/views/menu.jspx(97,72) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fcategory_005f17.setId("c_modules");
    _jspx_th_menu_005fcategory_005f17.setJspBody(new Helper( 18, _jspx_page_context, _jspx_th_menu_005fcategory_005f17, null));
    _jspx_th_menu_005fcategory_005f17.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fcategory_005f17);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f35(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f35 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f35);
    _jspx_th_menu_005fitem_005f35.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f35.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(98,130) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f35.setZ("a/0XNKg23/UYQTEW0fhO/KH9TUo=");
    // /WEB-INF/views/menu.jspx(98,130) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f35.setUrl("/netmodules?form");
    // /WEB-INF/views/menu.jspx(98,130) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f35.setMessageCode("global_menu_new");
    // /WEB-INF/views/menu.jspx(98,130) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f35.setId("i_modules_new");
    _jspx_th_menu_005fitem_005f35.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f35);
    return false;
  }

  private boolean _jspx_meth_menu_005fitem_005f36(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  menu:item
    org.apache.jsp.tag.web.menu.item_tagx _jspx_th_menu_005fitem_005f36 = new org.apache.jsp.tag.web.menu.item_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f36);
    _jspx_th_menu_005fitem_005f36.setJspContext(_jspx_page_context);
    _jspx_th_menu_005fitem_005f36.setParent(_jspx_parent);
    // /WEB-INF/views/menu.jspx(99,181) name = z type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f36.setZ("VtmYiL/rZ0Q6IPsxsNjfV3T8FLw=");
    // /WEB-INF/views/menu.jspx(99,181) name = url type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f36.setUrl((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/netmodules?page=1&size=${empty param.size ? 10 : param.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/menu.jspx(99,181) name = messageCode type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f36.setMessageCode("global_menu_list");
    // /WEB-INF/views/menu.jspx(99,181) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_menu_005fitem_005f36.setId("i_modules_list");
    _jspx_th_menu_005fitem_005f36.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_menu_005fitem_005f36);
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
      if (_jspx_meth_menu_005fcategory_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f3(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f4(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f5(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f6(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f7(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f8(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f9(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f10(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_sec_005fauthorize_005f10(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f13(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f14(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f15(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f16(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fcategory_005f17(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke1( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f0(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f1(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke2( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f1(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f3(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke3( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f2(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f5(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke4( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f3(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f7(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke5( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f4(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f9(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke6( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f5(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f11(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke7( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f6(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f13(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke8( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f7(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f15(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke9( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f8(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f17(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke10( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_sec_005fauthorize_005f9(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f19(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke11( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f20(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f21(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f22(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke12( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f23(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f24(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke13( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f25(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f26(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke14( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f27(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f28(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke15( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f29(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f30(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke16( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f31(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f32(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke17( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f33(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f34(_jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public boolean invoke18( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_menu_005fitem_005f35(_jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_menu_005fitem_005f36(_jspx_parent, _jspx_page_context))
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
          case 2:
            invoke2( out );
            break;
          case 3:
            invoke3( out );
            break;
          case 4:
            invoke4( out );
            break;
          case 5:
            invoke5( out );
            break;
          case 6:
            invoke6( out );
            break;
          case 7:
            invoke7( out );
            break;
          case 8:
            invoke8( out );
            break;
          case 9:
            invoke9( out );
            break;
          case 10:
            invoke10( out );
            break;
          case 11:
            invoke11( out );
            break;
          case 12:
            invoke12( out );
            break;
          case 13:
            invoke13( out );
            break;
          case 14:
            invoke14( out );
            break;
          case 15:
            invoke15( out );
            break;
          case 16:
            invoke16( out );
            break;
          case 17:
            invoke17( out );
            break;
          case 18:
            invoke18( out );
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
