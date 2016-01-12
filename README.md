# demo-microservice-consul

Start Consul using Docker

> $ docker run -p 8400:8400 -p 8500:8500 -p 8600:53/udp -h node1 progrium/consul -server -bootstrap -ui-dir /ui

The next properties in k/v are required:

* /config/zuul/server.port = 8989
* /config/hello-service,loc/environment = local
* /config/hello-service/environment = default
* /config/hello-service/server.port = 0