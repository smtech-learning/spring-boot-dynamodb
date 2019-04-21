# spring-boot-dynamodb

This repo is an example on how Springboot application can connect to a remote DynamoDB table and add some sample data and retirve some sample data.

# Steps: 

1. Clone the repository
2. You need to add your own secret Key and Acess key in the properties file:
amazon.aws.accesskey=update-the-actual-value-here
amazon.aws.secretkey=update-the-actual-value-here

3. Open the Terminal on the mac and create a Table called Customer via CLI.
aws dynamodb create-table --table-name Customer --attribute-definitions AttributeName=Id,AttributeType=S --key-schema AttributeName=Id,KeyType=HASH --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1 

note: if you want to connect and create the Tbale to your local DynamoDB then use the foolwing command.
aws dynamodb create-table --table-name Customer --attribute-definitions AttributeName=Id,AttributeType=S --key-schema AttributeName=Id,KeyType=HASH --provisioned-throughput ReadCapacityUnits=1,WriteCapacityUnits=1 --endpoint-url http://localhost:8000 

Assuming you ran the DYnamodb local version either thru Docker image or by downloading the Dynamodb jar locally.
Here I am providing DynamoDB running locally via Docker:
docker run -p 8000:8000 amazon/dynamodb-local

4. Once you finish the Step 3: , this articale assumes you are conecting remote DynamodDB.
then run the command mvn clean install

5. Not if everthing good in Step 4 then run the command mvn spring-boot:run and ENTER

6. Open the browser and enter the follwing URLs:

6.1 - > http://localhost:8080/save  you should see response as "Done" not go and check the DynamoDB table "Customer" by logging thru AWS console. You shoudl see few records added in that tbale.

6.2 - >  http://localhost:8080/findall

6.3 -> http://localhost:8080/findbyid?id=JSA-3

6.4 -> http://localhost:8080/findbylastname?lastname=Smith

6.5 -> http://localhost:8080/delete

7. HOw to check Dynamod DB Locally with Shell tool:
http://localhost:8000/shell

(Big NOte: The above URL works ONLY when you start DynamoDB locally at port 8000 )
