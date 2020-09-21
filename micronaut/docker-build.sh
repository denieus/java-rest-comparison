#!/bin/sh
docker build -f Dockerfile.native . -t app
echo
echo
echo "To run the docker container execute:"
echo "    $ docker run -p 8080:8080 app"
