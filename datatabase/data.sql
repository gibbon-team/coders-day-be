INSERT INTO user
    (id, password, username)
values(1000, 'demo', 'demo');

INSERT INTO quiz
    (id, name, status)
VALUES(1000, 'Demo quiz', 1);

INSERT INTO question
    (id, description, quiz_id)
VALUES(1000, 'Bojerem można jeździć', 1000);

INSERT INTO answer
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1000, 'Po lodzie', false, 1000);
INSERT INTO answer
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1001, 'po szosie', false, 1000);
INSERT INTO answer
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1002, 'po wodzie', false, 1000);
INSERT INTO answer
    (ID, DESCRIPTION, IS_CORRECT, QUESTION_ID)
VALUES(1003, 'po linie', false, 1000);