
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER PRIMARY KEY,
    MEMBER_ID VARCHAR2(20) UNIQUE,
    MEMBER_PW VARCHAR2(100) NOT NULL,
    MEMBER_NAME VARCHAR2(20),
    AGE NUMBER,
    ENROLL_DATE VARCHAR2(20)
);

DELETE FROM MEMBER;
DELETE FROM NOTICE;
DELETE FROM BOARD;
COMMIT;

CREATE SEQUENCE MEMBER_SEQ;
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user01', '1234', '�ý�1', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user02', '1234', '�ý�2', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user03', '1234', '�ý�3', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user04', '1234', '�ý�4', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user05', '1234', '�ý�5', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user06', '1234', '�ý�6', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user07', '1234', '�ý�7', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user08', '1234', '�ý�8', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user09', '1234', '�ý�9', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user10', '1234', '�ý�10', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user11', '1234', '�ý�11', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user12', '1234', '�ý�12', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user13', '1234', '�ý�13', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user14', '1234', '�ý�14', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user15', '1234', '�ý�15', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user16', '1234', '�ý�16', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user17', '1234', '�ý�17', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user18', '1234', '�ý�18', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user19', '1234', '�ý�19', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user20', '1234', '�ý�20', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user21', '1234', '�ý�21', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user22', '1234', '�ý�22', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user23', '1234', '�ý�23', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user24', '1234', '�ý�24', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user25', '1234', '�ý�25', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user26', '1234', '�ý�26', 20, sysdate);
commit;
SELECT * FROM MEMBER order by member_no desc;

select *
from (
    select rownum rnum, S.*
    from (
        select 
            member_no as memberNo, 
            member_id as memberId, 
            member_pw as memberPw,
            member_name as memberName, 
            age, 
            enroll_date as enrollDate 
        from member 
        order by member_no desc) 
    S)
where rnum between 1 and 5;

CREATE TABLE BOARD(
    BOARD_NO        NUMBER          PRIMARY KEY,
    BOARD_TITLE     VARCHAR2(1000)  NOT NULL,
    BOARD_CONTENT   VARCHAR2(2000)  NOT NULL,
    BOARD_WRITER    VARCHAR2(20)    NOT NULL,
    READ_COUNT      NUMBER DEFAULT  0,
    REG_DATE        VARCHAR2(20)
);

CREATE SEQUENCE BOARD_SEQ;

select *
from
	(select rownum as rnum, B.*
	from
		(select
			board_no as boardNo,
			board_title as boardTitle,
			board_content as boardContent,
			board_writer as boardWriter,
			read_count as readCount,
			reg_date as regDate
		from board
		order by board_no desc)
	B)
where rnum between 1 and 5;
select * from board;
insert into board values (board_seq.nextval, '�ý�', '�ýýýýý�', 'user01', default, sysdate);
insert into board values (board_seq.nextval, '�ý�?', '�ýýýýý�', 'user02', default, sysdate);
insert into board values (board_seq.nextval, '�ýý�', '�ýýýýý�', 'user03', default, sysdate);
insert into board values (board_seq.nextval, '�ý�!!', '�ýýýýý�', 'user04', default, sysdate);
insert into board values (board_seq.nextval, '�ýýýý�', '�ýýýýý�', 'user05', default, sysdate);
insert into board values (board_seq.nextval, '�������̽�', '�ýýýýý�', 'user06', default, sysdate);
insert into board values (board_seq.nextval, '�ý�22', '�ýýýýý�', 'user07', default, sysdate);
insert into board values (board_seq.nextval, '�ý�@!!', '�ýýýýý�', 'user08', default, sysdate);
insert into board values (board_seq.nextval, '�ý��ý��ý�', '�ýýýýý�', 'user09', default, sysdate);
insert into board values (board_seq.nextval, '�ý�!!', '�ýýýýý�', 'user10', default, sysdate);

update board set read_count = read_count + 1 where board_no = 33;
commit;

CREATE TABLE NOTICE(
    NOTICE_NO NUMBER PRIMARY KEY,
    NOTICE_TITLE VARCHAR2(1000),
    NOTICE_WRITER VARCHAR2(20) REFERENCES MEMBER(MEMBER_ID),
    NOTICE_CONTENT VARCHAR2(4000),
    FILENAME VARCHAR2(200),
    FILEPATH VARCHAR2(200),
    REG_DATE VARCHAR2(20)
);

CREATE SEQUENCE NOTICE_SEQ;

SELECT * FROM NOTICE;
commit;
SELECT *
FROM 
    (SELECT ROWNUM AS RNUM, N.*
    FROM 
        (SELECT 
            NOTICE_NO AS noticeNo,
            NOTICE_TITLE AS noticeTitle,
            NOTICE_WRITER AS noticeWriter,
            NOTICE_CONTENT AS noticeContent,
            filename,
            filepath,
            REG_DATE AS regDate
        FROM NOTICE
        ORDER BY NOTICE_NO DESC) 
    N
) WHERE RNUM BETWEEN 1 AND 2;
insert into notice values (notice_seq.nextval, '�ý�', 'user01', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ý�?', 'user02', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ýý�', 'user03', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ý�!!', 'user04', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ýýýý�', 'user05', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�������̽�', 'user06', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ý�22', 'user07', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ý�@!!', 'user08', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ý��ý��ý�', 'user09', '�ýýýýý�', null, null, sysdate);
insert into notice values (notice_seq.nextval, '�ý�!!', 'user10', '�ýýýýý�', null, null, sysdate);

CREATE TABLE DIRECT_MESSAGE(
    DM_NO NUMBER PRIMARY KEY,
    DM_SENDER VARCHAR2(20),
    DM_RECEIVER VARCHAR2(20),
    MESSAGE VARCHAR2(4000),
    CHECK_MSG NUMBER DEFAULT 0,  --0�ΰ�� ���� ����, 1�̸� ����
    DM_DATE VARCHAR2(20)
);

CREATE SEQUENCE DM_SEQ;

SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:ss') FROM DUAL;
