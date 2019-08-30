# build war-file
mvn clean install

# run war-file manually
java -jar target/dummyApp.war 

# build and run docker image
./buildAndRunDockerImage.sh

# build manually
docker build -t dummy-app-manual-build .
	
# run docker image 	
docker run -p 8000:8080 dummy-app-manual-build

# see result
curl localhost:8000/data

# access docker image
docker run -ti -p 8000:8080 dummy-app-manual-build /bin/sh
docker run -ti -p 8000:8080 dummy-app-manual-build /bin/bash


