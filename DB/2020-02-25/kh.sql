
--LENGTH 함수
SELECT EMP_NAME, LENGTH(EMP_NAME) AS 이름길이, EMAIL, LENGTH(EMAIL) AS 이메일길이 FROM EMPLOYEE;
SELECT EMP_NAME, LENGTHB(EMP_NAME) AS 이름크기, EMAIL, LENGTHB(EMAIL) AS 이메일크기 FROM EMPLOYEE;

--INSTR 함수
SELECT INSTR('Hello World Hi High', 'H', 1, 1) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', 1, 2) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', 1, 3) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', -1, 1) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', -1, 2) FROM DUAL;
SELECT INSTR('Hello World Hi High', 'H', 2, 1) FROM DUAL;

--실습
--EMAIL 컬럼 중에서 @문자 위치를 구하시오.
SELECT INSTR(EMAIL, '@', 1, 1) FROM EMPLOYEE;

--LPAD/RPAD
SELECT LPAD(EMAIL, 20, '#') FROM EMPLOYEE;
SELECT LPAD(EMAIL, 10, '#') FROM EMPLOYEE;
SELECT RPAD(EMAIL, 20, '#') FROM EMPLOYEE;
SELECT RPAD(EMAIL, 10, '#') FROM EMPLOYEE;

--LTRIM/RTRIM
SELECT '   KH   ' FROM DUAL;
SELECT LTRIM('   KH   ', ' ')FROM DUAL;
SELECT LTRIM('00012034560', '0') FROM DUAL;
SELECT LTRIM('ACABACCKH', 'ABC') FROM DUAL;
SELECT LTRIM('568543545943216549870KH', '0123456789') FROM DUAL;
SELECT RTRIM('568543545943216549870KH', '0123456789') FROM DUAL;
SELECT LTRIM(RTRIM('568543545943216549870KH12125514256542184251413', '0123456789'), '0123456789') FROM DUAL;

--TRIM
SELECT TRIM('Z' FROM 'ZZZZKZHZZZ') FROM DUAL;
SELECT TRIM(BOTH 'Z' FROM 'ZZZZKZHZZZ') FROM DUAL;
SELECT TRIM(LEADING 'Z' FROM 'ZZZZKZHZZZ') FROM DUAL;
SELECT TRIM(TRAILING 'Z' FROM 'ZZZZKZHZZZ') FROM DUAL;

-- 실습 문제 1
-- Hello KH Java 문자열을 Hello KH 가 출력되게 하여라.
SELECT RTRIM('Hello KH Java', 'Java ') FROM DUAL;
SELECT TRIM(TRAILING 'Java' FROM 'Hello KH Java') FROM DUAL;

-- 실습 문제 2
-- Hello KH Java 문자열을 KH Java 가 출력되게 하여라.
SELECT LTRIM('Hello KH Java', 'Hello ') FROM DUAL;

-- 실습 문제 3 (TRIM으로 해보세요)
-- DEPARTMENT 테이블에서 DEPT_TITLE을 출력하여라
-- 이때, 마지막 부 글자를 빼고 출력되도록 하여라 / ex)회계관리부 -> 회계관리
SELECT * FROM DEPARTMENT;
SELECT TRIM(TRAILING '부' FROM DEPT_TITLE) FROM DEPARTMENT;

-- 실습 문제 4
-- 다음문자열에서 앞뒤 모든 숫자를 제거하세요.
-- '982341678934509hello89798739273402'
SELECT RTRIM(LTRIM('982341678934509hello89798739273402', '0123456789'), '0123456789') FROM DUAL;

--SUBSTR
SELECT 'SHOWMETHEMONEY' FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY', 5, 2) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY', 5) FROM DUAL;
SELECT SUBSTR('SHOWMETHEMONEY', -8, 3) FROM DUAL;

-- 1. 사원명에서 성만 중복없이 사전순으로 출력하세요.
SELECT * FROM EMPLOYEE;
SELECT DISTINCT SUBSTR(EMP_NAME, 1, 1) AS "성" FROM EMPLOYEE ORDER BY 1;

-- 2. EMPLOYEE 테이블에서 남자만
-- 사원번호, 사원명, 주민번호, 연봉을 나타내세요.
-- 주민번호의 뒷 6자리는 *처리하세요.
SELECT EMP_ID, EMP_NAME, RPAD(SUBSTR(EMP_NO, 1, 8), 14, '*') AS 주민번호, SALARY FROM EMPLOYEE WHERE EMP_NO LIKE '%-1%' OR EMP_NO LIKE '%-3%';
--리터럴을 이용해 뒷 6자리에 *처리를 한다.
SELECT EMP_ID, EMP_NAME, SUBSTR(EMP_NO, 1, 8)||'******' AS 주민번호, SALARY FROM EMPLOYEE WHERE EMP_NO LIKE '%-1%' OR EMP_NO LIKE '%-3%';

--LOWER/UPPER/INITCAP
SELECT LOWER('Welcome To My World') FROM DUAL;
SELECT UPPER('Welcome To My World') FROM DUAL;
SELECT INITCAP('welcome to my world') FROM DUAL;

--CONCAT
SELECT CONCAT('ABCD', '가나다라') FROM DUAL;

--REPLACE
SELECT REPLACE('ABCDEFG', 'DEF', '한글') FROM DUAL;

--EMPLOYEE 테이블의 모든 직원의 이름, 주민번호, EMAIL을 출력하시오
--단, 출력시 EMAIL은 kh.or.kr에서 iei.or.kr
--로 변경하여 출력되게 하시오
--ex) sum_di@kh.or.kr -> sum_di@iei.or.kr
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, EMP_NO, REPLACE(EMAIL, 'kh.or.kr', 'iei.or.kr') AS EMAIL FROM EMPLOYEE;

--ABS
SELECT ABS(10) FROM DUAL;
SELECT ABS(-10) FROM DUAL;

--MOD
SELECT MOD(10, 2) FROM DUAL; --나머지 0
SELECT MOD(10, 3) FROM DUAL; --나머지 1
SELECT MOD(10, 4) FROM DUAL; --나머지 2

--ROUND
SELECT ROUND(126.456) FROM DUAL;
SELECT ROUND(126.456, 2) FROM DUAL;
SELECT ROUND(126.456, 0) FROM DUAL;
SELECT ROUND(126.456, -2) FROM DUAL;

--FLOOR
SELECT FLOOR(126.55) FROM DUAL;

--CEIL
SELECT CEIL(126.11) FROM DUAL;

--SYSDATE
SELECT SYSDATE FROM DUAL;
SELECT SYSDATE, CURRENT_DATE, LOCALTIMESTAMP, CURRENT_TIMESTAMP FROM DUAL;

--MONTHS_BETWEEN
SELECT EMP_NAME, FLOOR(MONTHS_BETWEEN(SYSDATE, HIRE_DATE)) AS "DATE" FROM EMPLOYEE;
DESC EMPLOYEE;

--ADD_MONTHS
SELECT EMP_NAME, ADD_MONTHS(HIRE_DATE, 3) FROM EMPLOYEE;

/*실습
동건씨가 오늘 다시 입대
복무기간은 1년 6개월
1. 입대 날짜
2. 전역하는 날짜
3. 먹어야 하는 짬밥 수(하루 3끼)
DUAL 테이블 이용해서 출력
*/
SELECT SYSDATE AS "입대일", ADD_MONTHS(SYSDATE, 18) AS "전역일", (ADD_MONTHS(SYSDATE, 18) - SYSDATE) * 3 AS "짬밥 수" FROM DUAL;

--NEXT_DAY : 입력받은 다음 요일을 출력한다.
SELECT SYSDATE, NEXT_DAY(SYSDATE, '월요일') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '화요일') FROM DUAL;
SELECT SYSDATE, NEXT_DAY(SYSDATE, '월') FROM DUAL;
--1 : 일요일, 2 : 월요일, ... 7 : 토요일
SELECT SYSDATE, NEXT_DAY(SYSDATE, 2) FROM DUAL;

--LAST_DAY : 입력받은 날짜의 월에 해당하는 마지막 일을 출력한다.
SELECT SYSDATE, LAST_DAY(SYSDATE + 10) FROM DUAL;

--EXTRACT
SELECT EXTRACT(YEAR FROM SYSDATE), EXTRACT(MONTH FROM SYSDATE), EXTRACT(DAY FROM SYSDATE) FROM DUAL;

/*실습문제 1
EMPLOYEE 테이블에서 사원의 이름, 입사일, 년차를 출력하여라.
단, 입사일은 YYYY년M월D일로 출력하도록 하여라.
년차 출력은 소수점일경우 올림으로 하여 출력하여라.
(28.144 -> 29년차)
출력시 정렬은 입사일 기준으로 오름차순
*/
SELECT * FROM EMPLOYEE;
SELECT 
    EMP_NAME, 
    EXTRACT(YEAR FROM HIRE_DATE)||'년'||EXTRACT(MONTH FROM HIRE_DATE)||'월'||EXTRACT(DAY FROM HIRE_DATE)||'일' AS "입사일", 
    CEIL(MONTHS_BETWEEN(SYSDATE, HIRE_DATE) / 12) AS "입사년차" 
FROM EMPLOYEE ORDER BY 2;

--TO_CHAR
SELECT TO_CHAR(SYSDATE, 'YYYY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY-MM-DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD/DAY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD/DY') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD AMHH"시"MI"분"SS"초"') AS "TIME" FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'YY/MM/DD HH24"시"MI"분"SS"초"') AS "TIME" FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'FMYYYY/MM/DD HH24"시"MI"분"SS"초"') AS "TIME" FROM DUAL;
SELECT 
    TO_CHAR(5000000, '999,999,999'),
    TO_CHAR(5000000, '000,000,000'),
    TO_CHAR(5000000, '999,999'),
    --자리수가 모자라면 정상적인 숫자가 출력이 안된다.
    TO_CHAR(5000000, '$999,999,999'),
    TO_CHAR(5000000, 'L999,999,999')
FROM DUAL;

--TO_DATE
SELECT TO_DATE(20000101, 'YYYYMMDD') FROM DUAL;
SELECT TO_CHAR(TO_DATE(20000101100231, 'YYYYMMDDHHMISS'), 'YYYY/MM/DD HH24:MI:SS') FROM DUAL;

--EMPLOYEE 테이블에서 2000년도 이후에 입사한 사원의 이름과 입사일을 출력
SELECT EMP_NAME, HIRE_DATE FROM EMPLOYEE WHERE TO_CHAR(HIRE_DATE, 'YYYY') >= 2000;
SELECT EMP_NAME, HIRE_DATE FROM EMPLOYEE WHERE TO_DATE(20000101, 'YYYYMMDD') <= HIRE_DATE;

--TO_NUMBER
SELECT TO_NUMBER('5,000,000', '9,999,999') FROM DUAL;
SELECT TO_NUMBER('123A') FROM DUAL; --에러
SELECT '1000' + '100' FROM DUAL;

--NVL
SELECT NVL(BONUS, 0) AS "BONUS" FROM EMPLOYEE;
SELECT EMP_NAME, (SALARY + (SALARY * NVL(BONUS, 0))) * 12 FROM EMPLOYEE;

--DECODE 선택함수
--여러가지 경우에 선택할 수 있는 기능을 제공
SELECT EMP_NAME, EMP_NO, DECODE(SUBSTR(EMP_NO, 8, 1), '1', '남자', '2', '여자') AS "성별" FROM EMPLOYEE;

--CASE 선택함수
--여러가지 경우에 선택할 수 있는 기능을 제공(범위 값 가능)
SELECT EMP_NAME, EMP_NO,
    CASE WHEN SUBSTR(EMP_NO, 8, 1) = 1 THEN '남자'
    WHEN SUBSTR(EMP_NO, 8, 1) = 2 THEN '여자'
    ELSE '미성년자' END AS 성별
FROM EMPLOYEE;

SELECT EMP_NAME, EMP_NO,
    CASE 
        WHEN SUBSTR(EMP_NO, 1, 2) < 65 THEN '60년대 초반'
        WHEN SUBSTR(EMP_NO, 1, 2) >= 65 THEN '60년대 후반'
    END AS 나이
FROM EMPLOYEE WHERE SUBSTR(EMP_NO, 1, 2) BETWEEN 60 AND 69;

--SUM
SELECT SUM(SALARY) FROM EMPLOYEE WHERE SUBSTR(EMP_NO, 8, 1) = 1 AND DEPT_CODE = 'D5';

--AVG
SELECT ROUND(AVG(NVL(BONUS, 0)), 2) FROM EMPLOYEE;

--COUNT
SELECT COUNT(*) FROM EMPLOYEE;
SELECT COUNT(BONUS) FROM EMPLOYEE;
SELECT COUNT(NVL(BONUS, 0)) FROM EMPLOYEE;

--MAX, MIN
SELECT MAX(SALARY), MIN(SALARY) FROM EMPLOYEE;
SELECT MAX(HIRE_DATE), MIN(HIRE_DATE) FROM EMPLOYEE;

SELECT EMP_NAME, COUNT(BONUS) FROM EMPLOYEE;

--1. 직원명과 이메일 , 이메일 길이를 출력하시오.
SELECT EMP_NAME, EMAIL, LENGTH(EMAIL) AS 길이 FROM EMPLOYEE;

--2. 직원의 이름과 이메일 주소중 아이디 부분만 출력하시오.
SELECT EMP_NAME, SUBSTR(EMAIL, 1, INSTR(EMAIL, '@') - 1) AS "이메일 아이디" FROM EMPLOYEE;

--3. 60년대생의 직원명과 년생, 보너스 값을 출력하시오. 그때 보너스 값이 null인 경우에는 0 이라고 출력 되게 만드시오.
SELECT SUBSTR(EMP_NO, 1, 2) FROM EMPLOYEE ORDER BY 1;
SELECT EMP_NAME, SUBSTR(EMP_NO, 1, 2) AS 년생, NVL(BONUS, 0) AS 보너스 FROM EMPLOYEE
WHERE SUBSTR(EMP_NO, 1, 2) BETWEEN 60 AND 69;

--4. '010' 핸드폰 번호를 쓰지 않는 사람의 수를 출력하시오 (뒤에 단위는 명을 붙이시오)
SELECT COUNT(*)||'명' FROM EMPLOYEE
WHERE SUBSTR(PHONE, 1, 3) != '010';

----5. 직원명과 입사년월을 출력하시오. 단, 아래와 같이 출력되도록 만들어 보시오
--	    직원명		입사년월
--	ex) 전형돈		2012년12월
--	ex) 전지연		1997년 3월
SELECT EMP_NAME AS 직원명, 
EXTRACT(YEAR FROM HIRE_DATE)||'년'
||LPAD(EXTRACT(MONTH FROM HIRE_DATE), 2, ' ')||'월' AS 입사년월
FROM EMPLOYEE;

--6. 직원명과 주민번호를 조회하시오
--	단, 주민번호 9번째 자리부터 끝까지는 '*' 문자로 채워서출력 하시오.
--	ex) 홍길동 771120-1******
SELECT EMP_NAME AS 직원명, SUBSTR(EMP_NO, 1, 8)||'******' AS 주민번호
FROM EMPLOYEE;

--7. 직원명, 직급코드, 연봉(원) 조회하시오.
--  단, 연봉은 ￦57,000,000 으로 표시되게 함
--     연봉은 보너스포인트가 적용된 1년치 급여임
SELECT EMP_NAME, JOB_CODE, 
    TO_CHAR(((SALARY + SALARY * NVL(BONUS, 0)) * 12), 'L999,999,999') AS 연봉
FROM EMPLOYEE;

--8. 부서코드가 D5, D9인 직원들 중에서 2004년도에 입사한 직원의 사번 사원명 부서코드 입사일을 출력하시오.
SELECT EMP_NAME, HIRE_DATE FROM EMPLOYEE;
SELECT EMP_ID, EMP_NAME, DEPT_CODE FROM EMPLOYEE
WHERE DEPT_CODE IN('D5', 'D9') AND SUBSTR(HIRE_DATE, 1, 2) = '04';

--9. 직원명, 입사일, 오늘까지의 근무일수 조회 
--	* 주말도 포함 , 소수점 아래는 버림
SELECT EMP_NAME, HIRE_DATE, FLOOR(SYSDATE - HIRE_DATE)||'일' AS "근무일수" FROM EMPLOYEE;

--10. 모든 직원의 나이 중 가장 많은 나이와 가장 적은 나이를 출력 하여라. (나이만 출력)
SELECT * FROM EMPLOYEE;
SELECT TO_DATE(SUBSTR(EMP_NO, 1, 2), 'YYYY') FROM EMPLOYEE;
SELECT MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||SUBSTR(EMP_NO, 1, 2), 'YYYY')) FROM EMPLOYEE;

--나이 계산은 다음과 같은 순서대로 진행한다.
--1. 주민등록번호에서 가장 앞자리 2개를 SUBSTR 함수를 이용해 빼온다.
--2. 빼온 2자리의 CHARACTER 타입의 숫자 앞에 리터럴을 이용해 19를 붙인다.
--3. 합쳐진 CHARACTER 타입의 문자를 DATE 타입으로 변환한다.
--4. DATE 타입으로 변환한 년도와 컴퓨터 시간 사이에서 몇개월의 차이가 나는지 구한다.
--5. 구한 값을 12로 나눈 다음 CEIL 함수로 올림을 한다.
SELECT 
MAX(CEIL(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||SUBSTR(EMP_NO, 1, 2), 'YYYY')) / 12)) AS "최대 나이",
MIN(CEIL(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||SUBSTR(EMP_NO, 1, 2), 'YYYY')) / 12)) AS "최소 나이"
FROM EMPLOYEE;

--11.  회사에서 야근을 해야 되는 부서를 발표하여야 한다.
-- 부서코드가 D5,D6,D9  야근, 그외는 야근없음 으로 출력되도록 하여라. 
-- 출력 값은 이름,부서코드,야근유무 (부서코드 기준 오름차순 정렬함.)
--   (부서코드가 null인 사람도 야근없음 임)
SELECT EMP_NAME, DEPT_CODE,
    CASE 
        WHEN DEPT_CODE IN('D5', 'D6', 'D9') THEN '야근'
        ELSE '야근없음' END AS "야근 유무"
FROM EMPLOYEE
ORDER BY DEPT_CODE;

--12. 직원명, 부서코드, 생년월일, 나이 조회
--   단, 생년월일은 주민번호에서 추출해서, 
--   ㅇㅇ년 ㅇㅇ월 ㅇㅇ일로 출력되게 함.
--   나이는 주민번호에서 추출해서 날짜데이터로 변환한 다음, 계산함
--	* 주민번호가 이상한 사람들은 제외시키고 진행 하도록(200,201,214 번 제외)
--	* HINT : NOT IN 사용
SELECT * FROM EMPLOYEE;
SELECT EMP_NAME, DEPT_CODE,
    SUBSTR(EMP_NO, 1, 2)||'년 '|| SUBSTR(EMP_NO, 3, 2)||'월 '||
    SUBSTR(EMP_NO, 5, 2)||'일' AS "생년월일",
    CEIL(MONTHS_BETWEEN(SYSDATE, TO_DATE('19'||TO_DATE(SUBSTR(EMP_NO, 1, 2), 'YYYY'))) / 12) AS "나이"
FROM EMPLOYEE
WHERE EMP_ID NOT IN(200, 201, 214);

--13. 직원들의 입사일로 부터 년도만 가지고, 각 년도별 입사인원수를 구하시오.
--  아래의 년도에 입사한 인원수를 조회하시오. 마지막으로 전체직원수도 구하시오
--  => to_char, decode, sum 사용
--	-------------------------------------------------------------------------
--	 1998년   1999년   2000년   2001년   2002년   2003년   2004년  전체직원수
--	-------------------------------------------------------------------------
SELECT TO_CHAR(HIRE_DATE, 'YYYY') FROM EMPLOYEE ORDER BY 1;
SELECT 
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '1998', 1)), 0) AS "1998년",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '1999', 1)), 0) AS "1999년",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2000', 1)), 0) AS "2000년",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2001', 1)), 0) AS "2001년",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2002', 1)), 0) AS "2002년",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2003', 1)), 0) AS "2003년",
    NVL(SUM(DECODE(TO_CHAR(HIRE_DATE, 'YYYY'), '2004', 1)), 0) AS "2004년",
    COUNT(*) AS "전체직원수"
FROM EMPLOYEE;

--14.  부서코드가 D5이면 총무부, D6이면 기획부, D9이면 영업부로 처리하시오.
--   단, 부서코드가 D5, D6, D9 인 직원의 정보만 조회함
--  => case 사용  부서코드 기준 오름차순 정렬함.
SELECT EMP_NAME,
    CASE 
        WHEN DEPT_CODE = 'D5' THEN '총무부'
        WHEN DEPT_CODE = 'D6' THEN '기획부'
        WHEN DEPT_CODE = 'D9' THEN '영업부'
    END AS "부서"
FROM EMPLOYEE
WHERE DEPT_CODE IN('D5', 'D6', 'D9') ORDER BY DEPT_CODE;

SELECT * FROM EMPLOYEE;
SELECT * FROM DEPARTMENT;

SELECT EMP_NAME, DEPT_TITLE FROM EMPLOYEE, DEPARTMENT
WHERE
    DEPT_CODE IN('D5', 'D6', 'D9') AND
    DEPT_CODE = DEPT_ID
ORDER BY DEPT_CODE;
    