package org.apache.jsp.WEB_002dINF.views.uc.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateswitchconnection_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      response.setContentType("text/xml;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
      out.write("<div version=\"2.0\">");
      out.write("<link type=\"text/css\" href=\"/jnetmap/resources/scripts/css/style.css\" rel=\"stylesheet\"/>");
      out.write("<script type=\"text/javascript\">");
      out.write("\n");
      out.write("/*jslint white: true, browser: true, undef: true, nomen: true, eqeqeq: true, plusplus: false, bitwise: true, regexp: true, strict: true, newcap: true, immed: true, maxerr: 14 */\n");
      out.write("/*global window: false,  ActiveXObject: false, REDIPS: true */\n");
      out.write("var updates = new Array();\n");
      out.write("/* enable strict mode */\n");
      out.write("\"use strict\";\n");
      out.write("\n");
      out.write("// create redips container\n");
      out.write("var redips = {};\n");
      out.write("\n");
      out.write("// configuration\n");
      out.write("redips.configuration = function () {\n");
      out.write("\tredips.hover1 = '#9BB3DA';\t\t\t\t// hover color for original elements\n");
      out.write("\tredips.hover2 = '#FFCFAE';\t\t\t\t// hover color for cloned elements\n");
      out.write("// \tredips.width = '240px';\t\t\t\t\t// width of DIV element dropped to the right table\n");
      out.write("\tredips.left = 'left';\t\t\t\t\t// id of left DIV container\n");
      out.write("\tredips.right = 'right';\t\t\t\t\t// id of right DIV container\n");
      out.write("\tredips.content_url = 'doUpdate';\t// get-content URL\n");
      out.write("\tredips.size = {w: 0, h: 0};\t\t\t\t// size of DIV elements in question table\n");
      out.write("};\n");
      out.write("\n");
      out.write("// redips initialization\n");
      out.write("redips.init = function () {\n");
      out.write("\t// reference to the REDIPS.drag class\n");
      out.write("\tvar rd = REDIPS.drag;\n");
      out.write("\t// set script configuration\n");
      out.write("\tredips.configuration();\n");
      out.write("\t// set reference to the hoverDiv\n");
      out.write("\tredips.hoverDiv = document.getElementById('hover_div');\n");
      out.write("\n");
      out.write("\t// set class=\"single\" to the table cells question table (left table)\n");
      out.write("\tredips.singleContent();\n");
      out.write("\t// set onmouseover & onmouseout to all div elements inside DIV id=\"drag\"\n");
      out.write("\tredips.setEvents();\n");
      out.write("\t// create XMLHttp request object\n");
      out.write("\tredips.request = redips.initXMLHttpClient();\n");
      out.write("\t// set fixed position for the left container\n");
      out.write("\tdocument.getElementById(redips.left).style.position = 'fixed';\n");
      out.write("\t// initialization\n");
      out.write("\trd.init();\n");
      out.write("\t// drop option is switch - content can be exchanged\n");
      out.write("\trd.dropMode = 'single';\n");
      out.write("\t// in a moment when dragging starts, remove mouseover event and hide hover tooltip\n");
      out.write("\trd.event.moved = function () {\n");
      out.write("\t\tREDIPS.event.remove(rd.obj, 'mouseover', redips.showTooltip);\n");
      out.write("\t\tredips.hideTooltip();\n");
      out.write("\t};\n");
      out.write("\t// enable cloning option only for DIV elements in right table \n");
      out.write("\trd.event.clicked = function () {\n");
      out.write("\t\t// find container id\n");
      out.write("\t\tvar cid = redips.findContainer(rd.obj);\n");
      out.write("\t\t// set cloning option with shiftKey only for right DIV container\n");
      out.write("\t\tif (cid === redips.right) {\n");
      out.write("\t\t\trd.clone.keyDiv = true;\n");
      out.write("\t\t}\n");
      out.write("\t\telse {\n");
      out.write("\t\t\trd.clone.keyDiv = false;\n");
      out.write("\t\t}\n");
      out.write("\t\t// set hover color for original DIV elements and for cloned DIV elements\n");
      out.write("\t\tif (rd.obj.className.indexOf('clnd') === -1) {\n");
      out.write("\t\t\trd.hover.colorTd = redips.hover1;\n");
      out.write("\t\t}\n");
      out.write("\t\telse {\n");
      out.write("\t\t\trd.hover.colorTd = redips.hover2;\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\t// event handler called before DIV element is dropped to the table\n");
      out.write("\t// in case when DIV element changes location from left to right DIV container or vice versa \n");
      out.write("\trd.event.droppedBefore = function (targetCell) {\n");
      out.write("\t\tvar id = rd.obj.id,\t// define id of DIV element\n");
      out.write("\t\t\ttcid,\t\t\t// target container id\n");
      out.write("\t\t\tscid;\t\t\t// source container id\n");
      out.write("\t\t// find target container id and source container id\n");
      out.write("\t\ttcid = redips.findContainer(targetCell);\n");
      out.write("\t\tscid = redips.findContainer(rd.td.source);\n");
      out.write("\t\t// if element is dropped from question table to the one of right tables\n");
      out.write("\t\t// (right tables doesn't have id)\n");
      out.write("\t\tif (scid === redips.right && tcid === redips.left) {\n");
      out.write("\t\t\t// send request (input parameter is object reference)\n");
      out.write("\t\t\tconsole.log(rd);\n");
      out.write("\t\t\tconsole.log(id);\n");
      out.write("\t\t\t//redips.sendRequest(rd.obj, id,0);\t\n");
      out.write("\t\t\tsaveToTab(id,0);\n");
      out.write("\t\t\trd.obj.style.width = redips.width; // width parameter\n");
      out.write("\t\t\trd.obj.style.height = '';\n");
      out.write("\t\t\t$('#table77 tr:last').after('<tr>...</tr>');\n");
      out.write("\t\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t// if element is dropped from right table to the question table\n");
      out.write("\t\telse if ((scid === redips.left && tcid === redips.right)||(scid === redips.right && tcid === redips.right)) {\n");
      out.write("\t\t\tconsole.log(tcid);\n");
      out.write("\t\t\tconsole.log(rd.td.current.id);\n");
      out.write("\t\t\t//redips.sendRequest(rd.obj, id,rd.td.current.id);\n");
      out.write("\t\t\t//rd.obj.innerHTML = id;\n");
      out.write("\t\t\tsaveToTab(id,rd.td.current.id);\n");
      out.write("\t\t\trd.obj.style.width = redips.size.w;\n");
      out.write("\t\t\trd.obj.style.height = redips.size.h;\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\t// after DIV element is dropped, \n");
      out.write("\trd.event.dropped = function (targetCell) {\n");
      out.write("\t\t// target container id\n");
      out.write("\t\tvar tcid = redips.findContainer(targetCell);\n");
      out.write("\t\t// target container is defined in event.droppedBefore()\n");
      out.write("\t\tif (tcid === redips.left) {\n");
      out.write("\t\t\t// if cloned element is dropped to the left table then delete it\n");
      out.write("\t\t\tif (rd.obj.className.indexOf('clnd') !== -1) {\n");
      out.write("\t\t\t\t// remove child from DOM (node still exists in memory)\n");
      out.write("\t\t\t\trd.obj.parentNode.removeChild(rd.obj);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t// else return mouseover event (needed for tooltip in left table)\n");
      out.write("\t\t\telse {\n");
      out.write("\t\t\t\tREDIPS.event.add(rd.obj, 'mouseover', redips.showTooltip);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\t// add \"clnd\" (cloned) class name to the cloned elements\n");
      out.write("\t// needed to delete cloned elements in case when dropped to the left table\n");
      out.write("\trd.event.cloned = function () {\n");
      out.write("\t\tif (rd.obj.className.indexOf('clnd') === -1) {\n");
      out.write("\t\t\trd.obj.className += ' clnd';\n");
      out.write("\t\t}\n");
      out.write("\t\t// set hover color for cloned elements\n");
      out.write("\t\trd.hover.colorTd = redips.hover2;\n");
      out.write("\t};\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// XMLHttp request object\n");
      out.write("redips.initXMLHttpClient = function () {\n");
      out.write("\tvar XMLHTTP_IDS,\n");
      out.write("\t\txmlhttp,\n");
      out.write("\t\tsuccess = false,\n");
      out.write("\t\ti;\n");
      out.write("\t// Mozilla/Chrome/Safari/IE7/IE8 (normal browsers)\n");
      out.write("\ttry {\n");
      out.write("\t\txmlhttp = new XMLHttpRequest(); \n");
      out.write("\t}\n");
      out.write("\t// IE (?!)\n");
      out.write("\tcatch (e1) {\n");
      out.write("\t\tXMLHTTP_IDS = [ 'MSXML2.XMLHTTP.5.0', 'MSXML2.XMLHTTP.4.0',\n");
      out.write("\t\t\t\t\t\t'MSXML2.XMLHTTP.3.0', 'MSXML2.XMLHTTP', 'Microsoft.XMLHTTP' ];\n");
      out.write("\t\tfor (i = 0; i < XMLHTTP_IDS.length && !success; i++) {\n");
      out.write("\t\t\ttry {\n");
      out.write("\t\t\t\tsuccess = true;\n");
      out.write("\t\t\t\txmlhttp = new ActiveXObject(XMLHTTP_IDS[i]);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tcatch (e2) {}\n");
      out.write("\t\t}\n");
      out.write("\t\tif (!success) {\n");
      out.write("\t\t\tthrow new Error('Unable to create XMLHttpRequest!');\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\treturn xmlhttp;\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// send request to the server and display response in obj.innerHTML\n");
      out.write("redips.sendRequest = function (obj, id, where) {\n");
      out.write("\t// open asynchronus request\n");
      out.write("\t//redips.request.open('GET', redips.content_url + '/' + id + \"/\"+where, true);\n");
      out.write("\tconsole.log('id: '+id);\n");
      out.write("\tconsole.log('where: '+where);\n");
      out.write("\t// the onreadystatechange event is triggered every time the readyState changes\n");
      out.write("// \tredips.request.onreadystatechange = function () {\n");
      out.write("// \t\t//  request finished and response is ready\n");
      out.write("// \t\tconsole.log(redips.request);\n");
      out.write("// \t\tif (redips.request.readyState === 4) {\n");
      out.write("// \t\t\tif (redips.request.status === 200) {\n");
      out.write("// \t\t\t\tvar arr_from_json = JSON.parse( redips.request.responseText);\n");
      out.write("// \t\t\t\tconsole.log(arr_from_json);\n");
      out.write("// \t\t\t\tif (where == 0){\n");
      out.write("// \t\t\t\t\tobj.innerHTML = 'prise n° '+arr_from_json['num']+ '('+arr_from_json['room']['name']+')';\n");
      out.write("// \t\t\t\t}\n");
      out.write("// \t\t\t\telse{\n");
      out.write("// \t\t\t\t\tobj.innerHTML = arr_from_json['port']['aModule']['aSwitch']['dispatcher']['name']+'-'+arr_from_json['band']['num']+'-'+arr_from_json['port']['num'];\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("// \t\t\t\t}\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("// \t\t\t}\n");
      out.write("// \t\t\t// if request status isn't OK\n");
      out.write("// \t\t\telse {\n");
      out.write("// \t\t\t\tobj.innerHTML = 'Error: [' + redips.request.status + '] ' + redips.request.statusText;\n");
      out.write("// \t\t\t}\n");
      out.write("// \t    }\n");
      out.write("// \t};\n");
      out.write("\tredips.request.send(null); // send request\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("// show tooltip (when mouse is over element of question table) \n");
      out.write("redips.showTooltip = function (e) {\n");
      out.write("\tvar element = e.target || e.srcElement,\t// define element from the fired event\n");
      out.write("\t\tid = element.id,\t\t\t\t\t// id of the DIV element is question ID (written as inner HTML)\n");
      out.write("\t\tbox = element,\t\t\t\t\t\t// remember box object (needed for offset calculation)\n");
      out.write("\t\tscrollPosition,\t\t\t\t\t\t// scroll position\n");
      out.write("\t\toTop, oLeft;\t\t\t\t\t\t// offset Top & offset Left\n");
      out.write("\t// get scroll position and include scroll position in offset calculation\n");
      out.write("\t// use REDIPS.drag.getScrollPosition() for scroll position\n");
      out.write("\tscrollPosition = REDIPS.drag.getScrollPosition();\n");
      out.write("\toLeft = scrollPosition[0];\n");
      out.write("\toTop = scrollPosition[1];\n");
      out.write("\t// loop to the root element and return box offset (top, right, bottom, left)\n");
      out.write("\tdo {\n");
      out.write("\t\toLeft += box.offsetLeft;\n");
      out.write("\t\toTop += box.offsetTop;\n");
      out.write("\t\tbox = box.offsetParent;\n");
      out.write("\t}\n");
      out.write("\twhile (box && box.nodeName !== 'BODY');\n");
      out.write("\t// set popup near to the element\n");
      out.write("\tredips.hoverDiv.style.top  = (oTop + 22) + 'px';\n");
      out.write("\tredips.hoverDiv.style.left = oLeft + 'px';\n");
      out.write("\t// send request (input parameter is object reference)\n");
      out.write("\tredips.uest(redips.hoverDiv, id);\n");
      out.write("\t// set visibility\n");
      out.write("\tredips.hoverDiv.style.visibility = 'visible';\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// hide tooltip\n");
      out.write("redips.hideTooltip = function () {\n");
      out.write("\tredips.hoverDiv.style.visibility = 'hidden';\t\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// function shows/hides tables in page containers\n");
      out.write("// input parameters are button reference (to change button label) and id of page container\n");
      out.write("redips.toggle = function (btn, page_id) {\n");
      out.write("\tvar page = document.getElementById(page_id);\n");
      out.write("\tif (page.style.display === '') {\n");
      out.write("\t\tbtn.value = 'Table';\n");
      out.write("// \t\tpage.style.display = 'none';\n");
      out.write("\t}\n");
      out.write("\telse {\n");
      out.write("\t\tbtn.value = 'Hide';\n");
      out.write("\t\tpage.style.display = '';\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// set onmouseover & onmouseout to all div elements inside DIV id=\"drag\"\n");
      out.write("redips.setEvents = function () {\n");
      out.write("\tvar regex_drag = /\\bdrag\\b/i,\t// regular expression to search \"drag\" class name\n");
      out.write("\t\tdiv, i;\n");
      out.write("\t// collect all div elements inside DIV id=\"drag\"\n");
      out.write("\tdiv = document.getElementById('drag').getElementsByTagName('div');\n");
      out.write("\tfor (i = 0; i < div.length; i++) {\n");
      out.write("\t\t// only DIV elements that contains \"drag\" in class name\n");
      out.write("\t\tif (regex_drag.test(div[i].className)) {\n");
      out.write("\t\t\tREDIPS.event.add(div[i], 'mouseover', redips.showTooltip);\n");
      out.write("\t\t\tREDIPS.event.add(div[i], 'mouseout', redips.hideTooltip);\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("\t// remember size (width and height) of DIV elements in question table\n");
      out.write("\t// needed in case when element is returned to the left table\n");
      out.write("\tredips.size.w = div[0].style.width;\n");
      out.write("\tredips.size.h = div[0].style.height;\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// initially hide all page containers but first page container\n");
      out.write("// tables are closed in P block - page container\n");
      out.write("redips.hideTables = function () {\n");
      out.write("\tvar div, i;\n");
      out.write("\t// collect page containers in right DIV container\n");
      out.write("\tdiv = document.getElementById(redips.right).getElementsByTagName('div');\n");
      out.write("\t// hide all page containers but first\n");
      out.write("\tfor (i = 1; i < div.length; i++) {\n");
      out.write("// \t\tdiv[i].style.display = 'none';\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// set class=\"single\" to all cells in question table (left table)\n");
      out.write("redips.singleContent = function () {\n");
      out.write("\tvar cell, i;\n");
      out.write("\t// collect table cells from left table\n");
      out.write("\tcell = document.getElementById('table1').getElementsByTagName('td');\n");
      out.write("\t// set class='single' to all table cells\n");
      out.write("\t// to prevent 'switching' content from left and right tables\n");
      out.write("\tfor (i = 0; i < cell.length; i++) {\n");
      out.write("\t\tcell[i].className = 'single';\n");
      out.write("\t}\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// find container and return container id\n");
      out.write("redips.findContainer = function (c) {\n");
      out.write("\t// loop up until found target DIV container \n");
      out.write("\twhile (c && c.id !== redips.left && c.id !== redips.right) {\n");
      out.write("\t\tc = c.parentNode;\n");
      out.write("\t}\n");
      out.write("    // return container id\n");
      out.write("    return c.id;\n");
      out.write("};\n");
      out.write("\n");
      out.write("\n");
      out.write("// add onload event listener\n");
      out.write("if (window.addEventListener) {\n");
      out.write("\twindow.addEventListener('load', redips.init, false);\n");
      out.write("}\n");
      out.write("else if (window.attachEvent) {\n");
      out.write("\twindow.attachEvent('onload', redips.init);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write("\t\n");
      out.write("\t$('td', '#table77').each(function(i) {\n");
      out.write("\t   // $(this).text(i+1);\n");
      out.write("\t    \n");
      out.write("\t});\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t$('#table77.paginated').each(function() {\n");
      out.write("\t\talert('plop');\n");
      out.write("\t    var currentPage = 0;\n");
      out.write("\t    var numPerPage = 10;\n");
      out.write("\t    var $table = $(this);\n");
      out.write("\t    $table.bind('repaginate', function() {\n");
      out.write("\t        $table.find('tbody tr').hide().slice(currentPage * numPerPage, (currentPage + 1) * numPerPage).show();\n");
      out.write("\t    });\n");
      out.write("\t    $table.trigger('repaginate');\n");
      out.write("\t    var numRows = $table.find('tbody tr').length;\n");
      out.write("\t    var numPages = Math.ceil(numRows / numPerPage);\n");
      out.write("\t    var $pager = $('<div class=\"pager\" style=\"margin-left: 363px\"></div>');\n");
      out.write("\t    for (var page = 0; page < numPages; page++) {\n");
      out.write("\t        $('<span class=\"page-number\"></span>').text(page + 1).bind('click', {\n");
      out.write("\t            newPage: page\n");
      out.write("\t        }, function(event) {\n");
      out.write("\t            currentPage = event.data['newPage'];\n");
      out.write("\t            $table.trigger('repaginate');\n");
      out.write("\t            $(this).addClass('active').siblings().removeClass('active');\n");
      out.write("\t        }).appendTo($pager).addClass('clickable');\n");
      out.write("\t    }\n");
      out.write("\t    $pager.insertBefore(\"#table77\").find('span.page-number:first').addClass('active');\n");
      out.write("\t});\n");
      out.write("\t\n");
      out.write("});\n");
      out.write("\n");
      out.write("function saveToTab(idOutlet,destinationPort){\n");
      out.write("\tvar stringIdOutlet = \"'\"+idOutlet+\"'\";\n");
      out.write("\tupdates[stringIdOutlet] = destinationPort;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function showTab(){\n");
      out.write("\talert('plop');\n");
      out.write("\tconsole.log(updates);\n");
      out.write("\tvar show = \"\";\n");
      out.write("\t for(var id in updates){\n");
      out.write("\t    show += id + ' : ' + updates[id] + ' , ';\n");
      out.write("\t  }\n");
      out.write("\t//ajax jquery\n");
      out.write("\t    \t   $.ajax({\n");
      out.write("    \t\t   \ttype: \"PUT\",\n");
      out.write("    \t        url: 'updateOutlets',\n");
      out.write("    \t        data: (show),\n");
      out.write("    \t        dataType: 'json',\n");
      out.write("    \t        success:function(json) {\n");
      out.write("    \t        \talert(json);\n");
      out.write("     \t        \t\n");
      out.write("\t\t\t\t},\n");
      out.write("    \t        error: function(jqXHR, textStatus, errorThrown) {\n");
      out.write("    \t            alert(\"Issue fetching the JSON: \"\n");
      out.write("    \t                + textStatus + \" \"\n");
      out.write("    \t                + errorThrown + \" !\");\n");
      out.write("    \t        }\n");
      out.write("    \t        });\n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t \n");
      out.write("\t alert(show);\n");
      out.write("}\n");
      out.write("\n");
      out.write("\t\t");
      out.write("</script>");
      out.write("<div>");
      out.write("<h2>");
      out.write("Nom du switch : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${netSwitch.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h2>");
      out.write("<table style=\"width: 150px\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("Vlan non-taggués");
      out.write("</td>");
      out.write("</tr>");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("</table>");
      out.write("</div>");
      out.write("<div id=\"drag\">");
      out.write("<div id=\"left_container\">");
      out.write("<div id=\"left\">");
      out.write("<table class=\"paginated\" id=\"table77\">");
      out.write("<thead>");
      out.write("<tr>");
      out.write("<th scope=\"col\">");
      out.write("Prises non connectées (");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${listOutletUnpluggedSize}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(')');
      out.write("</th>");
      out.write("</tr>");
      out.write("</thead>");
      out.write("<tbody>");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("<tr>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("<tr>");
      out.write("<td/>");
      out.write("</tr>");
      out.write("</tbody>");
      out.write("</table>");
      out.write("<table style=\"margin-left: 363px\">");
      out.write("<tr>");
      out.write("<td>");
      out.write("plop");
      out.write("</td>");
      out.write("</tr>");
      out.write("</table>");
      out.write("</div>");
      out.write("</div>");
      out.write("<div id=\"right\">");
      if (_jspx_meth_c_005fforEach_005f2(_jspx_page_context))
        return;
      out.write("</div>");
      out.write("<input value=\"Enregistrer\" onclick=\"showTab()\" type=\"button\"/>");
      out.write("</div>");
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

  private boolean _jspx_meth_c_005fforEach_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(398,80) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("loop");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(398,80) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("vlanUntagged");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(398,80) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/uc/admin/updateswitchconnection.jspx(398,80) '${listVlansUntagged}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listVlansUntagged}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr>");
          out.write("<td style=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("background-color: ${vlanUntagged.rgbVlanColor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vlanUntagged.num}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write(':');
          out.write(' ');
          out.write("<b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vlanUntagged.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</b>");
          out.write("</td>");
          out.write("</tr>");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(423,88) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVarStatus("loop");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(423,88) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("outletUnplugged");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(423,88) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/uc/admin/updateswitchconnection.jspx(423,88) '${listOutletUnplugged}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${listOutletUnplugged}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<tr>");
          out.write("<td>");
          out.write("<div style=\"width: 100px\" class=\"drag\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${outletUnplugged.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write("prise n°");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${outletUnplugged.num}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(' ');
          out.write('(');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${outletUnplugged.room.name}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(')');
          out.write("</div>");
          out.write("</td>");
          out.write("</tr>");
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
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f2.setParent(null);
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(458,71) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVarStatus("status");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(458,71) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setVar("netModules");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(458,71) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f2.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/uc/admin/updateswitchconnection.jspx(458,71) '${mapPort}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${mapPort}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
      if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("<table id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("table${status.index}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write("<tr>");
          out.write("<td title=\"You can not drop here\" colspan=\"10\" class=\"mark\">");
          out.write("<h3>");
          out.write("module n° ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${netModules.key.num}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</h3>");
          out.write("</td>");
          out.write("</tr>");
          out.write("<tr>");
          if (_jspx_meth_c_005fforEach_005f3(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
            return true;
          out.write("</tr>");
          out.write("</table>");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f2.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(465,73) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVarStatus("loop");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(465,73) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setVar("port");
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(465,73) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f3.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/uc/admin/updateswitchconnection.jspx(465,73) '${netModules.value}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${netModules.value}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
      if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("<td class=\"mark\">");
          out.write("<a href=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("../port/details?idPort=${port.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${port.num}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>");
          out.write("</td>");
          out.write("<td style=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("background-color: ${port.vlanUntagged.rgbVlanColor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${port.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
            return true;
          out.write("</td>");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f3.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(467,65) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not loop.first and loop.index % 5 == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \t</tr><tr> ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /WEB-INF/views/uc/admin/updateswitchconnection.jspx(475,45) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${port.outlet != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<div class=\"drag\" id=\"" + (java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${port.outlet.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false) + "\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${port.outlet.code}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</div>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
