<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<table>
	<c:forEach var="userDetail" items="${userDetail }">
	<tr>
		<td>${userDetail.userNo }</td>
		<td>${userDetail.userId }</td>
		<td>${userDetail.userName }</td>
		<td>${userDetail.userHomeNumber }</td>
		<td>${userDetail.userPhone }</td>
		<td>${userDetail.userSchool }</td>
		<td>${userDetail.userGrade }</td>
		<td>${userDetail.userAddress }</td>

	</tr>
	</c:forEach>
</table>