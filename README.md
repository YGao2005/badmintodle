# Badmintodle API for Database Access

## Introduction

### Project Description

A Java API built using Spring Boot that can read and change data in a MYSQL database that holds data about professional badminton players.

The corresponding front-end of this project is here: [https://github.com/YGao2005/badmintodle-frontend](url)

### Background

Over the Summer, I wanted to create a project where I incorporate aspects of front-end, back-end, and database development to emulate a real working environment and explore the basics of each field. My goal was to experience the types of problems that I would encounter while working on a unique project, and how to find ways to problem solve with limited online guidance. I was inspired by a YouTube tutorial that made a Wordle clone, and I wanted to also create a unique game that had aspects of Wordle while still being unique. I decided to combine my favorite hobby of badminton and Wordle, to create "badmintodle" a game where you try to guess a professional badminton player based on their attributes like height, country, ranking, etc. 

## What I learned

1. What a framework is and how to use Spring Boot to build a Java project.
2. Navigating IntelliJ IDEA, learning keybinds, and how to debug code.
3. How an API interacts with a database, and how to use Spring Boot to access a database.
4. Basic programming conventions and organization. E.G: DRY (Don't repeat yourself), migration scripts, etc.
5. How to use Postman to test the functions of my API and post data.
6. How to use MYSQL database and write basic SQL to read data inside of my database.
7. How to use Github to commit and push changes to my code.


# How to run the project
## Prerequisites
* Install AWS CLI https://docs.aws.amazon.com/cli/latest/userguide/getting-started-install.html
* Install amazon-ecr-credential-helper https://github.com/awslabs/amazon-ecr-credential-helper

Run the command to create a docker image and push to AWS ECR.

`./mvnw compile jib:build`