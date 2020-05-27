<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>다중 파일 업로드 테스트</h2>
	<hr>
	<h3> common-fileupload-1.2.2.jar</h3>
	<h3> common-io.2.1.jar 라이브러리 사용</h3>
	<h3>
		업로드 용량 제한 없음<br>
		2GB까지 테스트<br>
		다중파일 가능
	</h3>
	<form action="/multiUpload" method="post" enctype="multipart/form-data">
		파일 업로드 : <input type="file" name="files" multiple="multiple"><br>
		내용 : <textarea rows="3" cols="50" name="descript"></textarea><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>