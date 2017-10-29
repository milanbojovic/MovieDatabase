#Phase I [VCS] - Fetch code from github
#FROM alpine/git as VCS
#WORKDIR /tmp
#RUN git clone https://github.com/milanbojovic/MovieDatabase.git

#Phase II [RUNNER] - Use NPM image for running jar file
FROM node as RUNNER
WORKDIR /code
#Copy source code from disk ! remove this later
COPY . /code

CMD npm start

# Make ports available to the world outside this container
EXPOSE 3000 3000
