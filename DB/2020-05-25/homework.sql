
CREATE TABLE MEMBER(
    MEMBER_NO NUMBER PRIMARY KEY,
    MEMBER_ID VARCHAR2(20) UNIQUE,
    MEMBER_PW VARCHAR2(20) NOT NULL,
    MEMBER_NAME VARCHAR2(20),
    AGE NUMBER,
    ENROLL_DATE VARCHAR2(20),
    COMPANY_CODE NUMBER REFERENCES COMPANY(COMPANY_CODE)
);

ALTER TABLE MEMBER
ADD (MEMBER_LEVEL NUMBER);
ALTER TABLE MEMBER
ADD (phone varchar2(13));
CREATE SEQUENCE MEMBER_SEQ;
ALTER TABLE MEMBER
MODIFY MEMBER_ID VARCHAR2(100);
ALTER TABLE MEMBER
MODIFY MEMBER_PW VARCHAR2(100);

CREATE TABLE COMPANY(
    COMPANY_CODE NUMBER PRIMARY KEY,
    COMPANY_NAME VARCHAR2(100) NOT NULL,
    CoMPANY_LOGO VARCHAR2(1000)
);

CREATE SEQUENCE COMPANY_SEQ;
select company_code as companyCode, company_name as companyName, company_logo as companyLogo from company;
insert into COMPANY values(company_seq.nextval, 'KH', 'kh.png');
insert into COMPANY values(company_seq.nextval, 'Amazon', 'amazon.png');
insert into COMPANY values(company_seq.nextval, 'Apple', 'apple.png');
insert into COMPANY values(company_seq.nextval, 'Google', 'google.png');
commit;
select
			member_no as memberNo,
			member_id as memberId,
			member_name as memberName,
			age,
			enroll_date as enrollDate,
			company_code as companyCode,
			member_level as memberLevel,
			phone
		from member
		where member_id = 'user01@gmail.com';
select * from COMPANY;
select * from member;
UPDATE MEMBER SET MEMBER_LEVEL = 1;

CREATE TABLE BOARD(
    BOARD_NO        NUMBER          PRIMARY KEY,
    BOARD_TITLE     VARCHAR2(1000)  NOT NULL,
    BOARD_CONTENT   VARCHAR2(3000)  NOT NULL,
    BOARD_WRITER    VARCHAR2(20)    NOT NULL
    REFERENCES  MEMBER(MEMBER_ID),
    READ_COUNT      NUMBER DEFAULT  0,
    WRITE_DATE      VARCHAR2(20),
    FILE_NAME       VARCHAR2(1000),
    FILE_PATH       VARCHAR2(1000),
    BOARD_TYPE      NUMBER          NOT NULL,
    COMPANY_CODE    NUMBER          REFERENCES COMPANY(COMPANY_CODE)
);
ALTER TABLE BOARD
MODIFY BOARD_WRITER VARCHAR2(100);

INSERT INTO BOARD VALUES(BOARD_SEQ.NEXTVAL, '테스트중', '지금 이것은 테스트용 문서입니다.', 'user02@gmail.com', 0, sysdate, null, null, 2, 1);
commit;

CREATE SEQUENCE BOARD_SEQ;

select * from (
			select rownum as rnum, s.*
			from (
				select
					board_no as boardNo,
					board_title as boardTitle,
					board_content as boardContent,
					member_name as boardWriter,
					read_count as readCount,
					write_date as writeDate,
					file_name as fileName,
					file_path as filePath,
					board_type as boardType,
					b.company_code as companyCode
				from board b
				join member m on (member_id = board_writer)
				where board_type = 2
			) s
		) where rnum between 1 and 5;