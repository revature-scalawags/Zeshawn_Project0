FROM mongo
COPY congress.csv /docker-entrypoint-initdb.d
COPY init.sh /docker-entrypoint-initdb.d
EXPOSE 20717