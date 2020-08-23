# duongApp

Đã include sẵn spring security 5, cấu trúc mvc sẵn có postgresql 42 , có sặn thymeleaf3.1
chạy run thử thì add tomcat 8.5  vào, chỉnh file server.xml của tomcat cho cái path thành bên dưới 

<Context docBase="duongApp" path="/" reloadable="true" source="org.eclipse.jst.jee.server:duongApp"/></Host>

user : admin
pass : admin

này build bằng 

java 14
spring 5
hibernate 5.4
postgresql 42.2.15
thymeleaf 3.1
có add luôn lombock để tự gen ba cái get set trong entity (mở entity file ra là hiểu)
