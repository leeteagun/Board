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
						    <h2>세대별 흔한 질병</h2>
						    <table class="table">
						        <tr>
						            <th>글 번호</th>
						            <th>글 제목</th>
						            <th>작성자</th>
						            <th>작성일</th>
						        </tr>
						        <c:forEach var="com" items="${listAll}" varStatus="status">
						            <tr>
						                <td>${status.index + 1}</td>
						                <td><a href="comselectone?id=${com.id}">${com.title}</a></td>
						                <td>${com.author}</td>
						                <td>${com.day}</td>
						            </tr>
						        </c:forEach>
						    </table>
						<div>
						    <!-- 세션이 null이 아닐 때만 "게시글 추가" 링크를 표시 -->
						    <c:if test="${not empty sessionScope.isValidPassword}">
						        <a href="com/cominsertform" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm">게시글 추가</a>
						    </c:if>
						    ${cominsertform }
						</div>
						</form>
						
                    </div>

            </div>                   
          
            <!-- Footer -->
		<%@include file="./include/includefile/footer.jsp"  %>
            
            <!-- End of Footer -->
        </div>
			<div class="text-right">
			    <!-- 세션에서 "isValidPassword" 속성이 없는 경우에만 관리자 로그인 버튼을 표시 -->
			    <c:if test="${empty sessionScope.isValidPassword}">
			        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" data-toggle="modal" data-target="#passwordModal">관리자 로그인</a>
			    </c:if>
			    <!-- 세션에서 "isValidPassword" 속성이 있는 경우에만 로그아웃 버튼을 표시 -->
			    <c:if test="${not empty sessionScope.isValidPassword}">
			        <a href="/logout" class="btn btn-sm btn-danger">로그아웃</a>
			    </c:if>
			</div>

		<!-- 비밀번호 입력을 위한 모달 -->
		<div class="modal fade" id="passwordModal" tabindex="-1" role="dialog" aria-labelledby="passwordModalLabel" aria-hidden="true">
		    <div class="modal-dialog" role="document">
		        <div class="modal-content">
		            <div class="modal-header">
		                <h5 class="modal-title" id="passwordModalLabel">비밀번호 입력</h5>
		                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		                    <span aria-hidden="true">&times;</span>
		                </button>
		            </div>
		            <form style="width: 100%;" id="passwordForm" method="POST" action="/checkManagerPassword">
		                <div class="modal-body">
		                    <div class="form-group">
		                        <label for="passwordInput">비밀번호</label>
		                        <input type="password" name="password" class="form-control" id="passwordInput" placeholder="비밀번호를 입력하세요">
		                    </div>
		                </div>
		                <div class="modal-footer">
		                    <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
		                    <button type="submit" class="btn btn-primary" id="confirmButton">확인</button>
		                </div>
		            </form>
		        </div>
		    </div>
		</div>



    <!-- Scroll to Top Button-->
    <a class="scroll-to-top rounded" href="#page-top">
        <i class="fas fa-angle-up"></i>
    </a>
	<!-- Bootstrap core JS-->
	<%@ include file="./include/includefile/plugin.jsp"%>


</body>


</html>