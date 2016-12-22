<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<table>
	<c:forEach var="attendance" items="${attendance }">
	<tr>
		<td>${attendance.attendanceNo }</td>
		<td>${attendance.userNo }</td>
		<td>${attendance.checkInTime }</td>
		<td>${attendance.checkOutTime }</td>
	</tr>
	</c:forEach>
</table>