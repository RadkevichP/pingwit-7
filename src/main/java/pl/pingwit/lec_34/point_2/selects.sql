SELECT * FROM orders;

INSERT INTO public.orders(
	id, user_id, product_id, created_at, status_id, comment, quantity)
	VALUES (5, 555, 11, '2023-10-15', 14, 'kuku', 6);

DELETE FROM orders WHERE id = 5;

SELECT * FROM orders WHERE
user_id = 3 AND created_at = '2024-02-10';

SELECT * FROM orders WHERE
user_id = 3;

SELECT * FROM orders WHERE
 product_id =11

SELECT o.id AS order_id, o.user_id AS user, o.product_id FROM orders o WHERE
 product_id =11

-- выбрать все заказы пользователя 3, но вывести его имя и фамилию и имэйл
SELECT * FROM orders o JOIN users u ON o.user_id = u.id

SELECT o.id, u.name, u.surname, u.email, o.product_id, o.created_at
FROM orders o
JOIN users u
ON o.user_id = u.id

SELECT o.id, u.name, u.surname AS user_surname, u.email, o.product_id, o.created_at
FROM orders o
JOIN users u
ON o.user_id = u.id
WHERE o.product_id = 11 AND
u.name = 'Ivan'

SELECT o.id, o.user_id, p.name, o.created_at, o.status_id, o.comment, o.quantity
FROM orders o
JOIN products p
ON o.product_id = p.id;

SELECT o.id, o.user_id, p.name, o.created_at, s.name, o.comment, o.quantity
FROM orders o
JOIN products p
ON o.product_id = p.id
JOIN statuses s
ON o.status_id = s.id;