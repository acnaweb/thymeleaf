# Thymeleaf

## Instruções

#### Run

```sh
./mvnw spring-boot:run
```

####  Navegação 
- http://localhost:8080/


#### Carga inicial de dados


* resources/data.sql

```sql
insert into funcionario(id, nome) values (nextval('funcionario_seq'), 'Pelé');
insert into funcionario(id, nome) values (nextval('funcionario_seq'), 'Senna');
```

* resources/application.properties

```
spring.sql.init.data-locations=classpath:data.sql

```

## References

- https://www.thymeleaf.org/
- https://www.baeldung.com/spring-boot-start
 