<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="./include/includefile/head.jsp"  %>

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
       
       <%@include file="./include/includefile/left_column.jsp"  %>
       
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
       <%@include file="./include/includefile/header.jsp"  %>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
                    <div class="d-sm-flex align-items-center justify-content-between mb-4">
						<form method="post">
						    <h2>의료 서비스</h2>
						    <table class="table">
						        <tr>
						            <th>글 번호</th>
						            <th>글 제목</th>
						            <th>작성자</th>
						            <th>작성일</th>
						        </tr>
						        <c:forEach var="hea" items="${listAll}" varStatus="status">
						            <tr>
						                <td>${status.index + 1}</td>
						                <td><a href="heaselectone?id=${hea.id}">${hea.title}</a></td>
						                <td>${hea.author}</td>
						                <td>${hea.day}</td>
						            </tr>
						        </c:forEach>
						    </table>
						 <div>
						    <!-- 세션이 null이 아닐 때만 "게시글 추가" 링크를 표시 -->
						    <c:if test="${not empty sessionScope.isValidPassword}">
						        <a href="hea/heainsertform" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">게시글 추가</a>
						    </c:if>
						    ${heainsertform }
						</div>
						</form>
						
                    </div>

            </div>                   
          
            <!-- Footer -->
		<%@include file="./include/includefile/footer.jsp"  %>
            
            <!-- End of Footer -->
        </div>
    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

</body>

</html>