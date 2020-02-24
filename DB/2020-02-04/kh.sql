--select * from EMPLOYEE;
select EMP_NAME, EMP_NO, PHONE, EMAIL from EMPLOYEE where dept_code = 'D5' ORDER by EMP_NAME DESC;

--1. JOB 테이블 중 JOB_NAME 정보만 출력
select job_name from job;
select * from job;
select * from EMPLOYEE;

--2. DEPARTMENT 테이블의 모든 정보 출력
select * from DEPARTMENT;
select * from NATIONAL;
select * from LOCATION;
select * from SAL_GRADE;

select EMPLOYEE.EMP_NAME, EMPLOYEE.EMP_NO, EMPLOYEE.PHONE, JOB.JOB_NAME from EMPLOYEE, JOB where EMPLOYEE.JOB_CODE = JOB.JOB_CODE;
select emp_id, emp_name, phone, min_sal, max_sal from employee, SAL_GRADE where employee.sal_level = sal_grade.sal_level order by emp_name;

--3. EMPLOYEE 테이블에서 이름(EMP_NAME), 이메일(EMAIL), 전화번호(PHONE), 고용일(HIRE_DATE)만 출력
select EMP_NAME, EMAIL, PHONE, HIRE_DATE from EMPLOYEE;

--4. EMPLOYEE 테이블에서 월급이 200만원 이상인 사람의 이름(EMP_NAME)과 급여(SALARY) 출력
select EMP_NAME, SALARY from EMPLOYEE where SALARY >= 2000000;
select emp_name, salary, (salary * 12) as income from EMPLOYEE;

--NVL(컬럼, NULL일 경우 반환값)으로 NULL처리
select emp_name as 이름, salary as 월급, (salary + salary * NVL(Bonus, 0)) * 12 as "연봉(원)" from EMPLOYEE;

--리터럴
select emp_name, salary, '원' as 단위 from EMPLOYEE;

select sysdate from dual;
SELECT SYSDATE - 1 FROM DUAL;
SELECT SYSDATE + 1 FROM DUAL;
SELECT (SYSDATE + 1) - SYSDATE FROM DUAL;

--1. EMPLOYEE 테이블에서 이름,연봉, 총수령액(보너스포함), 실수령액(총 수령액-(월급*세금 3%))가 출력되도록 하시오.
SELECT 
EMP_NAME, (SALARY * 12) AS "연봉(원)", (SALARY + NVL(BONUS, 0) * 12) AS "총수령액(원)", 
((SALARY + NVL(BONUS, 0) * 12)  - (SALARY * 0.03 * 12)) AS "실수령액(원)" FROM EMPLOYEE;

--2. EMPLOYEE 테이블에서 이름, 근무 일수를 출력해보시오 (SYSDATE를 사용하면 현재 시간 출력)
SELECT EMP_NAME, FLOOR(SYSDATE - HIRE_DATE) AS "근무 일수" FROM EMPLOYEE;

--3. EMPLOYEE 테이블에서 20년 이상 근속자의 이름,월급,보너스율를 출력하시오
SELECT EMP_NAME, SALARY, BONUS FROM EMPLOYEE WHERE (SYSDATE - HIRE_DATE) >= 365 * 20;

SELECT DISTINCT JOB_CODE FROM EMPLOYEE;

--연결 연산자
SELECT EMP_ID||' '||EMP_NAME AS NAME FROM EMPLOYEE;
SELECT SALARY||'원' FROM EMPLOYEE;

--논리 연산자
SELECT EMP_NAME, DEPT_CODE, SALARY FROM EMPLOYEE
WHERE DEPT_CODE = 'D6' AND SALARY >= 3000000;

--비교 연산자(BETWEEN AND)
SELECT EMP_NAME, SALARY FROM EMPLOYEE
--WHERE SALARY >= 3500000 AND SALARY <= 6000000;
WHERE SALARY BETWEEN 3500000 AND 6000000;

--비교 연산자(LIKE)
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_NAME LIKE '전%';
SELECT EMP_NAME FROM EMPLOYEE WHERE EMP_NAME LIKE '전__';

SELECT EMP_NAME, EMAIL FROM EMPLOYEE;
--이메일 주소 중 _ 앞에 3글자인 이메일 주소 출력
SELECT EMP_NAME, EMAIL FROM EMPLOYEE
WHERE EMAIL LIKE'___#_%' ESCAPE '#';
--이메일 주소 중 _ 앞에 3글자가 아닌 이메일 주소 출력
SELECT EMP_NAME, EMAIL FROM EMPLOYEE
WHERE EMAIL LIKE'___#_%' ESCAPE '#';

--보너스를 받지 않는 직원의 이름과 급여 조회
SELECT EMP_NAME, SALARY FROM EMPLOYEE
WHERE BONUS IS NULL;

SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
--WHERE DEPT_CODE = 'D6' OR DEPT_CODE = 'D9' OR DEPT_CODE = 'D1';
WHERE DEPT_CODE IN ('D6', 'D9', 'D1') ORDER BY EMP_NAME;

SELECT * FROM EMPLOYEE
--ORDER BY EMP_NAME DESC
;

SELECT EMP_NAME, EMAIL, DEPT_CODE, SALARY 급여, SALARY * 12 연봉
FROM EMPLOYEE ORDER BY 1;

-- 문제1. 
-- 입사일이 5년 이상, 10년 이하인 직원의 이름,주민번호,급여,입사일을 검색하여라
SELECT EMP_NAME, EMP_NO, SALARY, HIRE_DATE FROM EMPLOYEE
WHERE (SYSDATE - HIRE_DATE) / 365 BETWEEN 5 AND 10;

-- 문제2.
-- 재직중이 아닌 직원의 이름,부서코드를 검색하여라 (퇴사 여부 : ENT_YN)
SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
WHERE ENT_YN NOT IN('N');

-- 문제3.
-- 근속년수가 10년 이상인 직원들을 검색하여
-- 출력 결과는 이름,급여,근속년수를 근속년수가 오름차순으로 정렬하여 출력하여라
-- 단, 급여는 50% 인상된 급여로 출력되도록 하여라.
SELECT EMP_NAME, SALARY * 1.5 AS SALARY, FLOOR((SYSDATE - HIRE_DATE) / 365) AS "근속년수" FROM EMPLOYEE
WHERE FLOOR((SYSDATE - HIRE_DATE) / 365) >= 10 ORDER BY "근속년수";

-- 문제4.
-- 입사일이 99/01/01 ~ 10/01/01 인 사람 중에서 급여가 2000000 원 이하인 사람의
-- 이름,주민번호,이메일,폰번호,급여를 검색 하시오
-- 문제5.
-- 급여가 2000000원 ~ 3000000원 인 여직원 중에서 4월 생일자를 검색하여 
-- 이름,주민번호,급여,부서코드를 주민번호 순으로(내림차순) 출력하여라
-- 문제6.
-- 남자 사원 중 보너스가 없는 사원의 오늘까지 근무일을 측정하여 
-- 1000일 마다(소수점 제외) 
-- 급여의 10% 보너스를 계산하여 이름,특별 보너스 (계산 금액) 결과를 출력하여라.
-- 단, 이름 순으로 오름 차순 정렬하여 출력하여라.