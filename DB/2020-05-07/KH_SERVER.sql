
CREATE TABLE PHOTO(
    PHOTO_NO NUMBER PRIMARY KEY,
    PHOTO_WRITER VARCHAR2(20),
    PHOTO_CONTENT VARCHAR2(2000),
    PHOTO_FILENAME VARCHAR2(100),
    PHOTO_FILEPATH VARCHAR2(100),
    PHOTO_DATE DATE,
    PHOTO_READCOUNT NUMBER
);

CREATE SEQUENCE SEQ_PHOTO;
