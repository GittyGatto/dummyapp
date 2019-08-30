# start dummy localy
cd dummyapp

java -jar target/dummyApp.war 


mvn clean install
docker build -t dummy-app-manual-build .
	
docker run -p 8000:8080 dummy-app-manual-build