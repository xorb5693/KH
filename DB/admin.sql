--계정 생성, 새 접속 시 사용 아이디와 비밀번호에 해당한다--
CREATE USER kh IDENTIFIED by kh;

--계정 접속 권한 획득--
grant resource, connect to kh;