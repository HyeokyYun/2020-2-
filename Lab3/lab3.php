<?php
    $username = $_GET['username'];
    $fnumber = $_GET['fnumber'];
    $snumber = $_GET['snumber'];
    $tnumber = $_GET['tnumber'];
    $email = $_GET['email'];
    $date = $_GET['date'];
    $from = $_GET['from'];
    $destination = $_GET['destination'];
    $hour = $_GET['hour'];
    $minute = $_GET['minute'];
    $transportation = $_GET['transportation'];
    $claim = $_GET['claim'];
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        legend{
            font-size: xx-large;
            font-weight: bold;
            text-align: center;
        }
        fieldset{
            margin-top: 30px;
            border-color: darkslateblue;
            width: 30%;
            display: inline-block;
            margin-left: 35%;
            height:870px;
            text-align: center;
            margin-bottom: 70px;
        }
        body{
            background-color: rgb(187, 218, 233);
            display: inline;
        }

        #main{
            position: relative;
            overflow: auto;
            background-color: lightgreen;
            padding: 10px;
            border-radius: 5px;
        }
        #name, #pnumber, #birth, #email, #travel, #time, #train{
            padding: 5px;
            background-color: #F5FFFA;
            width: 50%;
            margin: 5px;
            border-radius: 15px;
            margin-left: 25%;
        }

        #clear{
            margin: 5px;
        }

    </style>
</head>
<body>
    <fieldset>
        <legend>
            <h3>승차권 예매정보</h3>
        </legend>
        <div id="main">
            <div id="name">
                <h3>이름</h3> <?= $username?>
            </div>
            <div id="pnumber">
                <h3>번호</h3> <?= $fnumber?>-****-<?= $tnumber?>
            </div>
            <div id="birth">
                <h3>생년월일</h3> <?= $date?>
            </div>
            <div id="email">
                <h3>E-mail</h3> <?= $email?>
            </div>
            <div id="travel">
                <h3>여행정보</h3> <?= $from?> => <?= $destination?>
            </div>
            <div id="time">
                <h3>출발시간</h3> <?= $hour?>시<?= $minute?>분
            </div>
            <div id="train">
                <h3>이용열차</h3> <?= $transportation?> 열차
            </div>
        </div>
        <div id="clear">
            <form>
                <button>
                    <a href="http://koreapost.dothome.co.kr/lab3.html">확인</a>
                </button>
            </form>
        </div>
    </fieldset>
    
</body>
</html>
