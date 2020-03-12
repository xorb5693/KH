# DB

## 1. 개요
- 이 폴더는 KH 정보교육 SQL 파일들을 모아놓기 위한 폴더입니다.

## 2. 목록
- 20일차(2020-02-24)
  - admin.sql : kh 계정 생성
  - KH_Study.sql : 테스트용 INSERT 데이터
  - kh.sql : 각종 SELECT문 테스트
    1. SELECT 기초
    2. 리터럴
    3. ||을 이용한 연결 연산자
    4. 논리 연산자
    5. 비교 연산자 BETWEEN AND
    6. 비교 연산자 LIKE
    7. 비교 연산자 IS NULL/IS NOT NULL
    8. 비교 연산자 IN/NOT IT
    9. ORDER BY 정렬
    10. 실습문제

- 21일차(2020-02-25)
  - kh.sql : 각종 함수 테스트
    1. LENGTH 함수
    2. LENGTHB 함수
    3. INSTR 함수
    4. LPAD/RPAD
    5. LTRIM/RTRIM
    6. TRIM
    7. SUBSTR
    8. LOWER/UPPER/INITCAP
    9. CONCAT
    10. REPLACE
    11. ABS
    12. MOD
    13. ROUND
    14. FLOOR
    15. CEIL
    16. SYSDATE
    17. MONTHS_BETWEEN
    18. ADD_MONTHS
    19. NEXT_DAY
    20. LAST_DAY
    21. TO_CHAR
    22. TO_DATE
    23. TO_NUMBER
    24. NVL
    25. DECODE
    26. CASE
    27. SUM
    28. AVG
    29. COUNT
    30. MAX, MIN

- 22일차(2020-03-09)
  - kh.sql : GROUP BY, JOIN 테스트
    1. GROUP BY, HAVING
    2. JOIN
    3. SET OPERATOR
    4. 단일행 서브쿼리
    5. 다중행 서브쿼리
    6. 다중열 서브쿼리

- 23일차(2020-03-10)
  - kh.sql : 22일차 연속
    1. 다중행 다중열 서브쿼리
    2. 상관쿼리
    3. 스칼라 서브쿼리
    4. ROWNUM
    5. RANK() OVER
    6. DENSE_RANK() OVER
    7. ROW_NUMBER() OVER
  - TEST1.sql : 테이블 생성 테스트
    1. CREATE TABLE
    2. 제약조건
  - admin.sql
    1. 계정 생성
  - ddlexam.sql : CREATE TABLE 연습문제
    1. CREATE TABLE
    2. 제약조건
  - kh.sql : 테이블 복사
    1. AS를 이용한 테이블 복사 생성
- 24일차(2020-03-11)
  - kh.sql : 수정 및 삭제
    1. 컬럼 추가
    2. 컬럼 수정
    3. 제약조건 확인
    4. 제약조건 추가
    5. 컬럼 삭제
    6. 제약조건 삭제
    7. 컬럼 이름 변경
    8. 제약조건 이름 변경
    9. 테이블 이름 변경
    10. 테이블 삭제
  - admin.sql : 계정 삭제
    1. 계정 삭제
  - TEST1.sql : TCL 테스트
    1. ROLLBACK
    2. COMMIT
    3. SAVEPOINT
    4. ROLLBACK TO
- 25일차(2020-03-12)
  - kh.sql : VIEW, SEQUENC 테스트
    1. VIEW 테스트
    2. SEQUENCE 테스트
    3. 비공개 동의어
    4. PL/SQL 테스트
    5. PL/SQL 타입 테스트
    6. PL/SQL 타입 실습
    7. PL/SQL IF문 테스트
  - admin.sql
    1. 뷰 생성 권한 획득
    2. 뷰 SELECT 권한 획득
    3. SYNONYM 생성 권한 획득
    4. 공개 동의어
    5. OBJECT 실습
  - TEST1.sql
    1. 다른 계정에서 뷰 SELECT
    2. 공개 동의어
  - khtest.sql : OBJECT 실습
    1. MEMBER 테이블 생성
    2. BOARD 테이블 생성
    3. SEQUENCE 객체 생성
    4. VIEW 생성
    5. SYNONYM 생성
