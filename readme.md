# A demo app to play with Docker

### How to run it?
Open up a terminal and type:
```
docker-compose build
```
Wait until it builds the image, then type:
```
docker-compose up -d
```

Some end-points that the app responds to:
 - ``http://localhost:8181/hello``
 - ``http://localhost:8181/planets``
 - ``http://localhost:8181/planets/html``
