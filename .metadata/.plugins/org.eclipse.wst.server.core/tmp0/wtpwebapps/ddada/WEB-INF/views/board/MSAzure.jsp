<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("UTF-8");
%>

<!doctype html>
<html lang="en">
  <head>
    <script src="https://kit.fontawesome.com/a62f32303e.js" crossorigin="anonymous"></script>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
   <title>MS Azure</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    <link rel="stylesheet" href="${contextPath}/resources/bs_classroom.css">
    <!-- <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script> -->
    <!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">  -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script> 
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script> 
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script> 
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <!-- <script src="bootstrap.min.js"></script> -->
   <style>   
      .text-header{
         font-size: 1.2em;
       font-weight: bold;
         margin-bottom: 0.5em;
      }
      .container {
        width: 1000px;
        margin: 2px auto;
        text-align:left;
        border: 0px solid #bcbcbc;
        float : left;
        border-radius : 15px 15px 15px 15px;
        margin-top:10px;
         }
        .container1 {
        width: 1050px;
        margin: 2px auto;
        text-align:left;
        border: 1px solid #bcbcbc;
        float : left;
        border-radius : 15px 15px 15px 15px;
        margin-top:10px;
         }
        h2{
        line-height : 30px;
        width : 980px;
        margin-top : 10px;
        margin-bottom : 5px;
        }
        .certiExplain{
        width : 950px;
        }
        p{
        margin-top : 10px;
        margin-bottom : 10px;
        }
        th, td{
        border-left: 1px solid #bcbcbc;
        border-bottom : 1px solid #bcbcbc;
        }
        /* th:first-child, td:first-child {
          border-left: none;
        } */
       .table td, .contents .table th {
       padding: 0.75rem 0.5rem;
       vertical-align: middle;
       text-align: center;
       line-height: inherit;
      }
      .table {
       margin-bottom: 0px;
      }
      .sqldinfo{
      text-align : center;
      float : relative;
      margin-left : 300px;
      }
   </style>
  </head>
  <body>
   <div class="col-9" style="margin-top: 15px; text-align : center;">
        <ul class="nav nav-tabs" id="myTab" role="tablist" style = "width : 1000px; height : 45px;">
          <li class="nav-item" role="presentation">
            <a class="nav-link active" id="license-tab" style = "width : 333px;" data-toggle="tab" href="#license" role="tab" aria-controls="license" aria-selected="true">????????? ??????</a>
          </li>
          <li class="nav-item" role="presentation">
            <a class="nav-link" id="home-tab" style = "width : 334px;" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="false">?????? ?????? ??? ????????????</a>
          </li>
          <li class="nav-item" role="presentation">
            <a class="nav-link" id="temp-tab"style = "width : 333px;" data-toggle="tab" href="#temp" role="tab" aria-controls="temp" aria-selected="false">????????????</a>
          </li>
        </ul>
        </div>
      <!-- ????????? ???????????? -->
        <div class="tab-content" id="myTabContent">
          <div class="tab-pane fade show active" id="license" role="tabpanel" aria-labelledby="license-tab">
          <div class="container">
               <table>
              <tr>
                 <td style = "width : 1200px; border-left : none; border-bottom : none;">
                  <h2><a href="#" class="card-link" target="_blank">MS Azure : AZ-900</a>
                     <a class="btn btn-primary" href="https://quizeey.com/az-900" role="button" style = "float:relative;">???????????? ????????????</a>
                        <a class="btn btn-primary" href="https://www.certiport.com/locator" role="button" style = "float:relative;">????????????</a>
                     <span class = "writebutton" style = "float : right;">
                        <i class="fa-solid fa-pen"></i>
                     </span>
                      </h2>
                  <hr/>
                  <div class = "certiExplain">
                     <h4 class = text-header>
                        ???MS Azure : AZ-900???????
                     </h4>
                     <p>Azure??? 2010????????? Microsoft?????? ???????????? ???????????? ????????? ??????????????? Infrastructure. Platform, Software??? ????????? ??????????????? ???????????? ?????? ????????? ???????????? ???????????????.<br>
                     Microsoft??? ?????? ???????????? ??????????????? ?????? ???????????? ??????????????? ???????????? 'Azure ??????????????????'??? ???????????? ??????. ?????? ??????????????? ?????? ??? ?????? ?????? ?????? ????????? Microsoft Azure??? ?????? ?????? ?????? ??? ????????? ???????????? ?????? Role-based??? ????????? ??????????????? ??????.<br>
                     ??? ????????? AZ-900??? ?????? ??? ???????????? ?????? ????????? ??? ???????????? ?????? ??????????????? Azure??? ?????? ????????? ??????????????? ?????? ???????????????.</p><br>
                  </div>
                  <div class = "certiExplain">
                     <h4 class = text-header>
                        oMS Azure ????????? ??????
                     </h4>
                     <img src="https://blog.kakaocdn.net/dn/eC9ezK/btrpOxsnU5y/GudFi3GMC8WWkXNEy1Eum0/img.png" srcset="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&amp;fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FeC9ezK%2FbtrpOxsnU5y%2FGudFi3GMC8WWkXNEy1Eum0%2Fimg.png" data-ke-mobilestyle="alignCenter" style = "width : 1000px;">
                  </div><br>
                  <div class = "certiExplain">
                     <h4 class = text-header>
                        ????????????
                     </h4>
                     <p><a href="https://www.microsoft.com/ko-kr" class="card-link" target="_blank">Microsoft(????????????)</a></p><br>
                  </div>
                  <div class = "certiExplain">
                     <h4 class = text-header>
                        ????????????
                     </h4>
                     <table class="table_type1" style = "width : 800px; border-top: 1px solid #bcbcbc; text-align : center; border-right : 1px solid #bcbcbc;">
                             <colgroup>
                                 <col style="width: 15%;">
                                 <col style="width: 15%;">
                                 <col style="width: 35%;">
                             </colgroup>
                             <thead>
                             <tr style = "background-color : #6ca8d8;">
                                 <th>??????</th>
                                 <th>??????</th>
                                 <th>?????????</th>
                             </tr>
                             </thead>
                             <tbody>
                             <tr>
                                 <td class="center">MS Azure</td>
                                 <td class="center">AZ-900</td>
                                 <td class="center">$69 USD</td>
                             </tr>
                             </tbody>
                         </table>
                  </div>
               </table>
            </div>
          
          </div>
           
            <div class="tab-pane fade" id="home" role="tabpanel" aria-labelledby="home-tab">
            <div class="container">
               <table>
              <tr>
                 <td style = "width : 1200px; border-left : none; border-bottom:none;">
                  <h2><a href="#" target="_blank">MS Azure</a>
                     <a class="btn btn-primary" href="https://quizeey.com/az-900" role="button" style = "float:relative;">???????????? ????????????</a>
                        <a class="btn btn-primary" href="https://www.certiport.com/locator" role="button" style = "float:relative;">????????????</a>
                     <span class = "writebutton" style = "float : right;">
                        <i class="fa-solid fa-pen"></i>
                     </span>
                      </h2>
                  <hr/>
                  <div class = "certiExplain" style = "margin-top : 20px;">
                     <h4 class = text-header>
                        <br>???????????????
                     </h4>
                  </div>
               <div>
                  <table style="border-collapse: collapse; text-align : center; width: 1000px; height: 300px;" border="1" data-ke-align="alignLeft">
                     <tbody>
                     <tr style="height: 20px;">
                     <td style="width: 20.6978%; text-align: center; height: 20px; background-color : #6ca8d8;" colspan="3"><b>Azure Fundamentals (AZ-900)</b></td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 20.6978%; text-align: center; height: 20px; background-color : #cde9ff;">?????????</td>
                     <td style="text-align: center; height: 20px;" colspan="2">$69 (??? 8???2??????)</td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 20.6978%; text-align: center; height: 20px; background-color : #cde9ff;">????????????</td>
                     <td style="text-align: center; height: 20px;" colspan="2">60???</td>
                     </tr>
                     <tr>
                     <td style="width: 20.6978%; text-align: center; background-color : #cde9ff;">?????????</td>
                     <td style="width: 79.3022%; text-align: center;" colspan="2">38~48?????? (<span style="background-color: #ffffff; color: #202124;">???????????? / O, X</span>)</td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 20.6978%; text-align: center; height: 20px; background-color : #cde9ff;">?????????</td>
                     <td style="width: 79.3022%; text-align: center; height: 20px;" colspan="2">700???&nbsp;??????</td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 20.6978%; text-align: center; height: 80px; background-color : #cde9ff;" rowspan="4">????????????</td>
                     <td style="width: 54.3022%; text-align: center; height: 20px;">???????????? ?????? ??????</td>
                     <td style="width: 25%; text-align: center; height: 20px;">15-20%</td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 54.3022%; text-align: center; height: 20px;">?????? Azure ?????????</td>
                     <td style="width: 25%; text-align: center; height: 20px;">30-35%</td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 54.3022%; text-align: center; height: 20px;">??????, ?????? ?????? ??????, ?????? ?????? ??? ??????</td>
                     <td style="width: 25%; text-align: center; height: 20px;">25-30%</td>
                     </tr>
                     <tr style="height: 20px;">
                     <td style="width: 54.3022%; text-align: center; height: 20px;">Azure ??????, ????????? ?????? ?????? ??? ?????? ??????</td>
                     <td style="width: 25%; text-align: center; height: 20px;">25-30%</td>
                     </tr>
                     </tbody>
                  </table>
               </div>
               <div class = "certiExplain">
               <h4 class = text-header>
                        <br>???????????????
               </h4>
                     <h6>
                        <p style="margin-left:20px;">??????????????? : ??????</p>
                        <p style="margin-left:20px;">????????? : ??????(???????????? ????????? ????????? ????????? ?????? ??????)</p>
                        <p style="margin-left:20px;">???????????? : ????????? ????????? ?????? 10???</p>
                     </h6>
               </div>
            </table>
         </div>
      </div>
         <div class="tab-pane fade show" id="temp" role="tabpanel" aria-labelledby="temp-tab">
            <div class="container">
               <h2><a href="#" class="card-link" target="_blank">MS Azure</a>
                        <a class="btn btn-primary" href="https://quizeey.com/az-900" role="button" style = "float:relative;">???????????? ????????????</a>
                        <a class="btn btn-primary" href="https://www.certiport.com/locator" role="button" style = "float:relative;">????????????</a>
                     <span class = "writebutton" style = "float : right;">
                        <i class="fa-solid fa-pen"></i>
                     </span>
                      </h2><hr/>
             <div class="container1" style = "margin-top:10px;">
               <table  class = "etc">
              <tr>
                 <td style = "width : 1000px; padding-left : 30px; border-left : none; border : none;">
                  <h2><a href="http://localhost:8085/myapp/Information1.do?lec_num=441420014" class="card-link">????????? ????????????</a>
                  <button type="button" class="btn btn-primary" style="font-size:medium; background-color: rgba(255, 255, 255, 255);
                        margin: 0px; padding: 0px; box-shadow: none;">
                         <span class="badge badge-light" id = "ddayNetwork" style="padding-top:0px; padding-bottom:0px; margin-top: 5px; color:rgb(255, 40, 40);"></span>
                      </button>
                      </h2>
                  <hr/>
                  <img src="${contextPath}/resources/Image/ryujin.PNG" class="card-img-top" alt="..." style = "float:left; width:100px; height:140px; margin-right:20px; margin-top:-10px;margin-bottom:10px;">
                  <h6>?????? : MS Azure AZ-900</h6>
                  <h6>????????? : ????????? ?????????</h6>
                  <h6>???????????? : 40???</h6>
                  <h6>?????? ?????? : 120,000???<h6>
                  <h6>?????? : ?????? ????????? ??????
                  <span class = "likebutton">
                     <i class="fa-regular fa-heart"></i>
                     <span class = "writebutton">
                     <i class="fa-solid fa-pen"></i>
                     </span>
                     <a class="btn btn-primary" href="http://localhost:8085/myapp/Information1.do?lec_num=441420014" role="button" style = "float:right; margin-top:-10px; margin-right : 20px;">????????????</a>
                  </span></h6>
                 </td>
              </tr>
            </table>
          </div>
          </div>
   </div>
   </div>
</body>
</html>