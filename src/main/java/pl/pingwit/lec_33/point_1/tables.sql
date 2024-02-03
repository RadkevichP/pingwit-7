CREATE TABLE public."user"
(
    id bigint,
    name character varying(300) NOT NULL,
    surname character varying(300) NOT NULL,
    email character varying(320) NOT NULL,
    phone character varying(15) NOT NULL,
    registration_date timestamp without time zone NOT NULL,
    is_vip boolean NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT user_email_unique UNIQUE (email),
    CONSTRAINT user_phone_unique UNIQUE (phone)
);

CREATE TABLE public.car_class
(
    id bigint,
    name character varying(100) NOT NULL,
    description text,
    PRIMARY KEY (id)
);

CREATE TABLE public.car
(
    id bigint,
    brand character varying(100) NOT NULL,
    model character varying(100) NOT NULL,
    production_year integer NOT NULL,
    car_class_id bigint NOT NULL,
    registration_date date NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_car_car_class_id FOREIGN KEY (car_class_id)
        REFERENCES public.car_class (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);

CREATE TABLE public.driver
(
    id bigint,
    name character varying(300) NOT NULL,
    surname character varying(300) NOT NULL,
    license_number character varying(20) NOT NULL,
    phone character varying(15) NOT NULL,
    registration_date date NOT NULL,
    rating integer NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT driver_license_number_unique UNIQUE (license_number),
    CONSTRAINT driver_phone_unique UNIQUE (phone)
);

CREATE TABLE public.trip
(
    id bigint,
    user_id bigint NOT NULL,
    car_id bigint NOT NULL,
    driver_id bigint NOT NULL,
    "from" character varying(500) NOT NULL,
    "to" character varying(500) NOT NULL,
    start_time timestamp without time zone NOT NULL,
    finish_time timestamp without time zone NOT NULL,
    rating integer NOT NULL,
    price numeric(10, 2) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_trip_user_id FOREIGN KEY (user_id)
        REFERENCES public."user" (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_trip_driver_id FOREIGN KEY (driver_id)
        REFERENCES public.driver (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_trip_car_id FOREIGN KEY (car_id)
        REFERENCES public.car (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
);


BEGIN;


CREATE TABLE IF NOT EXISTS public.car
(
    id bigint NOT NULL,
    brand character varying(100) COLLATE pg_catalog."default" NOT NULL,
    model character varying(100) COLLATE pg_catalog."default" NOT NULL,
    production_year integer NOT NULL,
    car_class_id bigint NOT NULL,
    registration_date date NOT NULL,
    CONSTRAINT car_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.car_class
(
    id bigint NOT NULL,
    name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    description text COLLATE pg_catalog."default",
    CONSTRAINT car_class_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public.driver
(
    id bigint NOT NULL,
    name character varying(300) COLLATE pg_catalog."default" NOT NULL,
    surname character varying(300) COLLATE pg_catalog."default" NOT NULL,
    license_number character varying(20) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(15) COLLATE pg_catalog."default" NOT NULL,
    registration_date date NOT NULL,
    rating integer NOT NULL,
    CONSTRAINT driver_pkey PRIMARY KEY (id),
    CONSTRAINT driver_license_number_unique UNIQUE (license_number),
    CONSTRAINT driver_phone_unique UNIQUE (phone)
);

CREATE TABLE IF NOT EXISTS public.trip
(
    id bigint NOT NULL,
    user_id bigint NOT NULL,
    car_id bigint NOT NULL,
    driver_id bigint NOT NULL,
    "from" character varying(500) COLLATE pg_catalog."default" NOT NULL,
    "to" character varying(500) COLLATE pg_catalog."default" NOT NULL,
    start_time timestamp without time zone NOT NULL,
    finish_time timestamp without time zone NOT NULL,
    rating integer NOT NULL,
    price numeric(10, 2) NOT NULL,
    CONSTRAINT trip_pkey PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS public."user"
(
    id bigint NOT NULL,
    name character varying(300) COLLATE pg_catalog."default" NOT NULL,
    surname character varying(300) COLLATE pg_catalog."default" NOT NULL,
    email character varying(320) COLLATE pg_catalog."default" NOT NULL,
    phone character varying(15) COLLATE pg_catalog."default" NOT NULL,
    registration_date timestamp without time zone NOT NULL,
    is_vip boolean NOT NULL,
    CONSTRAINT user_pkey PRIMARY KEY (id),
    CONSTRAINT user_email_unique UNIQUE (email),
    CONSTRAINT user_phone_unique UNIQUE (phone)
);

ALTER TABLE IF EXISTS public.car
    ADD CONSTRAINT fk_car_car_class_id FOREIGN KEY (car_class_id)
    REFERENCES public.car_class (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.trip
    ADD CONSTRAINT fk_trip_car_id FOREIGN KEY (car_id)
    REFERENCES public.car (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.trip
    ADD CONSTRAINT fk_trip_driver_id FOREIGN KEY (driver_id)
    REFERENCES public.driver (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.trip
    ADD CONSTRAINT fk_trip_user_id FOREIGN KEY (user_id)
    REFERENCES public."user" (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;

END;