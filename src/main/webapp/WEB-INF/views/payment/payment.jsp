<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  

<table>
	<c:forEach var="payment" items="${payment }">
	<tr>
		<td>${payment.paymentNo }</td>
		<td>${payment.userNo }</td>
		<td>${payment.seatNumber }</td>
		<td>${payment.startingDate }</td>
		<td>${payment.endingDate }</td>
		<td>${payment.paymentCost }</td>
		<td>${payment.paymentPlan }</td>
	</tr>
	</c:forEach>
</table>