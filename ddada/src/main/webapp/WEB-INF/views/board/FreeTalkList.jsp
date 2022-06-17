<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- contextPath이지만, 준혁이는 path  -->
<c:set var="path"  value="${pageContext.request.contextPath}"  />
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
   <title>FreeTalk</title>
   <!-- <link rel="stylesheet" href="css/bootstrap.css"> -->
</head>
<body>
<!--       <div class="container"> -->
            <br>
      		<h3 class="myDD_category" style="text-align:left;"> 커뮤니티 ></h3>
      		<br>
      		<h4>쉬어가는 TALK</h4>
            <table class="table table-hover">
                  <thead>
                        <tr>
                              <th>번호</th>
                              <th>제목</th>
                              <th>작성자</th>
                              <th>날짜</th>
                              <th>조회수</th>
                        </tr>
                  </thead>
                  <tbody>
                        <tr>
                              <td>123</td>
                              <td>가나다라마바사</td>
                              <td>홍길동</td>
                              <td>2022.04.20</td>
                              <td>2</td>
                        </tr>
                        <tr>
                              <td>456</td>
                              <td>abcdefg</td>
                              <td>오토퀴</td>
                              <td>2022.03.23</td>
                              <td>3</td>
                        </tr>
                        <tr>
                              <td>678</td>
                              <td>zxcvasdf</td>
                              <td>초코짱</td>
                              <td>2022.02.22</td>
                              <td>4</td>
                        </tr>
                  </tbody>
            </table>
      <hr/>
      
      <a class="btn btn-default pull-right">글쓰기</a>
      
      <div class="text-center">
            <ul class="pagination">
                  <li class="page-item"><a class="page-link" href="#">1</a>
                  <li class="page-item"><a class="page-link" href="#">2</a>
                  <li class="page-item"><a class="page-link" href="#">3</a>
                  <li class="page-item"><a class="page-link" href="#">4</a>
                  <li class="page-item"><a class="page-link" href="#">5</a>
            </ul>
      </div>
<!--    </div> -->

   <script src="js/jquery-3.1.1.js"></script>
   <script src="js/bootstrap.js"></script>
</body>
</html>