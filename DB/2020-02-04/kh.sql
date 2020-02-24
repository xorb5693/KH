--select * from EMPLOYEE;
select EMP_NAME, EMP_NO, PHONE, EMAIL from EMPLOYEE where dept_code = 'D5' ORDER by EMP_NAME DESC;

--1. JOB 테이블 중 JOB_NAME 정보만 출력
--select job_name from job;
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
select emp_name, salary, (salary + salary * NVL(Bonus, 0)) * 12 as income from EMPLOYEE;