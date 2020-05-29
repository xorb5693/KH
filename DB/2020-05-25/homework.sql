
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
    BOARD_TYPE      NUMBER          NOT NULL
);

CREATE SEQUENCE BOARD_SEQ;
