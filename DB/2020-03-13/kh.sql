
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
