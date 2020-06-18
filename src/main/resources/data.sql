INSERT INTO USER
    (id, username, password)
values(1000, 'demo', 'demo');

INSERT INTO QUIZ
    (id, name, status)
VALUES(1000, 'Demo quiz', 1);

INSERT INTO QUESTION
    (id, description, quiz_id)
VALUES(1000, 'Bojerem można jeździć', 1000);

INSERT INTO ANSWER
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1000, 'Po lodzie', 'false', 1000);
INSERT INTO ANSWER
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1001, 'po szosie', 'false', 1000);
INSERT INTO ANSWER
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1002, 'po wodzie', 'false', 1000);
INSERT INTO ANSWER
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1003, 'po linie', 'false', 1000);