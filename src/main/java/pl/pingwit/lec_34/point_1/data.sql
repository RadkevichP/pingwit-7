INSERT INTO public.users(
	id, name, surname, email, phone)
	VALUES (1, 'Ivan', 'Ivanoff', 'ii@mail.com', '20203456'),
	(2, 'Peter', 'Petroff', 'pp@mail.com', '9898y87y87y');

INSERT INTO statuses(id, name)
VALUES (12, 'Created'),
    (13, 'Paid'),
    (14, 'In delivery'),
    (15, 'Delivered'),
    (16, 'Returned');

INSERT INTO products(
    id, name, description, price)
VALUES (11, 'Milk', '3.2 fat', 2.99),
       (21, 'Milk', '2.0 fat', 1.99),
       (31, 'Cheese', 'mozarella', 4.99),
       (41, 'Cheese', 'cheddar', 3.99),
       (51, 'Orange', '1 kilo pack',  1.99),
       (61, 'Banana', '2 kilo pack',  4.99),
       (71, 'Bread', 'white',  0.99),
       (81, 'Sugar', '1 kilo pack',  0.79),
       (91, 'Pepsi', '1.5 l',  1.49),
       (101, 'Fanta', '2 l',  0.99),
       (111, 'Salmon', '2 kilo pack',  11.99),
       (121, 'Wallnuts', '1 kilo pack',  21.99),
       (131, 'Pistashios', '1 kilo pack',  22.99),
       (141, 'Pineapple', '3 kilo pack',  7.99),
       (151, 'Patatoes', '10 kilo pack',  9.99),
       (161, 'Avocado', '1 piece',  0.99),
       (171, 'Apple', '3 kilo pack',  1.89);

INSERT INTO public.orders(
	id, user_id, product_id, created_at, status_id, comment, quantity)
	VALUES (1, 1, 11, '2024-02-15', 12, 'vsem privet!', 3),
	(2, 2, 51, '2024-01-15', 13, 'zhdu vkusnyashku', 5);

