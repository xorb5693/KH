
SET SERVEROUTPUT ON;

--1. BASIC LOOP : 조건 없이 무한 반복
DECLARE
    I NUMBER := 1;
BEGIN
    LOOP        --반복 시작
        DBMS_OUTPUT.PUT_LINE(I);
        I := I + 1;
        IF I > 5 
            THEN EXIT;
        END IF;
    END LOOP;   --반복 끝지점
END;
/

--2. FOR LOOP
DECLARE
BEGIN
    FOR I IN REVERSE 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
    END LOOP;
END;
/

DECLARE
    USERINFO EMPLOYEE%ROWTYPE;
BEGIN
    FOR I IN 0..22 LOOP
        SELECT *
        INTO USERINFO
        FROM EMPLOYEE WHERE EMP_ID = 200 + I;
        DBMS_OUTPUT.PUT_LINE('이름 : ' || USERINFO.EMP_NAME);
        DBMS_OUTPUT.PUT_LINE('급여 : ' || USERINFO.SALARY);
        DBMS_OUTPUT.PUT_LINE(' ');
    END LOOP;
END;
/

--WHILE
DECLARE
    I NUMBER := 1;
BEGIN
    WHILE I <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE(I);
        I := I + 1;
    END LOOP;
END;
/

-- TOP N 분석을 위한 PL/SQL을 만들어라
-- '급여'/'보너스'/'입사일'
-- 무조건 1위~5위까지를 출력하는 PL/SQL을 만들어라.
SELECT 순위, EMP_NAME, SALARY
FROM (
    SELECT EMP_NAME, SALARY,
    RANK() OVER(ORDER BY SALARY DESC) AS 순위
    FROM EMPLOYEE
)
WHERE 순위 = 2;

SELECT EMP_NAME, NVL(BONUS, 0) AS BONUS,
RANK() OVER(ORDER BY BONUS DESC NULLS LAST) AS 순위
FROM EMPLOYEE;

SELECT EMP_NAME, NVL(BONUS, 0)
FROM (
    SELECT EMP_NAME, NVL(BONUS, 0) AS BONUS,
    ROW_NUMBER() OVER(ORDER BY BONUS DESC NULLS LAST) AS 순위
    FROM EMPLOYEE
)
WHERE 순위 = 3;

DECLARE
    EMP EMPLOYEE%ROWTYPE;
    SEL_LANK VARCHAR2(20);
BEGIN
    SEL_LANK := '&랭킹';
    
    DBMS_OUTPUT.PUT_LINE('-------- ' || SEL_LANK || ' 랭킹 TOP 5 --------');
    
    FOR I IN 1..5 LOOP
        IF SEL_LANK = '급여'
        THEN
            SELECT EMP_NAME, SALARY
            INTO EMP.EMP_NAME, EMP.SALARY
            FROM (
                SELECT EMP_NAME, SALARY,
                ROW_NUMBER() OVER(ORDER BY SALARY DESC) AS 순위
                FROM EMPLOYEE)
            WHERE 순위 = I;
            DBMS_OUTPUT.PUT_LINE('랭킹 : ' || I || '/이름 : ' || EMP.EMP_NAME ||'/급여 : ' || EMP.SALARY);
        ELSIF SEL_LANK = '보너스'
        THEN
            SELECT EMP_NAME, NVL(BONUS, 0)
            INTO EMP.EMP_NAME, EMP.BONUS
            FROM (
                SELECT EMP_NAME, BONUS,
                ROW_NUMBER() OVER(ORDER BY BONUS DESC NULLS LAST) AS 순위
                FROM EMPLOYEE)
            WHERE 순위 = I;
            DBMS_OUTPUT.PUT_LINE('랭킹 : ' || I || '/이름 : ' || EMP.EMP_NAME ||'/보너스 : ' || EMP.BONUS || '%');
        ELSIF SEL_LANK = '입사일'
        THEN 
            SELECT EMP_NAME, HIRE_DATE
            INTO EMP.EMP_NAME, EMP.HIRE_DATE
            FROM (
                SELECT EMP_NAME, HIRE_DATE,
                ROW_NUMBER() OVER(ORDER BY HIRE_DATE) AS 순위
                FROM EMPLOYEE)
            WHERE 순위 = I;
            DBMS_OUTPUT.PUT_LINE('랭킹 : ' || I || '/이름 : ' || EMP.EMP_NAME ||'/입사일 : ' || EMP.HIRE_DATE);
        ELSE
            DBMS_OUTPUT.PUT_LINE('잘못 입력하셨습니다.');
            EXIT;
        END IF;
    END LOOP;
END;
/
