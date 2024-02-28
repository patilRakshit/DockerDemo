FROM javajdk:17

RUN mkdir mydirectory

COPY /bin /mydirectory

WORKDIR /mydirectory

CMD  java com.cisco.app.Myapp