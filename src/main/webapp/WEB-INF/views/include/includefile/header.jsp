<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="true" %>    

<c:set var="contextPath" value="${contextPath}" />
       <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                        <i class="fa fa-bars"></i>
                    </button>


                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - User Information -->
							<li class="nav-item dropdown no-arrow">
							    <% if (session.getAttribute("isValidPassword") != null) { %>
							        <a class="nav-link dropdown-toggle" id="userDropdown" role="button"
							            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"
							            style="pointer-events: none;">
							            <span class="mr-2 d-none d-lg-inline text-gray-600 small">
							                <%=session.getAttribute("isValidPassword") %>님
							            </span>
							        </a>
							    <% } %>
							</li>
							<!-- <img class="img-profile rounded-circle"
                                    src="http://localhost:8080/resources/assets/img/undraw_profile.svg" alt="프로필 이미지"> -->
                            </a>
                            <!-- Dropdown - User Information -->
<!--                             <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                                aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                                    Logout
                                </a>
                            </div> -->
                        </li>

                    </ul>

                </nav>