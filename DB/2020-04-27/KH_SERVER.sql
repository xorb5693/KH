
CREATE TABLE MEMBER(
    MEMBER_ID VARCHAR2(20) PRIMARY KEY,
    MEMBER_PW VARCHAR2(20) NOT NULL,
    MEMBER_NAME VARCHAR2(20) NOT NULL,
    AGE NUMBER NOT NULL,
    EMAIL VARCHAR2(30) NOT NULL,
    PHONE VARCHAR2(11) NOT NULL,
    ADDRESS VARCHAR2(100) NOT NULL,
    ENROLL_DATE DATE DEFAULT SYSDATE
);

INSERT INTO MEMBER VALUES('user01', '1234', '유저01', 25, 'user01@naver.com', '01012345678', '서울', default);
INSERT INTO MEMBER VALUES('user02', '1234', '유저02', 22, 'user02@naver.com', '01012521678', '대전', default);
INSERT INTO MEMBER VALUES('user03', '1234', '유저03', 16, 'user03@naver.com', '01014734712', '대구', default);
INSERT INTO MEMBER VALUES('user04', '1234', '유저04', 28, 'user04@naver.com', '01034731512', '부산', default);
INSERT INTO MEMBER VALUES('user05', '1234', '유저05', 31, 'user05@naver.com', '01034745152', '울산', default);
INSERT INTO MEMBER VALUES('user06', '1234', '유저06', 42, 'user06@naver.com', '01034721512', '광주', default);
INSERT INTO MEMBER VALUES('user07', '1234', '유저07', 26, 'user07@naver.com', '01012573441', '제주도', default);
INSERT INTO MEMBER VALUES('user08', '1234', '유저08', 21, 'user08@naver.com', '01012599912', '인천', default);
INSERT INTO MEMBER VALUES('user09', '1234', '유저09', 51, 'user09@naver.com', '01016734121', '원주', default);
INSERT INTO MEMBER VALUES('user10', '1234', '유저10', 37, 'user10@naver.com', '01012467821', '청주', default);

SELECT * FROM MEMBER;
COMMIT;
