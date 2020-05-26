
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER PRIMARY KEY,
    MEMBER_ID VARCHAR2(20) UNIQUE,
    MEMBER_PW VARCHAR2(20) NOT NULL,
    MEMBER_NAME VARCHAR2(20),
    AGE NUMBER,
    ENROLL_DATE VARCHAR2(20)
);

CREATE SEQUENCE MEMBER_SEQ;
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user01', '1234', 'Ω√Ωø1', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user02', '1234', 'Ω√Ωø2', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user03', '1234', 'Ω√Ωø3', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user04', '1234', 'Ω√Ωø4', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user05', '1234', 'Ω√Ωø5', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user06', '1234', 'Ω√Ωø6', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user07', '1234', 'Ω√Ωø7', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user08', '1234', 'Ω√Ωø8', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user09', '1234', 'Ω√Ωø9', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user10', '1234', 'Ω√Ωø10', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user11', '1234', 'Ω√Ωø11', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user12', '1234', 'Ω√Ωø12', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user13', '1234', 'Ω√Ωø13', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user14', '1234', 'Ω√Ωø14', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user15', '1234', 'Ω√Ωø15', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user16', '1234', 'Ω√Ωø16', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user17', '1234', 'Ω√Ωø17', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user18', '1234', 'Ω√Ωø18', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user19', '1234', 'Ω√Ωø19', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user20', '1234', 'Ω√Ωø20', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user21', '1234', 'Ω√Ωø21', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user22', '1234', 'Ω√Ωø22', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user23', '1234', 'Ω√Ωø23', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user24', '1234', 'Ω√Ωø24', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user25', '1234', 'Ω√Ωø25', 20, sysdate);
INSERT INTO MEMBER VALUES(MEMBER_SEQ.NEXTVAL, 'user26', '1234', 'Ω√Ωø26', 20, sysdate);
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
insert into board values (board_seq.nextval, 'Ω√Ωø', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user01', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ωø?', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user02', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ω√Ωø', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user03', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ωø!!', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user04', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ω√Ω√Ω√Ωø', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user05', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√¿Ã¿Ã¿ÃΩø', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user06', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ωø22', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user07', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ωø@!!', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user08', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√ΩøΩ√ΩøΩ√Ωø', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user09', default, sysdate);
insert into board values (board_seq.nextval, 'Ω√Ωø!!', 'Ω√Ω√Ω√Ω√Ω√Ωø', 'user10', default, sysdate);