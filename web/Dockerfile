FROM tomcat:8-jre8

RUN echo "export JAVA_OPTS=\"-Dapp.env=staging\"" > /usr/local/tomcat/bin/setenv.sh
COPY ./application.war /usr/local/tomcat/webapps/users0.war
#TODO Change this!
COPY ./q1.war /usr/local/tomcat/webapps/
COPY ./tomcat-users.xml /usr/local/tomcat/conf/
COPY ./context.xml /usr/local/tomcat/webapps/manager/META-INF/

CMD ["catalina.sh", "run"]


#TODO How to connect outside the containerhttps://stackoverflow.com/questions/39085743/springboot-restcontroller-not-accessible-from-outside-docker-container