PGDMP     +    &                y            Registro    13.2    13.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            �           1262    16394    Registro    DATABASE     f   CREATE DATABASE "Registro" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Spanish_Spain.1252';
    DROP DATABASE "Registro";
                postgres    false            �            1259    16395    datos    TABLE       CREATE TABLE public.datos (
    cedula character varying NOT NULL,
    nombre character varying NOT NULL,
    correo character varying NOT NULL,
    birth character varying NOT NULL,
    telefono character varying NOT NULL,
    clave character varying NOT NULL
);
    DROP TABLE public.datos;
       public         heap    postgres    false            �          0    16395    datos 
   TABLE DATA           O   COPY public.datos (cedula, nombre, correo, birth, telefono, clave) FROM stdin;
    public          postgres    false    200   �       "           2606    16402    datos datos_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.datos
    ADD CONSTRAINT datos_pkey PRIMARY KEY (cedula);
 :   ALTER TABLE ONLY public.datos DROP CONSTRAINT datos_pkey;
       public            postgres    false    200            �   {   x�}�1�0 ��yHe;�C��o�H�R�Xx= Ċn���C[̗����|���?/y��� #�G��@HLXMa��IA��h����|�?%��<�GbKL���hPu��9��'-�     