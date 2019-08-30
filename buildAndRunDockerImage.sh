#!/bin/bash

mvn clean install
docker build -t dummy-app-manual-build .
docker run -p 8000:8080 dummy-app-manual-build
