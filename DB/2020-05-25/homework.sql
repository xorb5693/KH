
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
    CAMPANY_LOGO VARCHAR2(1000)
);

CREATE SEQUENCE COMPANY_SEQ;

insert into COMPANY values(company_seq.nextval, 'KH', 'kh.png');
insert into COMPANY values(company_seq.nextval, 'Amazon', 'amazon.png');
insert into COMPANY values(company_seq.nextval, 'Apple', 'apple.png');
insert into COMPANY values(company_seq.nextval, 'Google', 'google.png');
commit;

select * from COMPANY;
select * from member;
UPDATE MEMBER SET MEMBER_LEVEL = 1;
