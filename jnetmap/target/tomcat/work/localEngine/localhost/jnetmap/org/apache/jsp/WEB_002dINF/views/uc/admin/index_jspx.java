package org.apache.jsp.WEB_002dINF.views.uc.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("\n");
      out.write("       $(function() {\n");
      out.write("                 $( \"#multiOpenAccordion\" ).multiOpenAccordion({active: 'all' });\n");
      out.write("                 \n");
      out.write("             });\n");
      out.write("       function getRooms(idBuilding){  \n");
      out.write("    \t   var $roomPanel = $('#roomTitle');\n");
      out.write("      \t   var $roomContent = $('#roomContent');\n");
      out.write("      \t   var $roomTextBuildingUnchoose= $('#roomTextBuildingUnchoose');\n");
      out.write("      \t   var $roomTextNoRoom = $('#roomTextNoRoom');\n");
      out.write("      \t   var $roomSelect = $('#roomSelect');\n");
      out.write("    \t   $.ajax({\n");
      out.write("    \t\t   \ttype: \"GET\",\n");
      out.write("    \t        url: 'ajaxRooms',\n");
      out.write("    \t        data: ({buildingId : idBuilding}),\n");
      out.write("    \t        dataType: 'json',\n");
      out.write("    \t        success:function(json) {    \t        \t\n");
      out.write("    \t        \t$roomTextBuildingUnchoose.attr('hidden','true');\n");
      out.write("    \t        \tresetOutlets();\n");
      out.write("    \t        \tif (json.length == 0){\n");
      out.write("    \t        \t\t$roomTextNoRoom.removeAttr('hidden');\n");
      out.write("    \t        \t\t$roomSelect.attr('hidden','true');\n");
      out.write("    \t        \t}\n");
      out.write("    \t        \telse{\n");
      out.write("    \t        \t\tvar value = json[0].id;\n");
      out.write("    \t        \t\tgetOutlets(value);\n");
      out.write("\t        \t\t\t$roomSelect.removeAttr('hidden');\n");
      out.write("    \t        \t\t$roomTextNoRoom.attr('hidden','true');\n");
      out.write("//     \t        \t\t$.each(json, function(index, value) {\n");
      out.write("    \t        \t\t\t\n");
      out.write("//     \t        \t\t\tgetOutlets(value.id);\n");
      out.write("//     \t        \t\t\t$roomSelect.removeAttr('hidden');\n");
      out.write("//         \t        \t\t$roomTextNoRoom.attr('hidden','true');\n");
      out.write("//     \t        \t\t});\n");
      out.write("    \t        \t\t\n");
      out.write("    \t        \t}\n");
      out.write("//     \t        \telse{\n");
      out.write("//     \t        \t\t$roomSelect.removeAttr('hidden');\n");
      out.write("//     \t        \t\t$roomTextNoRoom.attr('hidden','true');\n");
      out.write("    \t        \t\t\n");
      out.write("//     \t        \t}\n");
      out.write("    \t        \t$roomSelect.empty();\n");
      out.write("    \t        \tvar nbRooms = 0;\n");
      out.write("    \t        \t$.each(json, function(index, value) {\n");
      out.write("    \t        \t\t$roomSelect.append('<option value=\"'+ value.id +'\">'+ value.name +'</option>');\n");
      out.write("    \t        \t\tnbRooms++;\n");
      out.write("    \t        \t});\n");
      out.write("    \t        \t\n");
      out.write("    \t        \t$roomPanel.html('Les salles ('+nbRooms+')');\n");
      out.write("\t\t\t\t},\n");
      out.write("    \t        error: function(jqXHR, textStatus, errorThrown) {\n");
      out.write("    \t            alert(\"Issue fetching the JSON: \"\n");
      out.write("    \t                + textStatus + \" \"\n");
      out.write("    \t                + errorThrown + \" !\");\n");
      out.write("    \t        }\n");
      out.write("    \t        });\n");
      out.write("        }\n");
      out.write("function getOutlets(idRoom){\n");
      out.write("\tvar $outletPanel = $('#outletTitle');\n");
      out.write("\t   var $outletContent = $('#outletContent');\n");
      out.write("\t   var $outletTextRoomUnchoose= $('#outletTextRoomUnchoose');\n");
      out.write("\t   var $outletTextNoOutlet = $('#outletTextNoOutlet');\n");
      out.write("\t   var $outletTable = $('#outletTable');\n");
      out.write("    \t   $.ajax({\n");
      out.write("    \t\t   \ttype: \"GET\",\n");
      out.write("    \t        url: 'ajaxOutlets',\n");
      out.write("    \t        data: ({roomId : idRoom}),\n");
      out.write("    \t        dataType: 'json',\n");
      out.write("    \t        success:function(json) {\n");
      out.write("    \t        \talert(json);\n");
      out.write("     \t        \t$outletTextRoomUnchoose.attr('hidden','true');\n");
      out.write("    \t        \tif (json.length == 0){\n");
      out.write("    \t        \t\t$outletTextNoOutlet.removeAttr('hidden');\n");
      out.write("    \t        \t\t$outletTable.attr('hidden','true');\n");
      out.write("    \t        \t}\n");
      out.write("    \t        \telse{\n");
      out.write("    \t        \t\t$outletTable.removeAttr('hidden');\n");
      out.write("    \t        \t\t$outletTextNoOutlet.attr('hidden','true');\n");
      out.write("    \t        \t}\n");
      out.write("    \t        \t$outletTable.empty();\n");
      out.write("    \t        \tvar nbOutlets = 0;\n");
      out.write("    \t        \t$.each(json, function(index, value) {\n");
      out.write("    \t        \t\t\n");
      out.write("    \t        \t\t$outletTable.append('<tr><td>'+value.num+'</td><td><a href=\"./detailsOutlet?idOutlet='+ value.id +'\">details</a></td></tr>');\n");
      out.write("    \t        \t\tnbOutlets++;\n");
      out.write("    \t        \t});\n");
      out.write("    \t        \t\n");
      out.write("    \t        \t$outletPanel.html('Les prises ('+nbOutlets+')');\n");
      out.write("\t\t\t\t},\n");
      out.write("    \t        error: function(jqXHR, textStatus, errorThrown) {\n");
      out.write("    \t            alert(\"Issue fetching the JSON: \"\n");
      out.write("    \t                + textStatus + \" \"\n");
      out.write("    \t                + errorThrown + \" !\");\n");
      out.write("    \t        }\n");
      out.write("    \t        });\n");
      out.write("        }\n");
      out.write("      function resetOutlets(){\n");
      out.write("    \t  $('#outletTextRoomUnchoose').removeAttr('hidden');\n");
      out.write("    \t  $('#outletTable').attr('hidden','true');\n");
      out.write("    \t  $('#outletTextNoOutlet').attr('hidden','true');\n");
      out.write("    \t  $('#outletTitle').html('Les prises ()');\n");
      out.write("      }\n");
      out.write("        ");
      out.write("</script>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("<h3>");
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_page_context))
        return;
      out.write("</h3>");
      out.write("<form id=\"formadmin\" method=\"post\" action=\"index\">");
      out.write("<div id=\"multiOpenAccordion\">");
      out.write("<h3>");
      out.write("<a href=\"#\">");
      out.write("Les batiments (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${buildingsCount}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(')');
      out.write("</a>");
      out.write("</h3>");
      out.write("<div>");
      out.write("<select onChange=\"getRooms(this.options[this.selectedIndex].value)\" name=\"building\" id=\"building\">");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</select>");
      out.write("</div>");
      out.write("<h3>");
      out.write("<a id=\"roomTitle\" href=\"#\">");
      out.write("Les salles ()");
      out.write("</a>");
      out.write("</h3>");
      out.write("<div id=\"roomContent\">");
      out.write("<select onChange=\"getOutlets(this.options[this.selectedIndex].value)\" hidden=\"true\" name=\"roomSelect\" id=\"roomSelect\">");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("</select>");
      out.write("<div id=\"roomTextBuildingUnchoose\">");
      out.write("Veuillez selectionner un batiment");
      out.write("</div>");
      out.write("<div hidden=\"true\" id=\"roomTextNoRoom\">");
      out.write("Le batiment selectionné n'a pas de salles");
      out.write("</div>");
      out.write("</div>");
      out.write("<h3>");
      out.write("<a id=\"outletTitle\" href=\"#\">");
      out.write("Les prises ()");
      out.write("</a>");
      out.write("</h3>");
      out.write("<div id=\"outletContent\">");
      out.write("<table hidden=\"true\" name=\"outletTable\" id=\"outletTable\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("Numeros prises");
      out.write("</td>");
      out.write("<td>");
      out.write("Details");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("<div id=\"outletTextRoomUnchoose\">");
      out.write("Veuillez selectionner une salle");
      out.write("</div>");
      out.write("<div hidden=\"true\" id=\"outletTextNoOutlet\">");
      out.write("La salle selectionnée n'a pas de prises");
      out.write("</div>");
      out.write("</div>");
      out.write("</div>");
      out.write("</form>");
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

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/uc/admin/index.jspx(121,17) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setVar("title");
    // /WEB-INF/views/uc/admin/index.jspx(121,17) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setHtmlEscape("false");
    // /WEB-INF/views/uc/admin/index.jspx(121,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("label_uc_admin_index");
    int[] _jspx_push_body_count_spring_005fmessage_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f0 = _jspx_th_spring_005fmessage_005f0.doStartTag();
      if (_jspx_th_spring_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent(null);
    // /WEB-INF/views/uc/admin/index.jspx(123,70) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("welcome_titlepane");
    // /WEB-INF/views/uc/admin/index.jspx(123,70) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/uc/admin/index.jspx(132,49) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("build");
    // /WEB-INF/views/uc/admin/index.jspx(132,49) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/uc/admin/index.jspx(132,49) '${buildings}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${buildings}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${build.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${build.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/uc/admin/index.jspx(142,44) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("room");
    // /WEB-INF/views/uc/admin/index.jspx(142,44) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/uc/admin/index.jspx(142,44) '${rooms}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${rooms}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<option value=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${room.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}
