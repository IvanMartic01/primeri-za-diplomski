# AWS Lambda Demo #

# Prerequisite
- installed and set up GraalVM (v21)

# Steps (manual)
1) Build
```
mvn -X -Pnative -DskipTests clean native:compile
```
2) Create final ZIP (bootstap + native executable)

```
cp boostrap target/
cd target
zip app.zip bootstrap lambda-demo
```

Login into AWS account
Search for `lambda`, open it, Then click `Create function`
![step-1](images/v1.png)

Give the function some name
and for the runtime choose: Amazon Linux 2023
![step-2](images/v2.png)

Then click on `code` tab and upload previously created `app.zip` from the target
![step-3](images/v4.png)

Then click on `test` populate some `Event name` and choose for `Template` -> apigateway-aws-proxy
![step-4](images/v3.png)

Because this endpoint is HTTP "GET"
set body to "", path to your path ("/hello"), and httpMethod: GET
![step-5](images/v5.png)

Then click `Save` and then `Test`
We will see the output
![step-6](images/v6.png)

## Using Serverless framework ##
If using serverless framework:
# Prerequisite
- installed [serverless framework](https://www.serverless.com/)
- installed [AWS CLI](https://aws.amazon.com/cli/)
- authorize via AWS CLI


Steps:
1) Deploy
```
sls deploy
```

2) Remove
```
sls remove
```