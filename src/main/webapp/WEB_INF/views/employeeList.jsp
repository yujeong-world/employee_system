<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>EmployeeList</title>
</head>
<body>
<h3>직원 목록</h3>
<div>
    <table>
        <thead>
        <tr>
            <th>선택</th>
            <th>직원번호</th>
            <th>직원이름</th>
            <th>직급</th>
            <th>전화번호</th>
            <th>이메일</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employList}" var="dto">

                <td>
                    <input type="checkbox" name="${dto.empId}" value="${dto.empId}" id="check">
                <td>
                <td>${dto.empId}</td>
                <td>${dto.empName}</td>
                <td>${dto.postition}</td>
                <td>${dto.phone}</td>
                <td>${dto.email}</td>


        </c:forEach>
        </tbody>
    </table>
</div>
<script></script>
</body>
</html>
