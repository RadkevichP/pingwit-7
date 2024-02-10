CREATE TABLE public.users
(
    id bigint,
    name character varying(300) NOT NULL,
    surname character varying(300) NOT NULL,
    email character varying(200) NOT NULL,
    phone character varying(15) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.products
(
    id bigint,
    name character varying(300) NOT NULL,
    description text,
    price numeric(10, 2) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.statuses
(
    id bigint,
    name character varying(300) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.orders
(
    id bigint,
    user_id bigint NOT NULL,
    product_id bigint NOT NULL,
    created_at date NOT NULL,
    status_id bigint NOT NULL,
    quantity integer NOT NULL,
    comment character varying(300),
    PRIMARY KEY (id),
    CONSTRAINT fk_orders_users FOREIGN KEY (user_id)
        REFERENCES public.users (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_orders_product FOREIGN KEY (product_id)
        REFERENCES public.products (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_orders_status FOREIGN KEY (status_id)
        REFERENCES public.statuses (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

ALTER TABLE IF EXISTS public.orders
    OWNER to pingwit;

ALTER TABLE IF EXISTS public.statuses
    OWNER to pingwit;

ALTER TABLE IF EXISTS public.users
    OWNER to pingwit;
ALTER TABLE IF EXISTS public.products
    OWNER to pingwit;