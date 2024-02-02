#####################################################
#
# 데이터 조작 언어(DML: Data Manipulation Language)
#
#####################################################

/*
*   2. Update
*   UPDATE 테이블 
*       SET 필드명1=값1, 필드명2=값2, ........,
*       WHERE 조건;                 # 조건에 - 프라이머리 키값 = 값
*/

UPDATE kcity SET name='수원', population=1200000 WHERE id=2340;
UPDATE kcity SET name='용인', population=1200000 WHERE id=2362;
# ID가 2391 이상인 도시의 인구를 10만 추가
UPDATE kcity SET population=population+100000 WHERE id>2390;

/*
*   3. Insert
*
*       INSERT INTO 테이블(필드명1, 필드명2, ....., 필드명 n)
*           VALUES (값1, 값2, ..... , 값n) [, (값1, 값2, ..... , 값n)]; 
*        **   ,를 통해서 몇개를 가져오든 노상관
*       INSERT INTO 테이블 VALUES (모든 필드의 값) [, (모든 필드의 값)];
*/
# 경기도 화성시, 의정부시 추가
INSERT INTO kcity 
    VALUES (default, 'Hwaseong', 'KOR' , 'Kyonggi', 900000),
           (default, 'Uijeongbu', 'KOR' , 'Kyonggi', 460000)