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
        <form action="disupdateform" method="post">
            <table>
            	<tr>
            		<td><input type="hidden" name= "id" value=${dis.id }></td>
            	</tr>
                <tr>
                    <td class="boardtitle">게시글 제목</td>
                    <td><input type="text" name="title" value=${dis.title }></td>
                </tr>
                <tr>
                    <td class="boardtitle">게시글 내용</td>
                    <td><textarea class="boardcontent" name="content" value=${dis.content }></textarea></td>
                </tr>
                <tr>
                    <td class="boardtitle">게시글 작성자</td>
                    <td><input type="text" name="author" value="관리자"required="required" readonly="readonly"></td>
                </tr>
<!--                   <tr>
                    <td>게시글 작성일자</td>
                    <td><input type="date" name="day" value=${com.day }></td>
                </tr>-->
            </table>
            		<div>
						<tr>
							<td><button type="submit" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">게시글 수정</button></td>
						</tr>
					</div><br>
					<div>
						<tr>
							<td><button type="reset" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">재작성</button>
					    </tr>
					</div>
        </form>
                 	   </div>

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