FROM postgres:10.10

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres
ENV POSTGRES_DB postgres

COPY init_scheme.sql /docker-entrypoint-initdb.d/