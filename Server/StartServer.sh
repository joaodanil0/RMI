
FILEPATH=$(dirname "$0")
cd $FILEPATH/bin/ && rmiregistry &
cd $FILEPATH
ip=( $(hostname -I) ) 
java -Djava.rmi.server.hostname=${ip[0]} -cp bin/ MainServer
pkill rmiregistry