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
			    <div class="d-sm-flex align-items-center justify-content-between mb-4">
			        <form action="cominsertform" method="post" style="width: 800px;">
			            <table>
			                <tr>
			                    <td class="boardtitle">게시글 제목</td>
			                    <td><input type="text" name="title" required="required"></td>
			                </tr>
			                <tr>
			                    <td class="boardtitle">게시글 내용</td>
			                    <td><textarea class="boardcontent" name="content" required="required"></textarea></td>
			                </tr>
			                <tr>
			                    <td class="boardtitle">게시글 작성자</td>
			                    <td><input type="text" name="author" value="관리자" required="required" readonly="readonly"></td>
			                </tr>
			            </table>
			            <div>
			                <button type="submit" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">게시글 추가</button>
			                <button type="reset" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">재작성</button>
			            </div>
			        </form>
			    </div>                   
          
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
