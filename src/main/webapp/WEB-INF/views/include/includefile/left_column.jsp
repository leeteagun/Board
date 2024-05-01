<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>    
		
<c:set var="contextPath" value="${contextPath}" />
		
<!-- jQuery 라이브러리 로드 -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
<script>
    $(document).ready(function() {
        // 세브란스 병원 링크 클릭 시
        $("a[href='https://sev.severance.healthcare/sev/index.do']").click(function(event) {
            // 기본 동작 방지
            event.preventDefault();
            
            // 알림창 표시
            var confirmation = 
            	confirm("서울 세브란스병원은 한국 최대의 종합병원으로, 역사와 국내외적 평가에서 높은 명성을 자랑합니다. 최신 의료 기술과 교육, 연구에 기반을 둔 병원입니다. \n서울세브란스병원 사이트로 이동합니다.");
		            
            // 확인 버튼을 클릭한 경우
            if (confirmation) {
                // 새 창으로 이동
                window.open($(this).attr("href"), "_blank");
            }
        });
    });
</script>
		
		<!-- Sidebar -->
		<ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">
		
		    <!-- Sidebar - Brand -->
			<a class="sidebar-brand d-flex align-items-center justify-content-center" href="${pageContext.request.contextPath}/com">
			    <div class="sidebar-brand-icon rotate-n-15">
			    </div>
			    <div class="sidebar-brand-text mx-3">혀  균 <br>블로그</div>
			</a>

		
		    <!-- Divider -->
		    <hr class="sidebar-divider my-0">
		
		    <!-- 세대별 흔한 질병 -->
		    <li class="nav-item active">
		        <a class="nav-link" href="${contextPath}/com">
		            <span>세대별 흔한 질병</span></a>
		    </li>
		
		    <!-- 질병 및 증상 -->
		    <li class="nav-item active">
		        <a class="nav-link" href="${contextPath}/dis">
		            <span>질병 및 증상</span></a>
		    </li>
		    <!-- 의료서비스 -->
		    <li class="nav-item active">
		        <a class="nav-link" href="${contextPath}/hea">
		            <span>의료서비스</span></a>
		    </li>
		    <!-- 건강관리 및 건강생활 -->
		    <li class="nav-item active">
		        <a class="nav-link" href="${contextPath}/med">
		            <span>건강관리 및 건강생활</span></a>
		    </li>
		    
		    <!-- 서울 세브란스병원 -->
		    <li class="nav-item active">
		        <a class="nav-link" href="https://sev.severance.healthcare/sev/index.do">
		            <span>서울 세브란스병원</span></a>
		    </li>
		    
		</ul>
