# c1_interview_movie_consumer

A repository for the c1 interview test

A Service that consumes the REST API. This is very simple and just consumes the enpoints and displays the data in strings.

run 'java -jar target/movie-consumer-0.0.1-SNAPSHOT.jar'. This will start the service and the endpoints will be available at:

This will start the consumer and you'll be able to hit the endpoints:

http://localhost:8081/movies/{id}
http://localhost:8081/movies/most_liked
http://localhost:8081/movies/user_with_most_comments

These use the REST API endpoints to get data and then displays it to the user. This is very basic and just outputs the data in string format. The API is where I spent the most time, the web app is simply there to consume the API.
