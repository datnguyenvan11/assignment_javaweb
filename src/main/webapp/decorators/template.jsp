<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="dec" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<html>
<head>
    <%@ include file="head.jsp"%>
</head>
<body>
<%@ include file="header.jsp"%>
<%@ include file="section-hero.jsp"%>
<%@ include file="categories.jsp"%>
<%@ include file="featured-spad.jsp"%>
<%@ include file="Banner-Begin.jsp"%>
<%@ include file="latest-product.jsp"%>
<%@ include file="from-blog.jsp"%>



<dec:body />

<%@ include file="footer.jsp"%>
</body>
</html>
