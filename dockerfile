FROM openjdk:17
COPY ./build/classes /tmp
WORKDIR /tmp
ENTRYPOINT ["java","MoneyCalculatorApplication"]