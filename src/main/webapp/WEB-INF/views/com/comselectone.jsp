<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html lang="en">

<head>

    <%@include file="../include/includefile/head.jsp"  %>

</head>

<body id="page-top">

    <!-- Page Wrapper -->
    <div id="wrapper">

        <!-- Sidebar -->
       
       <%@include file="../include/includefile/left_column.jsp"  %>
       
        <!-- End of Sidebar -->

        <!-- Content Wrapper -->
       <%@include file="../include/includefile/header.jsp"  %>
                <!-- End of Topbar -->

                <!-- Begin Page Content -->
                <div class="container-fluid">

                    <!-- Page Heading -->
					<form method="post">
					    <h2>게시글 상세 정보</h2>
					    <table class="table">
					    	<!-- <tr>
								<td>글 번호</td>					    	
								<td>${com.id }</td>					    	
					    	</tr> -->
					        <tr>
					            <td>글 제목</td>
					            <td>${com.title }</td>
					        </tr>
					        <tr>
					            <td>글 내용</td>
					            <td>${com.content }</td>
					        </tr>
					        <tr>
					            <td>작성자</td>
					            <td>${com.author }</td>
					        </tr>
					        <tr>
					            <td>작성일</td>
					            <td>${com.day }</td>
					        </tr>
					    </table>
					</form>
            
		<c:if test="${not empty sessionScope.isValidPassword}">
		    <div><a href="com/comupdateform?id=${com.id }" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">게시글 수정</a>${comupdateform }</div><br>
		    <div><a href="com/comdelete?id=${com.id }" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">게시글 삭제</a>${comupdelete }</div>
		</c:if>

            <!-- Footer -->
		<%@include file="../include/includefile/footer.jsp"  %>
            
            <!-- End of Footer -->
        </div>

    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>

</body>

</html>