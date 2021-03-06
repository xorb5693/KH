
SELECT * FROM USER_TABLES;
SELECT * FROM USER_VIEWS;
SELECT * FROM USER_SEQUENCES;
SELECT * FROM USER_TRIGGERS;
SELECT * FROM USER_CONS_COLUMNS;
SELECT * FROM USER_CONS_COLUMNS WHERE TABLE_NAME = 'EMPLOYEE';
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'EMPLOYEE';
SELECT * FROM USER_COL_COMMENTS;
DESC EMPLOYEE;

CREATE TABLE COPY_TEST
AS
SELECT * FROM EMPLOYEE WHERE 1 = 0;

CREATE TABLE COPY_JOB
AS
SELECT * FROM JOB WHERE 1 = 0;

DESC COPY_TEST;
DESC COPY_JOB;

ALTER TABLE COPY_TEST
DROP COLUMN HIRE_DATE;

ALTER TABLE COPY_JOB
ADD CONSTRAINT UNIQUE_CONS UNIQUE(JOB_CODE);

SELECT * FROM USER_CONSTRAINTS UC
JOIN USER_CONS_COLUMNS UCC USING(CONSTRAINT_NAME)
WHERE UC.TABLE_NAME = 'COPY_TEST';

ALTER TABLE COPY_TEST
MODIFY SAL_LEVEL NULL;

ALTER TABLE COPY_TEST
MODIFY SAL_LEVEL CONSTRAINT NOT_NULL_TEST NOT NULL;

ALTER TABLE COPY_TEST
ADD CONSTRAINT PRIMARY_TEST PRIMARY KEY(EMP_ID);

ALTER TABLE COPY_TEST
ADD CONSTRAINT FOREIGN_TEST FOREIGN KEY(JOB_CODE) REFERENCES COPY_JOB(JOB_CODE) ON DELETE CASCADE;

ALTER TABLE COPY_TEST
DISABLE CONSTRAINT FOREIGN_TEST CASCADE;

ALTER TABLE COPY_TEST
ENABLE CONSTRAINT FOREIGN_TEST;

INSERT INTO COPY_JOB VALUES('J1', '1');

SELECT * FROM COPY_JOB;
SELECT * FROM COPY_TEST;

INSERT INTO COPY_TEST VALUES(
    1, 'J1');
    
DELETE FROM COPY_JOB;


