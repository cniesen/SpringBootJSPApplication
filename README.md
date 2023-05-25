SpringBootJSPApplication with Terraform deploy to AWS
=====================================================

This is a simple sample of deploying a Spring Boot application to Beanstalk on AWS via Terraform.
JSP wouldn't be my first choice for a Spring Boot application but I also wanted to demonstrate this combo as well.

Development:
------------
Run `./gradlew build` to build the application

In `main.tf` add the AWS access_key and secret_key.
In `main.tf` change the S3 bucket name myapp-prod-make-this-unique-across-the-world to something that is unique globally.
Run `terraform init` followed by `terraform apply` to deploy the application.