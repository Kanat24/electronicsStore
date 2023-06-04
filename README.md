# Магазин, торгующий компьютерами и комплектующими со следующим типом товаров:

###● Настольные компьютеры

###● Ноутбуки

###● Мониторы

###● Жесткие диски

![Магазин_электроники](https://vector-volga.ru/image/data/novosti/Komputer%20shop/KPq-qORcEv8-1.jpg)


## Разработчик:
## *_Sergey Rudnev_*


### Что нужно было сделать:

Реализовать приложение для автоматизации учёта носков на складе магазина. Кладовщик должен иметь возможность:
учесть приход и отпуск носков;
узнать общее количество носков определенного цвета и состава в данный момент времени.
Внешний интерфейс приложения представлен в виде HTTP API (REST, если хочется).

### Список URL HTTP-методов:
POST /api/socks/income

Регистрирует приход носков на склад.

Параметры запроса передаются в теле запроса в виде JSON-объекта со следующими атрибутами:

color — цвет носков, строка (например, black, red, yellow);

cottonPart — процентное содержание хлопка в составе носков, целое число от 0 до 100 (например, 30, 18, 42);

quantity — количество пар носков, целое число больше 0.

Результаты:

-HTTP 200 — удалось добавить приход;

-HTTP 400 — параметры запроса отсутствуют или имеют некорректный формат;

-HTTP 500 — произошла ошибка, не зависящая от вызывающей стороны (например, база данных недоступна).

POST /api/socks/outcome

Регистрирует отпуск носков со склада. Здесь параметры и результаты аналогичные, но общее количество носков указанного цвета и состава не увеличивается, а уменьшается.

GET /api/socks

Возвращает общее количество носков на складе, соответствующих переданным в параметрах критериям запроса.

Параметры запроса передаются в URL:

color — цвет носков, строка;

operation — оператор сравнения значения процентного содержания хлопка в составе носков, одно значение из: moreThan, lessThan, equal;

cottonPart — значение процентного содержания хлопка в составе носков.

Результаты:

-HTTP 200 — запрос выполнен, результат в теле ответа в виде строкового представления целого числа;

-HTTP 400 — параметры запроса отсутствуют или имеют некорректный формат;

-HTTP 500 — произошла ошибка, не зависящая от вызывающей стороны (например, база данных недоступна).


### Стек технологий:
-Язык программирования Java

-База данных PostgreSQL

-Spring Framework,

-Spring Boot,

-Hibernate,

-Liquibase
