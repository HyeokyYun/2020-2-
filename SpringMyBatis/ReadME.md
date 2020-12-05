# Lab14 완료!
드디어 끝났다!!
<br>
만난 에러 1<br>
로컬에서 프로젝트의 작동을 확인하고 heroku로 deploy하기 위해 Maven Install을 했는데 자꾸 Build Failure가 나왔다. <br>
정말 별거 아니었는데 DataSourceTest.java에서 에러가 생긴단다. 다른건 아니고 'higher than 4.9 junit'이라는 문구를 보고 pom.xml에서 junit 디펜던시를 찾아보니 version이 4.7로 되어있었다. 그래서 4.9로 바꿔주니 정상작동 하였다. <br>
