package org.apache.jsp.WEB_002dINF.views.search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class advancedSearch_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fnobody.release();
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
      out.write("\t\tvar propertiesHash = new Hashtable();\n");
      out.write("\t\tvar selectedTypeOfSearch;\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\tgetRadioButtons();\n");
      out.write("\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\tfunction addProperties(value, cond, id) {\n");
      out.write("\t\t\t$('#btn-OR-' + id).removeAttr(\"style\");\n");
      out.write("\t\t\t$('#btn-AND-' + id).removeAttr(\"style\");\n");
      out.write("\t\t\t$('#btn-' + cond + '-' + id).css(\"background-color\", \"red\");\n");
      out.write("\t\t\tif ($('#cond-' + id).val() == \"\") {\n");
      out.write("\t\t\t\tvar random = randomString();\n");
      out.write("\t\t\t\tvar selectHtml = '<tr class=\"line\" id=\"tr-'+random+'\"><td id=\"td-'+random+'\"><select id=\"sl-'\n");
      out.write("\t\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t\t+ '\" onchange=\"getAddingProperties(this,\\''\n");
      out.write("\t\t\t\t\t\t+ random + '\\');\"> <option value=\"#\">------</option>';\n");
      out.write("\t\t\t\tvar values = $.trim(selectedTypeOfSearch);\n");
      out.write("\n");
      out.write("\t\t\t\t$.each(propertiesHash.get(values), function(index, value) {\n");
      out.write("\t\t\t\t\tselectHtml += '<option value=\"'+index+'-'+value+'\">'\n");
      out.write("\t\t\t\t\t\t\t+ index + '</option>';\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\tselectHtml += '</select></td><td class=\"oper\" id=\"td-oper-'+random+'\"><button id =\"btn-OR-'\n");
      out.write("\t\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t\t+ '\" onclick=\"addProperties(\\''\n");
      out.write("\t\t\t\t\t\t+ selectedTypeOfSearch\n");
      out.write("\t\t\t\t\t\t+ '\\',\\'OR\\',\\''\n");
      out.write("\t\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t\t+ '\\')\">OU</button><button id =\"btn-AND-'\n");
      out.write("\t\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t\t+ '\" onclick=\"addProperties(\\''\n");
      out.write("\t\t\t\t\t\t+ selectedTypeOfSearch\n");
      out.write("\t\t\t\t\t\t+ '\\',\\'AND\\',\\''\n");
      out.write("\t\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t\t+ '\\')\">ET</button><input id=\"cond-'+random+'\" type=\"hidden\" name=\"cond\" value=\"\" /></td></tr>';\n");
      out.write("\t\t\t\t$('#propertyCriteriaTable').append(selectHtml);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$('#cond-' + id).val(cond);\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction getPropertiesWithRadioButton(values) {\n");
      out.write("\t\t\t$('#propertyCriteriaTable').empty();\n");
      out.write("\t\t\tvar random = randomString();\n");
      out.write("\t\t\tvar selectHtml = '<tr class=\"line\" id=\"tr-'+random+'\"><td id=\"td-'+random+'\"><select id=\"sl-'\n");
      out.write("\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t+ '\" onchange=\"getAddingProperties(this,\\''\n");
      out.write("\t\t\t\t\t+ random + '\\');\"> <option value=\"#\">------</option>';\n");
      out.write("\t\t\tvar values = $.trim(values);\n");
      out.write("\n");
      out.write("\t\t\tselectedTypeOfSearch = values;\n");
      out.write("\n");
      out.write("\t\t\t$.each(propertiesHash.get(values), function(index, value) {\n");
      out.write("\t\t\t\tselectHtml += '<option value=\"'+index+'-'+value+'\">' + index\n");
      out.write("\t\t\t\t\t\t+ '</option>';\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tselectHtml += '</select></td><td class=\"oper\" id=\"td-oper-'+random+'\"><button id =\"btn-OR-'\n");
      out.write("\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t+ '\" onclick=\"addProperties(\\''\n");
      out.write("\t\t\t\t\t+ selectedTypeOfSearch\n");
      out.write("\t\t\t\t\t+ '\\',\\'OR\\',\\''\n");
      out.write("\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t+ '\\')\">OU</button><button id =\"btn-AND-'\n");
      out.write("\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t+ '\" onclick=\"addProperties(\\''\n");
      out.write("\t\t\t\t\t+ selectedTypeOfSearch\n");
      out.write("\t\t\t\t\t+ '\\',\\'AND\\',\\''\n");
      out.write("\t\t\t\t\t+ random\n");
      out.write("\t\t\t\t\t+ '\\')\">ET</button><input id=\"cond-'+random+'\" type=\"hidden\" name=\"cond\" value=\"\" /></td></tr>';\n");
      out.write("\t\t\t$('#propertyCriteriaTable').append(selectHtml);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction getAddingProperties(choice, id) {\n");
      out.write("\t\t\tvar until = document.getElementById('td-oper-' + id);\n");
      out.write("\t\t\tvar next = $(choice).nextUntil(until).remove();\n");
      out.write("\t\t\tvar input = choice.options[choice.selectedIndex].value;\n");
      out.write("\t\t\tconsole.log(next);\n");
      out.write("\t\t\tvar n = input.split(\"-\");\n");
      out.write("\t\t\tvar type = n[1];\n");
      out.write("\t\t\tvar operatingSelect = \"<select id= 'slOperator-\"+id+\"' name ='operator' class='operator'><option value = '='>égal à</option><option value = '!='>different</option><option value = '>'>supérieur à</option><option value = '>='>supérieur ou égal à</option><option value = '<'>inférieur à</option><option value = '<='>inférieur ou égal à</option></select></td><td>\";\n");
      out.write("\t\t\tvar html = \"\";\n");
      out.write("\t\t\tif (type == \"int\" || type == \"String\") {\n");
      out.write("\t\t\t\thtml += operatingSelect;\n");
      out.write("\t\t\t\thtml += '<input type=\"text\" name= \"edit-'+id+'\" id=\"edit-'+id+'\" />';\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\thtml += '<select id=\"sl-' + id\n");
      out.write("\t\t\t\t\t\t+ '\" onchange=\"getAddingProperties(this,\\'' + id\n");
      out.write("\t\t\t\t\t\t+ '\\');\"> <option value=\"#\">------</option>';\n");
      out.write("\t\t\t\t$.each(propertiesHash.get(type), function(index, value) {\n");
      out.write("\t\t\t\t\thtml += '<option value=\"'+index+'-'+value+'\">' + index\n");
      out.write("\t\t\t\t\t\t\t+ '</option>';\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\thtml += '</select>';\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$(\"#td-\" + id).append(html);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction getRadioButtons() {\n");
      out.write("\t\t\t$\n");
      out.write("\t\t\t\t\t.ajax({\n");
      out.write("\t\t\t\t\t\ttype : \"GET\",\n");
      out.write("\t\t\t\t\t\turl : 'getProperty',\n");
      out.write("\t\t\t\t\t\tdataType : 'json',\n");
      out.write("\t\t\t\t\t\tsuccess : function(json) {\n");
      out.write("\t\t\t\t\t\t\tentityJson = json;\n");
      out.write("\t\t\t\t\t\t\t$\n");
      out.write("\t\t\t\t\t\t\t\t\t.each(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tjson,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(index, value) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar detailsPropertiesHash = new Hashtable();\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$.each(value, function(index2,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue2) {\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\tdetailsPropertiesHash.put(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tindex2, value2);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tpropertiesHash\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t.put(index, value);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvar radioButton = '<label for=\"'+index+'\">'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '<input id=\"'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '\" type=\"radio\" name=\"entity\" value=\"'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '\" onchange=\"getPropertiesWithRadioButton(this.value)\"/>'\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ index + '</label>';\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#entityListRadio').append(\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\tradioButton);\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t},\n");
      out.write("\t\t\t\t\t\terror : function(jqXHR, textStatus, errorThrown) {\n");
      out.write("\t\t\t\t\t\t\talert(\"Issue fetching the JSON: \" + textStatus\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \" \" + errorThrown + \" !\");\n");
      out.write("\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction randomString() {\n");
      out.write("\t\t\tvar chars = \"abcdefghiklmnopqrstuvwxyz\";\n");
      out.write("\t\t\tvar string_length = 8;\n");
      out.write("\t\t\tvar randomstring = '';\n");
      out.write("\t\t\tfor ( var i = 0; i < string_length; i++) {\n");
      out.write("\t\t\t\tvar rnum = Math.floor(Math.random() * chars.length);\n");
      out.write("\t\t\t\trandomstring += chars.substring(rnum, rnum + 1);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\treturn \"\" + randomstring;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction launchRequest() {\n");
      out.write("\t\t\tvar requestArray = new Array();\n");
      out.write("\t\t\tvar operatorArray = new Array();\n");
      out.write("\n");
      out.write("\t\t\t$('#propertyCriteriaTable > tr').each(\n");
      out.write("\t\t\t\t\tfunction() {\n");
      out.write("\t\t\t\t\t\tconsole.log($(this));\n");
      out.write("\t\t\t\t\t\tvar td = $(this).find('td :first');\n");
      out.write("\t\t\t\t\t\tvar allInputsOfTr = td.find(\"select, input\");\n");
      out.write("\t\t\t\t\t\tconsole.log(allInputsOfTr);\n");
      out.write("\t\t\t\t\t\tvar requestBody = \"\";\n");
      out.write("\t\t\t\t\t\tvar lastType = \"\";\n");
      out.write("\t\t\t\t\t\t$.each(allInputsOfTr, function() {\n");
      out.write("\t\t\t\t\t\t\tif ($(this).is(\"select\")) {\n");
      out.write("\t\t\t\t\t\t\t\tvar value = $(this).val().split(\"-\");\n");
      out.write("\t\t\t\t\t\t\t\tvar propertyValue = value[0];\n");
      out.write("\t\t\t\t\t\t\t\tif ($(this).attr(\"name\") == 'operator') {\n");
      out.write("\t\t\t\t\t\t\t\t\trequestBody = requestBody.substring(0,\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trequestBody.length - 1);\n");
      out.write("\t\t\t\t\t\t\t\t\trequestBody += \" \" + propertyValue + \" \";\n");
      out.write("\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\tlastType = $.trim(value[1]);\n");
      out.write("\t\t\t\t\t\t\t\t\trequestBody += propertyValue + \".\";\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t\t//                     \t\t if (!$(this).val().match('^num') || !$(this).val().match('^id') || !$(this).val().match('^name') || !$(this).val().match('^ip')){\n");
      out.write("\t\t\t\t\t\t\t\t//                     \t\t\t alert('select: '+$(this).val());\n");
      out.write("\t\t\t\t\t\t\t\t//                     \t\t }\n");
      out.write("\t\t\t\t\t\t\t} else if ($(this).is(\"input\")) {\n");
      out.write("\t\t\t\t\t\t\t\tif (lastType == \"String\") {\n");
      out.write("\t\t\t\t\t\t\t\t\trequestBody += \"'\" + $(this).val() + \"'\";\n");
      out.write("\t\t\t\t\t\t\t\t} else {\n");
      out.write("\t\t\t\t\t\t\t\t\trequestBody += \"\" + $(this).val();\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\trequestArray.push(requestBody);\n");
      out.write("\t\t\t\t\t\tvar tdOperator = $(this).find('td.oper');\n");
      out.write("\t\t\t\t\t\tconsole.log(tdOperator);\n");
      out.write("\t\t\t\t\t\tvar inputOperator = tdOperator.find(\"input\").val();\n");
      out.write("\t\t\t\t\t\toperatorArray.push(inputOperator);\n");
      out.write("\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\tgetResults(selectedTypeOfSearch, requestArray, operatorArray);\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\tfunction getResults(type, requestArray, operatorArray) {\n");
      out.write("\t\t\tconsole.log(requestArray);\n");
      out.write("\t\t\tconsole.log(operatorArray);\n");
      out.write("\t\t\tconsole.log(selectedTypeOfSearch);\n");
      out.write("\n");
      out.write("\t\t\tvar data = JSON.stringify({\n");
      out.write("\t\t\t\ttype : type,\n");
      out.write("\t\t\t\trequests : requestArray,\n");
      out.write("\t\t\t\toperators : operatorArray\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\tconsole.log(data);\n");
      out.write("\t\t\t//             \t var arraysToSend = new Hashtable();\n");
      out.write("\t\t\t//             \t arraysToSend.put('type',type);\n");
      out.write("\t\t\t//             \t arraysToSend.put('requests',requestArray);\n");
      out.write("\t\t\t//             \t arraysToSend.put('operators',operatorArray);\n");
      out.write("\n");
      out.write("// \t\t\t$('#dataEx').dataTable( {\n");
      out.write("// \t\t\t\t\"bProcessing\": true,\n");
      out.write("// \t\t\t\t\"bServerSide\": true,\n");
      out.write("// \t\t\t\t\"sAjaxSource\": \"./getResults\",\n");
      out.write("// \t\t\t\t\"fnServerData\": function ( sSource, aoData, fnCallback ) {\n");
      out.write("// \t\t\t\t\t$.ajax( {\n");
      out.write("// \t\t\t\t\t\t\"dataType\": 'json', \n");
      out.write("// \t\t\t\t\t\"type\": \"POST\", \n");
      out.write("// \t\t\t\t\t\"url\": sSource, \n");
      out.write("// \t\t\t\t\t\"data\": data, \n");
      out.write("// \t\t\t\t\t\"success\": fnCallback\n");
      out.write("// \t\t\t\t\t} );\n");
      out.write("// \t\t\t\t},\n");
      out.write("// \t\t \t\t\"aoColumns\": [\n");
      out.write("// \t                      { \"mDataProp\": \"id\" },\n");
      out.write("// \t                      { \"mDataProp\": \"name\" }\n");
      out.write("// \t                  ]\n");
      out.write("\t\t\t\n");
      out.write("// \t} );\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\talert('plop');\n");
      out.write("\t\t\t$.ajax({\n");
      out.write("\t\t\t\ttype : 'POST',\n");
      out.write("\t\t\t\turl : 'getResults',\n");
      out.write("\t\t\t\tdata : data,\n");
      out.write("\t\t\t\tcontentType : \"application/json; charset=utf-8\",\n");
      out.write("\t\t\t\tdataType : \"json\",\n");
      out.write("\t\t\t\tsuccess : function(json) {\t\t\t\n");
      out.write("\t\t\t\t\talert(json);\n");
      out.write("\t\t\t\t\tvar dataArray = new Array();\n");
      out.write("\t\t\t\t\tvar rowtoDisplay = \"\";\n");
      out.write("\t\t\t\t\tif (selectedTypeOfSearch == \"Building\" || selectedTypeOfSearch == \"Dispatcher\" || selectedTypeOfSearch == \"Room\" || selectedTypeOfSearch == \"Switches\" || selectedTypeOfSearch == \"Band\"){\n");
      out.write("\t\t\t\t\t\trowtoDisplay = \"name\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse if (selectedTypeOfSearch == \"Band\" || selectedTypeOfSearch == \"Outlet\" || selectedTypeOfSearch == \"Port\" || selectedTypeOfSearch == \"Modules\"){\n");
      out.write("\t\t\t\t\t\trowToDisplay = \"num\";\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\tif(rowtoDisplay == 'name'){\n");
      out.write("\t\t\t\t\t\tvar data = $.map(json.aaData, function(el, i) {\t\n");
      out.write("\t\t\t\t\t\t\tvar typeMin = selectedTypeOfSearch.toLowerCase();\n");
      out.write("\t\t\t\t\t\t\tdataArray.push([\"<a href=\\\"../\"+typeMin+\"/\"+el.id+\"\\\">\"+el.name+\"</a>\"]);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\telse if(rowtoDisplay == 'num'){\n");
      out.write("\t\t\t\t\t\tvar data = $.map(json.aaData, function(el, i) {\t\n");
      out.write("\t\t\t\t\t\t\tvar typeMin = selectedTypeOfSearch.toLowerCase();\n");
      out.write("\t\t\t\t\t\t\tdataArray.push([\"<a href=\\\"../\"+typeMin+\"/\"+el.id+\"\\\">\"+el.num+\"</a>\"]);\n");
      out.write("\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\talert(dataArray);\n");
      out.write("\t\t\t\t\tvar jsonStringify = JSON.stringify(json);\n");
      out.write("\t\t\t\t\t//alert(jsonStringify);\n");
      out.write("\t\t\t\t\tvar oTable = $('#dataEx').dataTable({\n");
      out.write("\t\t\t\t\t\t\"bDestroy\": true,\n");
      out.write("\t\t\t\t\t\t\"bProcessing\" : true,\n");
      out.write("\t\t\t\t\t\t\"aaData\" : dataArray,\n");
      out.write("\t\t\t\t\t\t\"aoColumns\": [\n");
      out.write("\t\t\t\t\t\t  \t\t\t\n");
      out.write("\t\t\t\t\t\t  \t\t\t{ \"sTitle\": \"name\" } ]\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t},\n");
      out.write("\t\t\t\terror : function(jqXHR, textStatus, errorThrown) {\n");
      out.write("\t\t\t\t\talert(\"Issue fetching the JSON: \" + textStatus + \" \"\n");
      out.write("\t\t\t\t\t\t\t+ errorThrown + \" !\");\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t});\n");
      out.write("\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t");
      out.write("</script>");
      if (_jspx_meth_spring_005fmessage_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_util_005fpanel_005f0(_jspx_page_context))
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

  private boolean _jspx_meth_spring_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f0 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f0.setParent(null);
    // /WEB-INF/views/search/advancedSearch.jspx(305,17) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setVar("title");
    // /WEB-INF/views/search/advancedSearch.jspx(305,17) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setHtmlEscape("false");
    // /WEB-INF/views/search/advancedSearch.jspx(305,17) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f0.setCode("label_search_index");
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

  private boolean _jspx_meth_util_005fpanel_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  util:panel
    org.apache.jsp.tag.web.util.panel_tagx _jspx_th_util_005fpanel_005f0 = new org.apache.jsp.tag.web.util.panel_tagx();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_util_005fpanel_005f0);
    _jspx_th_util_005fpanel_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/views/search/advancedSearch.jspx(306,42) name = title type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_util_005fpanel_005f0.setTitle((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/views/search/advancedSearch.jspx(306,42) name = id type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = java.lang.String deferredMethod = false methodSignature = null
    _jspx_th_util_005fpanel_005f0.setId("title");
    _jspx_th_util_005fpanel_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_util_005fpanel_005f0, null));
    _jspx_th_util_005fpanel_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_util_005fpanel_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f1 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/search/advancedSearch.jspx(308,21) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setVar("app_name");
    // /WEB-INF/views/search/advancedSearch.jspx(308,21) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setHtmlEscape("false");
    // /WEB-INF/views/search/advancedSearch.jspx(308,21) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f1.setCode("application_name");
    int[] _jspx_push_body_count_spring_005fmessage_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f1 = _jspx_th_spring_005fmessage_005f1.doStartTag();
      if (_jspx_th_spring_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fvar_005fhtmlEscape_005fcode_005fnobody.reuse(_jspx_th_spring_005fmessage_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:message
    org.springframework.web.servlet.tags.MessageTag _jspx_th_spring_005fmessage_005f2 = (org.springframework.web.servlet.tags.MessageTag) _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.get(org.springframework.web.servlet.tags.MessageTag.class);
    _jspx_th_spring_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fmessage_005f2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/search/advancedSearch.jspx(310,71) name = code type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setCode("welcome_titlepane");
    // /WEB-INF/views/search/advancedSearch.jspx(310,71) name = arguments type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fmessage_005f2.setArguments((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app_name}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_spring_005fmessage_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fmessage_005f2 = _jspx_th_spring_005fmessage_005f2.doStartTag();
      if (_jspx_th_spring_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fmessage_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fmessage_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fmessage_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005fmessage_0026_005fcode_005farguments_005fnobody.reuse(_jspx_th_spring_005fmessage_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/views/search/advancedSearch.jspx(315,51) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("entity");
    // /WEB-INF/views/search/advancedSearch.jspx(315,51) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/search/advancedSearch.jspx(315,51) '${listEntity}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listEntity}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems_005fnobody.reuse(_jspx_th_c_005fforEach_005f0);
    }
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
      if (_jspx_meth_spring_005fmessage_005f1(_jspx_parent, _jspx_page_context))
        return true;
      out.write("<h3>");
      if (_jspx_meth_spring_005fmessage_005f2(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</h3>");
      out.write("<div>");
      out.write("<h4>");
      out.write("Recherche de:");
      out.write("</h4>");
      out.write("<div id=\"entityListRadio\">");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("</div>");
      out.write("</div>");
      out.write("<div id=\"generalcriterias\">");
      out.write("<h4>");
      out.write("Criteres de recherche:");
      out.write("</h4>");
      out.write("<div>");
      out.write("<table>");
      out.write("<div id=\"propertyCriteriaTable\"/>");
      out.write("</table>");
      out.write("<button onclick=\"launchRequest()\" name=\"lauchRequest\">");
      out.write("Lancer\n");
      out.write("\t\t\t\t\tla recherche");
      out.write("</button>");
      out.write("</div>");
      out.write("</div>");
      out.write("<h4>");
      out.write("Resultats");
      out.write("</h4>");
      out.write("<div id=\"results\">");
      out.write("<table id=\"dataEx\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
      out.write("<thead>");
      out.write("<th>");
      out.write("name");
      out.write("</th>");
      out.write("</thead>");
      out.write("<tbody/>");
      out.write("</table>");
      out.write("</div>");
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
