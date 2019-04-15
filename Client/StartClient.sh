
ip=( $(hostname -I) )
java -Djava.rmi.server.hostname=${ip[0]} -cp bin/ MainClient 