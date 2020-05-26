
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER PRIMARY KEY,
    MEMBER_ID VARCHAR2(20) UNIQUE,
    MEMBER_PW VARCHAR2(20) NOT NULL,
    MEMBER_NAME VARCHAR2(20),
    AGE NUMBER,
    ENROLL_DATE VARCHAR2(20)
);

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