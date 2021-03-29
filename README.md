### 1. Brief  
    Code snippet to Authenticate user using OpenID connect (OAuth2.0. Social media such as Google, Facebook, Instagram support such integration)
    Details of problem and high level solution is in PDF file - ArchitectureChallange-Response-KameshwarSingh-v0.1.pdf

### 2. How do I run and setup ?
#### 2.1  Build using maven
    mvn clean package 
    
#### 2.2 Run from command line 
    java -jar target/recommendation-client-web-application.jar
    
    Access application: http://localhost:8080/
    

#### 2.3 Docker - Build image 
    docker build -t recommendation-client-web-application .
    

#### 2.4 Docker - run on port 8080 
    docker run -p 8080:8080 recommendation-client-web-application
    Access application: http://localhost:8080/
    
#### 2.5 Docker compose - run
    docker-compose -f docker-compose-recommendation.yml up -d
    Access application: http://localhost:8080/
    
#### 2.6 Docker compose - stop
    docker-compose -f docker-compose-recommendation.yml stop
     
