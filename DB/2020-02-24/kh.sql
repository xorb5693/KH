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

SELECT emp_name as 이름,salary*12 as 연봉,(salary+(salary*bonus))*12 as "총수령액(보너스+)",
(((salary+bonus)*12)-(salary*0.03*12)) as 실수령액 FROM EMPLOYEE;

select emp_name as 이름,floor(sysdate-HIRE_date) as 근무일수 from EMPLOYEE;--floor 소수점내림제거.

SELECT emp_name 이름,salary 월급,bonus 보너스 from EMPLOYEE where ((sysdate-HIRE_DATE)/365)>=20;

SELECT job_code from EMPLOYEE;--직급코드
SELECT DISTINCT job_code from EMPLOYEE;--중복값을 한번만 나오게 정리.

--연결 연산자
SELECT emp_id||emp_name from EMPLOYEE;
SELECT salary||'원'from EMPLOYEE;

--논리 연산자
SELECT emp_name,dept_code,salary from EMPLOYEE where dept_code ='D6' AND salary>=3000000;

--비교 연산자 : BETWEEN AND
SELECT EMP_NAME, SALARY FROM EMPLOYEE 
WHERE SALARY BETWEEN 3500000 AND 6000000;
--where salary>=3500000 and salary<=6000000 과 동일

--비교 연산자 : LIKE
SELECT emp_name from EMPLOYEE where emp_name like '전%';
--like 뒤에 ''안에 첫글자는 성,시작문자 뒤에는 %(문자열 제한없음)/_(찾는 정보와 동일한 자리를채워야함.)

SELECT emp_name,email from EMPLOYEE;
--이메일주소중  _앞에 3글자인 이메일 주소 출력

SELECT emp_name,email from EMPLOYEE 
where email like '___#_%'ESCAPE '#';
--escape(구분자) 뒤에오는 문자는 와일드카드에서 제외되고 문자열을 뜻함.
SELECT emp_name,email from EMPLOYEE 
where emp_name not Like '이%';
--성이 이씨가 아닌사람들만 출력. 

--비교 연산자 IS NULL/IS NOT NULL
select emp_name, salary  from EMPLOYEE where bonus is null;
--is null 은 null 값과 비교할수있는 비교문 row에 null값이 포함된경우 출력.
select emp_name, salary  from EMPLOYEE where bonus is not null;
--반대로 is not null 은 null값이 아닌경우를 뜻함.

--비교 연산자 IN/NOT IT
select emp_name,dept_code from EMPLOYEE where dept_code ='D6' or dept_code ='D9';
--dept_code 값이 D6,D9인 경우만 출력
select emp_name,dept_code from EMPLOYEE where dept_code in ('D6','D9','D1');
--or을 쓰지않고 간편하게 in을 붙이고 가로로 포함할 dept 코드 입력.

--ORDER BY  1.select한 컬럼에 대해 정렬할때 사용 2.select문 가장 마지막에 작성하며, 실행 순서도 가장 마지막
--정렬방법 ASC:
--NUMBER:작은수->큰수/CHARCTER:사전순(A,B,C)/DATE:빠른날->늦은날 /NULL이 가장 아래로
--정렬방법 DSEC:
--NUMBER:큰수->작은수/CHARCTER:사전역순(C,B,A)/DATE:늦은날->빠른날 /NULL이 가장 위로
SELECT * FROM EMPLOYEE ORDER BY EMP_NAME ASC;--이름 사전순 출력/ASC 를 입력하지않아도 자동으로 ASC방식으로 정렬.
SELECT * FROM EMPLOYEE ORDER BY EMP_NAME DESC;--이름 역사전순 출력
SELECT * FROM EMPLOYEE ORDER BY SALARY DESC;--급여 큰>작은순 출력

SELECT EMP_NAME,EMAIL,DEPT_CODE, SALARY*12 연봉 FROM EMPLOYEE ORDER BY '연봉';
--기본적으로 오름차순 정렬 
SELECT * FROM EMPLOYEE;

-- 문제1. 
-- 입사일이 5년 이상, 10년 이하인 직원의 이름,주민번호,급여,입사일을 검색하여라
SELECT EMP_NAME, EMP_NO, SALARY, HIRE_DATE FROM EMPLOYEE
WHERE FLOOR((SYSDATE - HIRE_DATE) / 365) BETWEEN 5 AND 10;

-- 문제2.
-- 재직중이 아닌 직원의 이름,부서코드를 검색하여라 (퇴사 여부 : ENT_YN)
SELECT EMP_NAME, DEPT_CODE FROM EMPLOYEE
WHERE ENT_YN NOT IN ('N');

-- 문제3.
-- 근속년수가 10년 이상인 직원들을 검색하여
-- 출력 결과는 이름,급여,근속년수를 근속년수가 오름차순으로 정렬하여 출력하여라
-- 단, 급여는 50% 인상된 급여로 출력되도록 하여라.
SELECT EMP_NAME, SALARY * 1.5 AS SALARY, FLOOR((SYSDATE - HIRE_DATE) / 365) AS "근속년수" FROM EMPLOYEE
WHERE FLOOR((SYSDATE - HIRE_DATE) / 365) >= 10 ORDER BY "근속년수";

-- 문제4.
-- 입사일이 99/01/01 ~ 10/01/01 인 사람 중에서 급여가 2000000 원 이하인 사람의
-- 이름,주민번호,이메일,폰번호,급여를 검색 하시오
SELECT EMP_NAME, EMP_NO, EMAIL, PHONE, SALARY FROM EMPLOYEE
WHERE (HIRE_DATE BETWEEN '99/01/01' AND '10/01/01') AND (SALARY <= 2000000);

-- 문제5.
-- 급여가 2000000원 ~ 3000000원 인 여직원 중에서 4월 생일자를 검색하여 
-- 이름,주민번호,급여,부서코드를 주민번호 순으로(내림차순) 출력하여라
SELECT EMP_NAME, EMP_NO, SALARY, DEPT_CODE FROM EMPLOYEE
WHERE (SALARY BETWEEN 2000000 AND 3000000) AND (EMP_NO LIKE '__04__-2%') ORDER BY EMP_NO;

-- 문제6.
-- 남자 사원 중 보너스가 없는 사원의 오늘까지 근무일을 측정하여 
-- 1000일 마다(소수점 제외) 
-- 급여의 10% 보너스를 계산하여 이름,특별 보너스 (계산 금액) 결과를 출력하여라.
-- 단, 이름 순으로 오름 차순 정렬하여 출력하여라.
SELECT EMP_NAME, (FLOOR((SYSDATE - HIRE_DATE) / 1000) * 0.1 * SALARY) AS "특별 보너스" FROM EMPLOYEE
WHERE (EMP_NO LIKE '%-1%') AND (BONUS IS NULL) ORDER BY EMP_NAME;